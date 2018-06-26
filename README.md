# SpringCloudTemplate
## spring cloud 构建模板
与springboot模板类似，用于方便构建spring cloud项目
下面是各个模块说明

##### 1、eureka 注册中心
访问地址：[http://127.0.0.1:8761/](http://127.0.0.1:8761/)

##### 2、provider 服务提供者
访问地址：  
[http://127.0.0.1:8762/test](http://127.0.0.1:8762/test)   
[http://127.0.0.1:8763/test](http://127.0.0.1:8763/test)  
服务名称：service-provider

##### 3、feign 负载均衡（包含断路器）
访问地址：[http://127.0.0.1:8765/](http://127.0.0.1:8765/)  
服务名称：service-feign

##### 4、zuul 路由
访问地址：  
[http://127.0.0.1:8769/user](http://127.0.0.1:8769/user/)    
[http://127.0.0.1:8769/back](http://127.0.0.1:8769/back/)  
服务名称：service-zuul

##### 5、configuration 配置中心
访问地址：
[http://127.0.0.1:8888/service-provider-dev.yml](http://127.0.0.1:8888/service-provider-dev.yml)
服务名称：config-server
   


