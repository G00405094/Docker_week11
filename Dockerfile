FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/User-Service-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "User-Service-0.0.1-SNAPSHOT.jar"]
