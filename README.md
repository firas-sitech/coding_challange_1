#Exercise 1: E2E Application
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