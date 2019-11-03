FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/miniproject-2.2.0.RELEASE.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=docker","-jar","/app.jar"]