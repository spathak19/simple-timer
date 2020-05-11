FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/TimerToLog.jar
RUN mkdir /camel
WORKDIR /camel
COPY ${JAR_FILE} .
ENTRYPOINT ["java","-jar","TimerToLog.jar"]