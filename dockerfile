FROM adoptopenjdk/openjdk11:latest

WORKDIR /root

COPY target/helloworld-1.1.jar /root/app.jar

EXPOSE 8200

CMD java -Xmx1200m -jar app.jar