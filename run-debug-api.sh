mvn package &&  java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=1044 -jar locate-api-service/target/locate-api-service-0.0.1-SNAPSHOT.jar server locateApiConfiguration.yml 
