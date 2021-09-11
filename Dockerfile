FROM openjdk:15-jdk-slim
ADD /target/devops-0.0.1-SNAPSHOT.jar azure-devops.jar
ENTRYPOINT ["java","-jar","azure-devops.jar"]