package com.speedwatch.speedwatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class SpeedTestService {

    private static final Logger logger = LoggerFactory.getLogger(SpeedTestService.class);
    private static final String IPERF3_SERVICE_URL = "http://iperf3:5201";

    public SpeedTestService() {

    }

    @Async
    // @Scheduled(fixedRate = 180000) // Run every 3 minutes
    public void runSpeedTest() {
        logger.info("Starting speed test...");

        // Send a request to the iperf3 service
        logger.info("Sending request to iperf3 service...");
        RestTemplate restTemplate = new RestTemplate();

        try {
            ResponseEntity<String> response = restTemplate.getForEntity(IPERF3_SERVICE_URL, String.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                logger.info("Speed test completed. Response: {}", response.getBody());
            } else {
                logger.error("Failed to connect to iperf3 service. HTTP status: {}", response.getStatusCode());
            }
        } catch (RestClientException e) {
            logger.error("Failed to connect to iperf3 service. Error: {}", e.getMessage());
        }
    }
}