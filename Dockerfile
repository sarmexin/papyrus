FROM openjdk:17-alpine
LABEL org.opencontainers.authors="Sergy Gavrilov"
WORKDIR /opt/app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]