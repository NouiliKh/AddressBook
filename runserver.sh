#!/bin/bash

cd server
rm *.class
javac -classpath ../lib/javax.json.jar:./ *.java
rmic -v1.1 TreatmentImpl
rmic -v1.1 FabTreatmentImpl
java -classpath ../lib/javax.json.jar:./ TreatmentServer