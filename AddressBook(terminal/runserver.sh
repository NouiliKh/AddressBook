#!/bin/bash
cd server
java -Djava.security.policy=server.security.policy -Djava.rmi.server.codebase=http://localhost/www/  -classpath ../lib/javax.json.jar:./ TreatmentServer