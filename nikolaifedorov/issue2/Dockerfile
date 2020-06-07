FROM openjdk:8-jdk-alpine
RUN addgroup -S kotlin && adduser -S kotlin -G kotlin
USER kotlin:kotlin
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

