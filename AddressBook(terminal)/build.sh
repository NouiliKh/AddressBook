#!/bin/bash
rm */*.class
cd www
javac -classpath ../lib/javax.json.jar:./ *.java
rmic -v1.1 TreatmentImpl
rmic -v1.1 FabTreatmentImpl
cd ../
cp -r www/ /var/www/html
cd server
javac -classpath ../lib/javax.json.jar:./ *.java
cd ../client
javac -classpath ../lib/javax.json.jar:./ *.java