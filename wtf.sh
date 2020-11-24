#!/bin/bash

path=helloworld-1.1

if [ -d ./${path} ]
then
    rm -rf ${path}/*
else
    mkdir ${path}
fi

mvn clean install
cp target/helloworld-1.1.jar ${path}/app.jar && cd ${path}/

# check for var "Main-Class" existence
jar -xf app.jar && cat META-INF/MANIFEST.MF | grep Main-Class || echo None
cd .. && java -jar ${path}/app.jar
