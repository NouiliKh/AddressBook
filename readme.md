# S.A.R-Project
```

Java RMI Academic Project.
Technologies used : Java , JSON ( javax library) .

```

## How to Use The Project

Server
```
//go to the server rep//
  user$ cd server
//compile all java files .java//
  user$ javac -classpath ../lib/.javax.json.jar:./ *.java
//Generate client and server strains: TreatmentImpl_Stub.class and FabTreatmentImpl_Stub.class//
  user$ rmic -v1.1 TreatmentImpl
//Générer the strains//
  user$ rmic -v1.1 FabTreatmentImpl
//The server is ready //
  user$ java -classpath ../lib/.javax.json.jar:./ TreatmentServer
```
Client
```
//Go to the client rep//
  user$ cd ../client
//Copy TreatmentInterface class in the client repo//
  user$ cp ../server/TreatmentInterface.class .
//Copy the stub  Institution_Stub.class in the client repo //
  user$ cp ../server/TreatmentImpl_Stub.class .
//Copy the interface FabTreatmentInterface.class//
  user$ cp ../server/FabTreatmentInterface.class .
// copy the stub FabTreatmentImpl_Stub.class//
  user$ cp ../server/Fabrique_Stub.class .
// Copy the classe Employee//
  user$ cp ../server/Employee.class .
//Compiler the TreatmentClient.java//
  user$ javac TreatmentClient.java
//client is ready //
  user$ java -classpath ../lib/.javax.json.jar:./ TreatmentClient
```
