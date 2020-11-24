#!/bin/bash

cd ~/IdeaProjects/test-site && rm -rf helloworld-1.1/*
mvn clean install
cp target/helloworld-1.1.jar helloworld-1.1/app.jar && cd helloworld-1.1/
jar -xf app.jar && cat META-INF/MANIFEST.MF | grep Main-Class || echo None
cd ~/IdeaProjects/test-site && java -jar target/helloworld-1.1.jar 

