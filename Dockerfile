# Specify the base image with Java 17
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /src

COPY src/main/resources/data.sql /docker-entrypoint-initdb.d/

# Copy the JAR file to the container
COPY target/MedTrackAPI-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which your Spring Boot application listens
EXPOSE 9092

# Set the entry point command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
