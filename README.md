# SpringCloudTemplate
## spring cloud 构建模板
与springboot模板类似，用于方便构建spring cloud项目
下面是各个模块说明

##### 1、eureka 注册中心
访问地址：[http://127.0.0.1:8761/](http://127.0.0.1:8761/)  
简述：启动项目之后，通过地址访问，显示注册中心，看到那些服务注册在上面。

##### 2、provider 服务提供者
访问地址：  
[http://127.0.0.1:8762/test](http://127.0.0.1:8762/test)   
服务名称：service-providers  
[http://127.0.0.1:8763/test](http://127.0.0.1:8763/test)  
服务名称：service-provider  
简述：启动项目后，通过地址访问获得相应信息

##### 3、feign 负载均衡（包含断路器）
访问地址：[http://127.0.0.1:8765/](http://127.0.0.1:8765/)  
服务名称：service-feign  
简述：启动项目后，访问地址，会负载均衡至名称为service-provider的服务（如果service-provider服务存在多个的话）

##### 4、zuul 路由
访问地址：  
[http://127.0.0.1:8769/user](http://127.0.0.1:8769/user/)    
[http://127.0.0.1:8769/back](http://127.0.0.1:8769/back/)  
服务名称：service-zuul  
简述：启动项目后，访问后相应地址路由到相应的服务

##### 5、configuration 配置中心
访问地址：
[http://127.0.0.1:8888/service-provider-dev.yml](http://127.0.0.1:8888/service-provider-dev.yml)  
服务名称：config-server  
简述：启动项目后，访问地址获得相应的配置，配置还可以直接从git上获取，具体见该项目中yml配置
   
##### 6、zipkin 链路监控
访问地址：
[http://127.0.0.1:9411/zipkin/](http://127.0.0.1:9411/zipkin/)  
服务名称：zipkin-server
简述：启动项目后，访问地址获得当前链路监控的信息

##### 7、bus 修改配置后刷新
地址：[http://127.0.0.1:8762/actuator/bus-refresh](http://127.0.0.1:8762/actuator/bus-refresh/)  
需要使用post方式请求  
简述：修改SpringCloudConfig文件夹配置后，直接post请求上述地址就会刷新读取SpringCloudConfig文件夹中的配置


## 启动顺序
rabbitmq -> 注册中心 -> 配置中心 -> 链路监控 -> 服务提供者 -> 路由 -> 负载均衡 
