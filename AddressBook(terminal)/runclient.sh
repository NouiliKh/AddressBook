#!/bin/bash
cd client
java -Djava.security.policy=client.security.policy -Djava.rmi.server.codebase=http://localhost/www/  -classpath ../lib/javax.json.jar:./ TreatmentDynamicClient
