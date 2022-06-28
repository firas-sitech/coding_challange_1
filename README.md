### Exercise 1: E2E Application

1- Application will be run and executed using the bellow command.</br>
2- Site accessible from url <b> http://localhost:8080 </b>


### Docker Compose Spring Boot and MySQL example
Make suer your docker is up and runing on your local machine

###Run the System
We can easily run the whole with only a single command:
```bash
docker-compose up
```

Docker will pull the MySQL and Spring Boot images (if our machine does not have it before).
The services can be run on the background with command:
```bash
docker-compose up -d
```

###Stop the System
Stopping all the running containers is also simple with a single command:
```bash
docker-compose down
```

###Note 
This application testn Windows you will may face issue related to .env file on iOS
So replace docker-compose.yml content file with following code:
```bash
version: "3.8"

services:
  mysqldb:
    image: mysql:5.7
    container_name: mysql-image
    restart: unless-stopped
    env_file: ./.env
    environment:
      - MYSQL_ROOT_PASSWORD=root
      - MYSQL_DATABASE=student_service
    ports:
      - 3306:3306
    volumes:
      - ./data/logs:/logs
      - ./usr/local/var/mysql:/var/lib/mysql
  
  api:
    depends_on:
      - mysqldb
    links:
      - mysqldb:mysqldb
    container_name: api
    restart: on-failure
    image: studnent-service-img
    build:
      context: ./crud-service
      dockerfile: ./Dockerfile
    ports:
      - 8080:8080
```
