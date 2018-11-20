# 注册中心 服务端


## 单机模式
```
java -jar target/spring-cloud-eureka-server-1.0-SNAPSHOT.jar
```

## 集群模式
```
java -jar target/spring-cloud-eureka-server-1.0-SNAPSHOT.jar --spring.config.location=classpath:/application-register1.properties

```


```
java -jar target/spring-cloud-eureka-server-1.0-SNAPSHOT.jar --spring.config.location=classpath:/application-register2.properties

```
```
java -jar target/spring-cloud-eureka-server-1.0-SNAPSHOT.jar --spring.config.location=classpath:/application-register3.properties

```

在执行集群命令时前面两个会报错，是由于其它的集群节点未启动。等待后面集群节点启动完毕后会自动加入

启动完成后访问
http://127.0.0.1:8880
http://127.0.0.1:8881
http://127.0.0.1:8882

从下面的信息可以看出 已经有三个节点。
Application	AMIs	Availability Zones	Status
UNKNOWN	n/a (3)	(3)	UP (3) - 192.168.0.187:8881 , 192.168.0.187:8882 , 192.168.0.187:8880