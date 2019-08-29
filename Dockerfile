FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8989
ADD target/docker-project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]