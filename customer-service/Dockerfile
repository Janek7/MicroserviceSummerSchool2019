FROM openjdk:8u212-jdk-alpine

WORKDIR /usr/src/app
COPY target/*-0.0.1-SNAPSHOT.jar .

EXPOSE 7779

CMD java -jar *.jar