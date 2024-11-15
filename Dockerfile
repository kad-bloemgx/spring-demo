FROM openjdk:24-jdk
ADD target/demo-0.0.1-SNAPSHOT.jar demo-project.jar
ENTRYPOINT ["java", "-jar","demo-project.jar"]
EXPOSE 8090