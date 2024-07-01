package com.speedwatch.speedwatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeedTestController {

    private final SpeedTestService speedTestService;

    @Autowired
    public SpeedTestController(SpeedTestService speedTestService) {
        this.speedTestService = speedTestService;
    }

    @GetMapping("/runSpeedTest")
    public void runSpeedTest() {
        speedTestService.runSpeedTest();
    }
}