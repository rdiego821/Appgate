FROM openjdk:8
EXPOSE 8080
ADD target/appgate-operations-integration.jar appgate-operations-integration.jar
ENTRYPOINT ["java","-jar","/ appgate-operations-integration.jar"]