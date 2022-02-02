FROM maven:3.8.4-openjdk-11-slim
COPY src /app
COPY pom.xml /app
RUN  mvn -f /app/pom.xml clean package -DskipTests
COPY /app/target/microservice2-0.0.1-SNAPSHOT.jar /microservice2.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/microservice2.jar"]

