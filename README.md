# Spring Cloud
## Apply nacos openfeign Gateway sentinal

```
version: "3.8"
services:
  nacos:
    image: nacos/nacos-server:v2.0.3
    container_name: nacos-standalone
    environment:
      - PREFER_HOST_MODE=hostname
      - MODE=standalone
    volumes:
      - ./standalone-logs/:/home/nacos/logs
    ports:
      - "8848:8848"
      - "9848:9848"
```

## Sentinel

- Download jar package
- ``` java -Dserver.port=9999 -jar sential.jar ```

- Input package 
``` <!-- https://mvnrepository.com/artifact/com.alibaba.cloud/spring-cloud-starter-alibaba-sentinel -->
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
    <version>2021.1</version>
</dependency>

```

### Result:

![image2](https://raw.githubusercontent.com/niuniu268/nacos-gateway-sentinel/master/images/Screenshot2.png)

!<img src="https://raw.githubusercontent.com/niuniu268/nacos-gateway-sentinel/master/images/Screenshot3.png">


