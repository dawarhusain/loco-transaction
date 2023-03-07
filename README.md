

### Database setup:
```mysql -u root -p
mysql -u root -p
create database locodb;
CREATE USER 'loco'@'localhost' IDENTIFIED BY 'locopass';
GRANT ALL PRIVILEGES ON locodb.* To 'loco'@'localhost';
FLUSH PRIVILEGES;
```

### Deployments:
1. download and unzip
2. cd loco
3. ./mvnw clean install
4. ./mvnw spring-boot:run


### For API requests
1. Use Postman/curl command