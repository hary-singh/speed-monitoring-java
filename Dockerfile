# Start with a base image containing Alpine (the FROM command)
FROM alpine:latest

# Install OpenJDK 17 JRE
RUN apk --no-cache add openjdk21-jre

# Create a group and user
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

# Tell docker that all future commands should run as the appuser user
USER appuser

# The ARG command defines a variable that users can pass at build-time
ARG JAR_FILE=target/*.jar

# The COPY command copies new files or directories from <src> and adds them to the filesystem of the container at the path <dest>
COPY ${JAR_FILE} app.jar

# The ENTRYPOINT command allows you to configure a container that will run as an executable
ENTRYPOINT ["java","-jar","/app.jar"]