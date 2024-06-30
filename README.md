# SpeedWatch

SpeedWatch is a Java application built with Spring Boot and Gradle. It uses Docker to run speed tests.

## Prerequisites

- Java 21
- Docker
- Gradle

## Getting Started

1. Clone the repository
2. Navigate to the project directory
3. Run `gradle build` to build the project
4. Run `gradle bootRun` to start the application

## Application Configuration

Configuration for the application is located in `src/main/resources/application.yml`. Here you can specify the Docker image name and version to be used for the speed tests.

## Running Speed Tests

The application runs speed tests using the `runSpeedTest` method in `SpeedTestService.java`. This method creates a new Docker container, starts it, waits for the speed test to complete, then stops and removes the container.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.