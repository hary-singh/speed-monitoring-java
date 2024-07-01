package com.speedwatch.speedwatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpeedwatchApplicationTests {

	private final ApplicationContext context;

    SpeedwatchApplicationTests(ApplicationContext context) {
        this.context = context;
    }

    @Test
	void contextLoads() {
		Assertions.assertNotNull(context);
	}

}
