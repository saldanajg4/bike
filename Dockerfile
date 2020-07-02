FROM java:8
LABEL maintainer="saldanajg4@hotmail.com"
VOLUME /tmp
EXPOSE 8080
ADD target/bike-0.0.1-SNAPSHOT.jar bike-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","bike-0.0.1-SNAPSHOT.jar"]