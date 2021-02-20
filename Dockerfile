FROM openjdk:8-jdk-alpine
LABEL maintainer="Mohammed Yehia <mohammedyehia99@gmail.com>"
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]