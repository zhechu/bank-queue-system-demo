# 教务系统基础依赖

## 开发环境

### CaaS 容器云平台
机器名    |     ip      | 备注      
:------: | :---------:  | :---------: 
master.ly-sky.com | 192.168.35.100   | 主节点，运行容器本身服务
node1.ly-sky.com | 192.168.35.101   | 从节点，主要运行北影项目地服务
node2.ly-sky.com | 192.168.35.102   | 从节点，主要运行遵义项目地服务
node3.ly-sky.com | 192.168.35.103   | 从节点，主要运行泰州项目地服务

### 基础设施
设施名称   |          地址          | 备注
:-------: | :--------------------: | :---------: 
TechnologyServicePlatform | <http://portal.ly-sky.com:5004/specification.html>   | 联奕技术服务平台（开发规范定义）
CaaS | <http://192.168.35.100:9099/>   | 容器云管理控制台<br>用户名:admin<br>密码:admin
Gitlab | <http://192.168.30.59/>   | 源码版本管理
SVN | <http://svn.ly-sky.com:81/svn/Dev_library/Development/J-教务系统/>   | 研发过程管理
FTP | 192.168.2.12:2121   | 开发工具管理
Jenkins | <http://192.168.30.58:8080/jenkins/>   | 持续集成工具<br>用户名:yutianlong<br>密码:yutianlong
Nexus | <http://192.168.30.58:8081/> | Maven仓库管理<br>用户名:lycea<br>密码:123456
SonarQube | <http://192.168.2.173:9000/> | 代码质量平台
CodeGen | <http://192.168.35.101:17890/> | 代码生成系统
Eureka | <http://192.168.35.101:18761/> | 服务发现注册中心
Config | <http://192.168.35.101:18185/> | 服务统一配置中心<br>访问示例：<br><http://192.168.35.101:18185/tz-edu-core-svc/dev/tzjw>
ConfigRepo | <http://192.168.30.59/ly-cea/ly-cloud-config-repo> | 配置中心仓库
Oracle 11g | 192.168.35.30:1521:orcl  | 教务组开发库
Mysql | 192.168.35.101:13306 | 代码生成器数据库<br>用户名:root<br>密码:ly123456
Redis | 192.168.35.101:16379 | 缓存组件
Harbor | 192.168.2.78:5000 | 联奕镜像仓库