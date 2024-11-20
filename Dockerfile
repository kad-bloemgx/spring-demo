FROM openjdk:17-jdk
ADD target/DemoOauth.jar demo-oauth.jar
ENTRYPOINT ["java", "-jar","demo-oauth.jar"]
EXPOSE 8090