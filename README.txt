springcloud
   一起玩转springcloud
   架构图
                                                      order(8086)
                                                   /
                      |                          /
                      |                         /
       (8088)zuul |------>  web(8086)---->feign
                      |                         \
                      |                          \
                                                    user(未开发)

                          注册中心（8090）
 代码地址 https://github.com/kimihufc/commoncloudedit.git
 服务器已经安装redis  rabbitmq  mysql jenkins
 部署使用jenkins  http://47.107.225.70:8080/  账户 admin  admin
