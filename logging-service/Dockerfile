# Gunakan base image yang lebih ringan dan stabil
FROM openjdk:21-jdk-slim

# Tentukan working directory
WORKDIR /app

# Buat folder log agar tidak error
RUN mkdir -p /logs

# Copy file JAR ke dalam image
COPY ./target/log-service.jar /app/log-service.jar

# Expose port Spring Boot
EXPOSE 8081

# Jalankan aplikasi Spring Boot
ENTRYPOINT ["java", "-jar", "log-service.jar"]
