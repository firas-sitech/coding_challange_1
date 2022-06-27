# For Java 1.8, 
FROM openjdk:8-jdk-alpine

ARG JAR_FILE=crud-service.jar
WORKDIR /opt/app
COPY ./target/${JAR_FILE} /opt/app/

EXPOSE 8080

ENTRYPOINT ["java","-jar","crud-service.jar"]