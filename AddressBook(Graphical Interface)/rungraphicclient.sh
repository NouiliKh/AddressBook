#!/bin/bash
cd ClientGraphicInterface
rm *.class
cp ../server/TreatmentInterface.class .
cp ../server/TreatmentImpl_Stub.class .
cp ../server/FabTreatmentInterface.class .
cp ../server/FabTreatmentImpl_Stub.class .
cp ../server/Employee.class .
javac -classpath lib/jfoenix-9.0.0.jar:../lib/javax.json.jar:./   Main.java
java -classpath lib/jfoenix-9.0.0.jar:../lib/javax.json.jar:./   Main
