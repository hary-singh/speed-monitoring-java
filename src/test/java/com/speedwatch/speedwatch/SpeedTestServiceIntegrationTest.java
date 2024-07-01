package com.speedwatch.speedwatch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public class SpeedTestServiceIntegrationTest {


    private final TestRestTemplate restTemplate;

    public SpeedTestServiceIntegrationTest(TestRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public void runSpeedTest_integration() {
        ResponseEntity<String> response = restTemplate.getForEntity("/runSpeedTest", String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Speed test completed. Response: Success", response.getBody());
    }
}