Virtual LTE server
===========================

Environment
---
Java 1.8<br>
Maven 3.5<br>

Deploy
---
cd {source code root}<br>
mvn package<br>
java -jar ./target/VirtualLTEServer-0.0.1-SNAPSHOT.jar<br>


Statement
---
This app is used to simulate a virtual LTE-B server<br>
server default ip = 8081<br>


v1.0
---
return a response once any client called endpoint "/nbi/deliverysession?id=<DeliverySessionId>" with http POST<br>
