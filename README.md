# playground-jee8
Messing around with new JEE8 features

## Features tested
This is a list of the features tested in this project.

- [x] Creating JEE8 war and running om Payara Micro 5 
- [ ] Testing new Beans Validation



## How to build
You need Java 8 to build this project.
```
mvn clean        <== will clean the target folder
mvn package      <== will build a runnable jar file at target/fms-metrics-jms.jar
```

## To run locally
Make a local `payara` folder in the root folder og this project and download the
latest Payara Micro v5 jar file there (do **not** add payara micro to git). 

Then run the following command using Java 8.
```
java -jar payara/payara-micro-5.Beta2.jar --nocluster --deploy target/jee8-1.0-SNAPSHOT.war
```
