FROM openjdk:17-alpine
LABEL org.opencontainers.authors="Sergy Gavrilov"
WORKDIR /opt/app
ARG JAR_FILE=target/papyrus-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} papyrus-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","papyrus-0.0.1-SNAPSHOT.jar"]