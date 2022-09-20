FROM openjdk:8-jre-slim
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/middleware-registeriptv-iptv-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} middleware-registeriptv-iptv.jar
ENTRYPOINT ["java","-jar","middleware-registeriptv-iptv.jar"]