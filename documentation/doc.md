# Run Spring Boot App in a Container 

## Run MySQL Database in Docker Container

### Pull MySQL Image
`docker pull mysql:latest`

### Run Database in Container  
`docker run --name mysqldb -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password mysql:latest`

## Run App Locally

### Build App  

MacOS/Linux:  
`./mvnw spring-boot:run`.    

Windows:  
`mvnw spring-boot:run`

### Test App
`http://localhost:8080/items`

## Docker Compose

### Establish Network between MySQL Container and App Container

Create __docker-compose.yml__ File in Project Root Directory

    version: '3'

    services: 

        mysqldb:
            image: mysql:latest
            environment:
                - MYSQL_ROOT_PASSWORD=password
                - MYSQL_DATABASE=crud
                - MYSQL_USER=alif
                - MYSQL_PASSWORD=password
            ports:
                - 3306:3306

        app:
            image: spring-boot
            depends_on:
                - mysqldb
            ports:
                - 8080:8080
            links:
                - mysqldb
            environment:
                - spring.datasource.url=jdbc:mysql://mysqldb:3306/crud
                - spring.datasource.username=alif
                - spring.datasource.password=password

### Update __application.properties__ File according to the __docker-compose.yml__ File   

    spring.datasource.url=jdbc:mysql://mysqldb:3306/crud
    spring.datasource.username=alif
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update

## Run App in Docker Container

### Run both the MySQL Container and App Container establishing Network between them

`docker-compose up -d`

### Test App

`http://localhost:8080/items`

## Access Containarized Database from Command Line or Terminal

### See Status of the Containers:
`docker ps (copy the ‘NAME’ of the ‘MySQL’ Container)`

### Get Access to the Database Container:
`docker exec -it crud-mysqldb-1 bash -l`

### Log into ‘MySQL’ Database:
`mysql -u root -p`         

### See Data from a Table:
`select * from customers`