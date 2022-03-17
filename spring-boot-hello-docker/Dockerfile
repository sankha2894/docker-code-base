FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-hello-docker.jar spring-boot-hello-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-hello-docker.jar"]