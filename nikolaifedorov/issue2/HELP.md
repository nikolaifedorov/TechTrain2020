# Getting Started

## Clean
$ ./gradlew clean

## Build jar
$ ./gradlew build

## Run app
$ java -jar build/libs/rest-0.0.1-SNAPSHOT.jar

## Build Docker image and tag it
$ docker build --build-arg JAR_FILE=build/libs/*.jar -t techtrain2020/issue2-kotlin-spring-boot-docker .

## Run Docker image
$ docker run -p 8081:8081 techtrain2020/issue2-kotlin-spring-boot-docker

## DOTO
I use localhost:8080 in container, but app locates outside container.
We need use shared network between Docker containers or use docker-compose.  

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

