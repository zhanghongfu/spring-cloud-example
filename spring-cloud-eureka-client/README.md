# 注册中心 客户端


## 单机模式
```
java -jar target/spring-cloud-eureka-client-1.0-SNAPSHOT.jar
```

## 集群模式
```
java -jar target/spring-cloud-eureka-client-1.0-SNAPSHOT.jar --spring.config.location=classpath:/application-cluster.properties

```

在集群模式中你也可以只配置一个地址
