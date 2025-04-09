FROM openjdk:21-jdk-slim

WORKDIR /app

RUN mkdir -p /logs

COPY ./target/book-service.jar /app/book-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "book-service.jar"]
