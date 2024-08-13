#STEP 1, AMBIL IMAGE FROM JDK 17
FROM openjdk:17-jdk-alpine

#STEP 2, ATUR LABEL
MAINTAINER enigmacamp.com

#STEP 3, ATUR DIRECTORY KERJA UNTUK APLIKASI
WORKDIR /app

#STEP 4, COPY
COPY ./target/simpletodoapp-0.0.1-SNAPSHOT.jar /app/simpletodoapp-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "./target/simpletodoapp-0.0.1-SNAPSHOT.jar"]