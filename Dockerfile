# Use the official OpenJDK image for Java 17 (hotspot)
FROM openjdk:17-jdk-slim

RUN apt-get update && \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*

VOLUME /tmp
EXPOSE 8080

ADD target/springboot-aws-deploy-service.jar springboot-aws-deploy-service.jar
ENTRYPOINT ["java", "-jar", "/springboot-aws-deploy-service.jar"]
