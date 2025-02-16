FROM  openjdk:23-jdk
WORKDIR /app
COPY target/domain-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]