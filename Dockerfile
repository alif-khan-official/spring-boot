# the ‘jdk’ version must be same as the ‘Java’ version of the ’spring initializer’
FROM adoptopenjdk/openjdk11:alpine-jre 

# copying the ‘.jar’ file and ‘pasting’ in the ‘app.jar’ folder (in container’s ‘file system’)
COPY target/crud-0.0.1-SNAPSHOT.jar app.jar

# starting the app in container from ‘app.jar’ (java -jar target/demo-0.0.1-SNAPSHOT.jar)  	
ENTRYPOINT ["java","-jar","/app.jar"]