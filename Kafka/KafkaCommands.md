# Versions used :
Java : 17 <br/>
Spring Boot : 3 <br/>
Zookeeper: 3.5.7 <br/>
Kafka: 3.5.0 <br/>

## Starting Zookeeper:
```
.\bin\zkServer.cmd
```

## Starting Server in Kafka :
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

## To create a topic :
```
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic cab-location
```

## To start a consumer locally :
```
 .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092  --topic cab-location --from-beginning
```
