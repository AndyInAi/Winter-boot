# Winter Boot
一个快速开发 Java Web 框架，告别垃圾类，让开发人员专注业务

```sh


if [ ! -d ~/Winter-boot ]; then cd ~/ && git clone https://github.com/AndyInAi/Winter-boot.git; fi


# 运行

# 以 Tomcat 为例

service tomcat stop

mkdir -p /usr/local/tomcat/webapps/ROOT

cp -f -r ~/Winter-boot/www/* /usr/local/tomcat/webapps/ROOT

service tomcat start

# Starting HTTP server at http://0.0.0.0:8080/


# 测试
curl http://localhost:8080/


```
