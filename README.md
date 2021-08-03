MyBatis SQL Mapper Framework for Java
=====================================

[![build](https://github.com/mybatis/mybatis-3/workflows/Java%20CI/badge.svg)](https://github.com/mybatis/mybatis-3/actions?query=workflow%3A%22Java+CI%22)
[![Coverage Status](https://coveralls.io/repos/mybatis/mybatis-3/badge.svg?branch=master&service=github)](https://coveralls.io/github/mybatis/mybatis-3?branch=master)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis)
[![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/oss.sonatype.org/org.mybatis/mybatis.svg)](https://oss.sonatype.org/content/repositories/snapshots/org/mybatis/mybatis/)
[![License](http://img.shields.io/:license-apache-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![Stack Overflow](http://img.shields.io/:stack%20overflow-mybatis-brightgreen.svg)](http://stackoverflow.com/questions/tagged/mybatis)
[![Project Stats](https://www.openhub.net/p/mybatis/widgets/project_thin_badge.gif)](https://www.openhub.net/p/mybatis)

![mybatis](http://mybatis.github.io/images/mybatis-logo.png)


安装mybatis源码环境遇到的问题
----------
> 使用的环境是 mybatis3.5.8 + maven3.6 + docker + mysql8.0

1. 报驱动无法找到
    如图所示![](https://img.nbjike.com/jietu/20210803230757.png?from=tz)
   若直接在 main 目录下直接进行，连接数据库进行代码测试，会显示找不到数据库驱动
   若在 test 目录下进行测试，则不会报错
   原因是 pom 文件中，mysql 的驱动的 scope 是 test 的
    

2. 连接 docker 出现的问题 1，
    如图所示![](https://img.nbjike.com/jietu/20210803230521.png?from=tz)
   解决办法：https://blog.csdn.net/u013360850/article/details/80373604

2. 连接 docker 出现的问题 2，
   如图所示![](https://img.nbjike.com/jietu/20210803230521.png?from=tz)
   解决办法：https://www.codenong.com/cs106313811/
