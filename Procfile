web:
    java -jar \
        -Ddw.mongoConfiguration.hosts=$MONGO_HOST \
        -Ddw.mongoConfiguration.port=$MONGO_PORT \
        -Ddw.mongoConfiguration.locateDatabase=$MONGO_DATABASE \
        -Ddw.mongoConfiguration.credentialsDatabase=$MONGO_DATABASE \
        -Ddw.mongoConfiguration.username=$MONGO_USER \
        -Ddw.mongoConfiguration.password=$MONGO_PASSWORD \
        -Ddw.http.port=$PORT \
        locate-api-service/target/locate-api-service-0.0.1-SNAPSHOT.jar server locateApiConfiguration.yml