#!/bin/bash
cd client
rm *.class
cp ../server/TreatmentInterface.class .
cp ../server/TreatmentImpl_Stub.class .
cp ../server/FabTreatmentInterface.class .
cp ../server/FabTreatmentImpl_Stub.class .
cp ../server/Employee.class .
javac TreatmentClient.java
java -classpath ../lib/javax.json.jar:./ TreatmentClient FST
