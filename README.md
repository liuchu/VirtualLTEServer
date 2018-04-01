Virtual LTE server
===========================

Environment
---
Java 1.8
Maven 3.5

Deploy
---
cd {source code root}
mvn package
java -jar ./target/VirtualLTEServer-0.0.1-SNAPSHOT.jar


Statement
---
This app is used to simulate a virtual LTE-B server
server default ip = 8081


v1.0
---
return a response once any client called endpoint "/nbi/deliverysession?id=<DeliverySessionId>" with http POST
