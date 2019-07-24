####
# This Dockerfile is used in order to build a container that runs the Quarkus application in native (no JVM) mode
#
# Before building the docker image run:
#
# mvn package -Pnative -Dnative-image.docker-build=true
#
# Then, build the image with:
#
# docker build -f src/main/docker/Dockerfile.native -t quarkus/getting-started .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 quarkus/getting-started
#
###
# FROM registry.access.redhat.com/ubi8/ubi-minimal
FROM openjdk:8-jdk-alpine
RUN mkdir /work/
RUN mkdir /work/application
WORKDIR /work/
COPY target/*-runner.jar /work/application
RUN chmod 775 /work
EXPOSE 8080
CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]
