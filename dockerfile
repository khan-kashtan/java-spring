FROM adoptopenjdk/openjdk11:latest

WORKDIR /root

COPY target/helloworld-1.1.jar /root/app.jar

EXPOSE 8080

CMD java -Xmx1200m -jar app.jar -Xverify:none --spring.profiles.active=docker