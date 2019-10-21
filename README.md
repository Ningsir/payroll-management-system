# 工资管理系统
1. 使用IntelliJ IDEA 2018.3.1 (Ultimate Edition)版打开程序
2. jdk版本为1.8
3. 使用maven导入pom.xml中的依赖包
4. 配置Tomcat(9.0.16版)
5. 配置数据库：数据库使用的是Mysql（8.0.11版），修改`src\main\resources\properties\db.properties`文件中关于数据库信息的配置，主要修改连接数据库的密码；然后创建数据表，在控制台中使用`mysql -uroot -p -Dpms_db < sql脚本文件目录`(sql脚本文件在源码中)
6. 运行之后，在浏览器中访问`http://localhost:9999/payroll_management_system_war_exploded/login`,登录账号为`admin`,密码为
`1234`,输入账号密码即可进入首页。
