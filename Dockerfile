FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ${JAR_FILE} /app.jar
EXPOSE ${PORT}
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]