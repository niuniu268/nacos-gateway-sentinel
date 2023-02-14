# Spring Cloud
## Apply nacos openfeign Gateway

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



