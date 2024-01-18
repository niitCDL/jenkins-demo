FROM openjdk:17-ea-17-jdk-slim

MAINTAINER "niitCDL"

VOLUME /tmp

EXPOSE 9999

ARG JAR_FILE=target/test-jenkins-backend-demo.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]