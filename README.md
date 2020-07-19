# SSM

# 前言
大概十几天前，我问了下我的java老师需不需要学生帮忙做项目。本来我是想着提前问一下，开学后再跟着做项目。然而没想到的是，老师告诉我说他现在就有项目，并很快就把我拉进了项目群。
紧接着一个学长就加了我好友。他先是问了下我的情况，然后就给我分配了以下的任务

# 1.看视频+配置SSM框架
## 1）主要内容
由于这个项目用的是SSM框架，而我以前都没听说过这玩意，所以一开始我是很慌的，很怕自己看不懂学长给的任务。
但还好，学长给我的第一个任务并不难，起码我能够看懂：看视频自学+按照博客搭建SSM框架。
以下是链接：
[如何搭建一个SSM项目](https://blog.csdn.net/qq598535550/article/details/51703190)
[java Web视频教程](https://www.bilibili.com/video/BV18s411u7EH)

## 2）遇到的困难
### （1）搭建环境
我拿到任务后立刻就兴致勃勃地打开了MyElipse，准备开始搭建。然而学长告诉我说最好使用Elipse写程序，于是我遇到了第一个困难：如何搭建环境（毕竟Elipse可不是下下来就能用的）
不过还好我之前看过一个0基础视频，手把手教你搭建环境，我通过看视频很轻松解决了这个问题，顺带把Mysql也配置好了，以下是链接
[Java Web项目实战](https://www.bilibili.com/video/BV1zE411Y7Mg/?p=2&share_source=qq&share_medium=iphone&bbid=4c6b42b0550316fece046f2ef44f4586&ts=1594822496)
当然了，完全照着来也有可能会出现一些小差错，比如我当时配置环境变量的时候就遇到了一个小问题

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200715221756228.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)

视频里说的是在path目录下添加环境变量时需要在每个环境变量最后加一个分号，但我做的时候发现如果加了分号就无法配置成功。而我把分号删掉就可以了，如上图所示。

如果大家仍无法配置成功，可以看下下面这个博客
 [Elipese打不开了怎么办](https://blog.csdn.net/qq_39136928/article/details/80443867)

如果配置mysql出错可以看看下面这篇博客
[mysql  1251](https://blog.csdn.net/weixin_42329086/article/details/104586438?utm_source=app)



### （2）搭建项目
基础的环境搞好后我就开始边看视频边搭建项目的“掉头发之旅”了。
我先是看了下视频的总数，好家伙，一共70多个视频。
再看一下视频时长，好家伙平均半个小时。
再看下学长的具体要求，好家伙，5天之内完成！！！！
这意味着什么呢，这意味着那些视频我只能看个大概，没法真正学到东西。（不过好在视频主要讲的是前端的东西，而学长说以后会让我主要负责后端的部分，所以我只看个大概其实也够用了。）
此外，这还意味着那五天我会过的比考试周还累。

平均每天看十几个视频，再加上还得搭建项目，那五天我几乎是每天从中午12点学到半夜1、2点。
本来我还想跟着博客自己敲一遍呢，但一看时间这么紧张，我只好把博主的资源直接下下来了。

当然了，直接下下来必然是不能用的，于是我开始了漫长的DeBug之旅。
一开始我看博客推荐用Maven，我就去配置了一下Maven，但发现不论我怎么调试，我的Maven项目都跑不起来，甚至连输出个Hello World都做不到。
于是我就直接new 了一个Dynamic web project，并粗暴地把博主的SRC文件夹复制到了我的项目中，然而我发现我还是没办法把项目跑起来。

纠结了好久以后我决定还是用Maven吧，这次我参考了很多资料终于解决了问题，对我帮助最大的博客和视频链接如下：
[配置Maven+导入Maven项目](https://blog.csdn.net/nicole_33/article/details/90739361?utm_medium=distribute.wap_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.nonecase&depth_1-utm_source=distribute.wap_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.nonecase)
[Maven视频教程](https://www.bilibili.com/video/BV1TW411A7X2/?p=1&share_source=qq&share_medium=iphone&bbid=4c6b42b0550316fece046f2ef44f4586&ts=1594824701)
[Maven配置报错](https://blog.csdn.net/qq_36908872/article/details/82696348?utm_source=app)
[创建maven项目时，出现Could not calculate build plan错误](https://blog.csdn.net/qian1818/article/details/80391034?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.nonecase)


总结一下我遇到的困难及解决方法：
1）
困难：new maven项目和update project时疯狂报错
解决方法：
（1）在Maven安装目录的conf目录下的settings.xml里配置一个阿里云镜像，可以加快Maven下载资源的速度


![在这里插入图片描述](https://img-blog.csdnimg.cn/20200715225918689.png)

（2）当时我是把项目的pom.xml文件里的某一个dependency给改了，但我忘了具体是哪个了。。。
所以我直接把pom.xml放上来吧，大家对照着看
```javascript
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.soecode.ssm</groupId>
	<artifactId>ssm</artifactId>
	<packaging>war</packaging>
	<version>0.0.1-SNAPSHOT</version>
	<name>ssm Maven Webapp</name>
	<url>http://github.com/liyifeng1994/ssm</url>
	<dependencies>
		<!-- 单元测试 -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
		</dependency>

		<!-- 1.日志 -->
		<!-- 实现slf4j接口并整合 -->
		<dependency>
			<groupId>ch.qos.logback</groupId>
			<artifactId>logback-classic</artifactId>
			<version>1.1.1</version>
		</dependency>

		<!-- 2.数据库 -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.15</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>c3p0</groupId>
			<artifactId>c3p0</artifactId>
			<version>0.9.1.2</version>
		</dependency>

		<!-- DAO: MyBatis -->
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis</artifactId>
			<version>3.3.0</version>
		</dependency>
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis-spring</artifactId>
			<version>1.2.3</version>
		</dependency>

		<!-- 3.Servlet web -->
		<dependency>
			<groupId>taglibs</groupId>
			<artifactId>standard</artifactId>
			<version>1.1.2</version>
		</dependency>
		<dependency>
			<groupId>jstl</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.5.4</version>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
		</dependency>

		<!-- 4.Spring -->
		<!-- 1)Spring核心 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-beans</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<!-- 2)Spring DAO层 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-tx</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<!-- 3)Spring web -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>
		<!-- 4)Spring test -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-test</artifactId>
			<version>4.1.7.RELEASE</version>
		</dependency>

		<!-- redis客户端:Jedis -->
		<dependency>
			<groupId>redis.clients</groupId>
			<artifactId>jedis</artifactId>
			<version>2.7.3</version>
		</dependency>
		<dependency>
			<groupId>com.dyuproject.protostuff</groupId>
			<artifactId>protostuff-core</artifactId>
			<version>1.0.8</version>
		</dependency>
		<dependency>
			<groupId>com.dyuproject.protostuff</groupId>
			<artifactId>protostuff-runtime</artifactId>
			<version>1.0.8</version>
		</dependency>

		<!-- Map工具类 -->
		<dependency>
			<groupId>commons-collections</groupId>
			<artifactId>commons-collections</artifactId>
			<version>3.2</version>
		</dependency>
		
		<dependency>
			<groupId>commons-lang</groupId>
			<artifactId>commons-lang</artifactId>
			<version>2.6</version>
		</dependency>
		
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>3.14</version>
		</dependency>
		
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>3.14</version>
		</dependency>
		
		<dependency>
     <groupId>javax.servlet</groupId>
     <artifactId>jsp-api</artifactId>
     <version>2.0</version>
     <scope>provide</scope>
       </dependency>

	</dependencies>
	
	<build>
		<finalName>ssm</finalName>
		<plugins>
        <plugin>
           <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.1</version>
           <configuration>
            <source>1.8</source> 
              <target>1.8</target> 
              </configuration>
         </plugin>
             </plugins>
	</build>
	
</project>

```
2）
困难：Mysql运行报错
解决方法：
（1）改jdbc.properties文件，改成如下的样子（我用的是Mysql8，不清楚其他版本应该怎么改）

![在这里插入图片描述](https://img-blog.csdnimg.cn/2020071523260151.png)

（usename和password自己设置即可，还有就是url中那个3306/后面的safety是数据库名称，记得自行更改）

（2）改pom.xml中mysql的版本号

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200715232115118.png)


（3）记得要把项目中的sql文件放在Mysql里执行，我一开始傻傻地以为项目能自行执行sql文件。。。（应该没有人像我这么蠢了吧）

到这里就配置成功啦，接下来只需按照那篇博客测试即可

测试方法：右键点击test.java文件，点击run as 选Junit Test选项即可测试
# 2.完成数据显示以及报表（即导出Excel文件）
## 1）主要内容
上面的任务完成后，学长便给我布置了第一个真正意义上的任务：做一个数据显示网页（数据从数据库导入），并实现Excel文件导出功能
网页格式以及数据表格式均如下图所示

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200715233706231.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)

## 2）具体流程
实现entity实体类---实现dao类（连接数据库）---实现service类-----写出jsp网页-----实现controller类
## 3）遇到的困难
### （1）Dao层代码
实体类的实现没什么好说的，主要说一下后面这几步。
写Dao层的时候，我本以为挺简单，不就是写个select语句，按照日期查询吗，可是写完了以后又疯狂报错，select语句啥都查不到。
于是我又去找了视频
[springmvc教程](https://www.bilibili.com/video/BV1MW411A7Kn/?p=1&share_source=qq&share_medium=iphone&bbid=4c6b42b0550316fece046f2ef44f4586&ts=1594827882)
 [mybatis教程](https://www.bilibili.com/video/BV1gs411j7kA/?p=1&share_source=qq&share_medium=iphone&bbid=4c6b42b0550316fece046f2ef44f4586&ts=1594827936)
 （大家应该可以发现在这些视频的作者都是颜群老师，所以大家点下关注吧（滑稽）
 顺便推荐一个专栏，整理了Java学习路线，我觉得挺好用的 [专栏](https://www.bilibili.com/read/cv4946496?share_source=qq&share_medium=iphone&bbid=4c6b42b0550316fece046f2ef44f4586&ts=1594828128)）
 
 通过看视频（每个都只看了一两个，主要是为了解决问题，打算以后再细致地看），我知道了Mybatis的基本用法，也知道了配置springweb.xml的原理（即为什么要这样配置它）
 
 但是！我依旧没有解决我的问题，他依旧报错。最后的最后我才发现Mysql中竟然有一个专门的Date类！（看来我以后得多看看视频补充一下数据库以及Mysql的知识才行啊）

 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20200715235309872.png)
 
 好吧，虽然浪费了不少时间，但总算从数据库中取出了数据，接下来的service层就相对比较好写了，这里不再赘述。

以下为dao层代码以及xml文件（不用实现dao层具体函数，mybatis会按照xml中的sql语句自动帮我们实现，神奇吧）

（这里仅展示其中一个Dao层的操作，一共有三个数据表，对应三个实体，三个Dao层）

Dao层代码
```javascript
package com.soecode.lyf.dao;

import java.util.List;
import com.soecode.lyf.entity.Safetyrecord;

public interface SafetyrecordDao {
	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	Safetyrecord queryById(int id);
	
	/**
	 * 查询所有
	 * 
	 * @param Date
	 * @return
	 */
	List<Safetyrecord> queryByDate(String Date);
}

```

xml:
```javascript
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.soecode.lyf.dao.SafetyrecordDao">
	<!-- 目的：为dao接口方法提供sql语句配置 -->
	<select id="queryById" resultType="Safetyrecord" parameterType="int">
		<!-- 具体的sql -->
		SELECT*
		FROM
			safetyrecord
		WHERE
			id = #{Id}
	</select>
	
	<select id="queryByDate" resultType="Safetyrecord">
		SELECT*
		FROM
			safetyrecord
		WHERE
			DATE_FORMAT(date,'%Y%m%d') = #{Date}
	</select>
</mapper>
```

（注：safetyrecord数据表存放的是设备情况，即那些勾勾叉叉，0代表打勾，1代表打叉，为了能输出这些勾勾叉叉，我在safetyrecord实体类中写了一个showint()方法，把0和1替换成‘√’和‘×’

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716003028586.png)
safetyrecordsig数据表存放的是备注、签名情况

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716003200851.png)
user数据表存放的是用户信息，user_id和上面那个safetyrecordsig中的inspector是对应的，即我们需要通过inspector找到用户，并最终输出user_name

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716003548230.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
）



（entity层代码比较多，且没什么技术含量就不再展示了）
 
 
 以下为service层代码,为了方便到时候输出到网页上，我选择的是用map存放safetyrecord（key为Integer类，存放time中的小时，value为safetyrecord实体类）
```javascript
package com.soecode.lyf.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soecode.lyf.dao.SafetyrecordDao;
import com.soecode.lyf.dao.SafetysigDao;
import com.soecode.lyf.dao.UserDao;
import com.soecode.lyf.entity.Safetyrecord;
import com.soecode.lyf.entity.Safetyrecordsig;
import com.soecode.lyf.service.SafetyService;

@Service
public class SafetyServiceImpl implements SafetyService {

	// 注入Service依赖
		@Autowired
		private SafetyrecordDao SafetyrecordDao;
		@Autowired
		private SafetysigDao SafetysigDao;
		@Autowired
		private UserDao UserDao;
	
	@Override
	public Safetyrecord queryById(int id) {
		// TODO Auto-generated method stub
		return SafetyrecordDao.queryById(id);
	}

	@Override
	public Map<Integer,Safetyrecord> queryByDate(String Date) {
		// TODO Auto-generated method stub
		
		List<Safetyrecord> Safetyrecords=SafetyrecordDao.queryByDate(Date);
		
		Map<Integer,Safetyrecord>  SafetyMap = new HashMap<Integer,Safetyrecord>();
		
		for(Safetyrecord safetyrecord:Safetyrecords)
		{
			SafetyMap.put(safetyrecord.getHour(), safetyrecord);//key值为该记录的时间（小时），value为一条safetyrecord记录
		}
		
		return SafetyMap;
	}

	@Override
	public List<Safetyrecordsig> queryByDate_sig(String Date) {
		// TODO Auto-generated method stub
		List<Safetyrecordsig> Safetyrecordsigs = SafetysigDao.queryByDate(Date);
		for(Safetyrecordsig safetyrecordsig:Safetyrecordsigs)
		{
			int id=safetyrecordsig.getInspector();
			safetyrecordsig.setName(UserDao.queryById(id));
		}
		return Safetyrecordsigs;
	}

}

```
### （2）Jsp网页
虽然学长之前说了我只负责后端部分，但在这次任务里我还是要自己写jsp网页。。。
不过由于之前看了那么多视频，再加上搜了下HTML的一些知识，所以我还是比较轻松地做出了网页。

![在这里插入图片描述](https://img-blog.csdnimg.cn/2020071523593879.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
但是学长有个要求，就是图里那个文本框不能直接让用户往里输入日期，因为那样的话格式会不统一，他让我做成下图这样能选择的形式

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716000058517.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)


这算是我做jsp网页过程中遇到的最大困难了，不过学长给了我个网站,[layui官网](https://www.layui.com/)，并告诉我可以从官网下载了直接用。

所以这个东西我没用多久就解决了，过程如下：
（1）在官网搜索laydate，跳出如下页面

![在这里插入图片描述](https://img-blog.csdnimg.cn/2020071600062218.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
点击如下链接，下载组件


![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716000659446.png)
（2）把组件复制到项目的webapp目录下

（3）在jsp文件中加上如下代码

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716000902920.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)

其中那个#date对应的是文本框中输入的东西的id

![在这里插入图片描述](https://img-blog.csdnimg.cn/2020071600100186.png)jsp代码如下：
```javascript
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询结果页面</title>
<style type="text/css">
a{
border:1px solid #dfb665;
padding:5px 7px;
color:blue;
}
</style>
</head>
<body>


<form class="layui-form" action="${pageContext.request.contextPath}/safety/show" method="post">
<div style="height:40px;width:300px;">
<div style="float:left;margin-left:10px;height:30px;text-align:center;margin-top:0px">
<input type="text" name="date" id="date" lay-verify="date" placeholder="选择(当前:${cordate})" autocomplete="off" class="layui-input" style="height:25px;margin-top:4px;float:left;">
</div>
<div style="float:left;margin-left:10px;height:30px;text-align:center;margin-top:0px">
<input type="submit" value="查询" style="background-color:darkcyan;margin-top:4px;float:right;">
</div>
<div style="float:right;height:30px;text-align:center;margin-top:5px">
<a  href="${pageContext.request.contextPath}/safety/export?dates=${cordate}" style="background-color:powderblue" method="post">导出</a>
</div>
</div>

<script src="layDate/laydate/laydate.js"></script> <!-- 改成你的路径 -->
<script>
lay('#version').html('-v'+ laydate.v);

//执行一个laydate实例
laydate.render({
  elem: '#date' //指定元素
});
</script>
     <br>        
       &emsp; &emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
       安全卫士检查记录  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
       ${mydate.getYear()}年 ${mydate.getMonth()}月 ${mydate.getDay()}日
     <!-- border:边框宽度，bordercolor:边框颜色 -->	
	<table border="1px" bordercolor="black">
	    <tr>
	           <th  colspan="18">化工公司合成净化车间氨库岗位安全卫士巡检表（每班四次)</th>
	    </tr>
	     <tr>
	           <td  colspan="18">管理概念：控制3个指标（液位、压力、温度），维护好41个安全附件、156只阀门、48个根部<br>
	           法兰、14个常用阀、9个监视器、25个报警装置.</td>
	    </tr>
	    
	     <tr>
	           <td  colspan="18"> <br> </td>
	    </tr>
	    
	    <tr>
	          <th rowspan="2"colspan="1" >序<br>
	                                                                            号</th>
	          <th rowspan="2" colspan="2">项目</th>
	          <th rowspan="2" colspan="3">巡检标准</th>
	          <th colspan="4">早班</th>	
	          <th colspan="4">中班</th>	    
	          <th colspan="4">晚班</th>       
	    </tr>
	     <tr>
	          <td >01</td>     
	          <td >03</td>
	          <td >05</td>
	          <td >07</td>
	          <td >09</td>
	          <td >11</td>
	          <td >13</td>
	          <td >15</td>
	          <td >17</td>
	          <td >19</td>
	          <td >21</td>
	          <td >23</td>
	          
	    </tr>
	    
	    
	    
	    <tr>	
	<!-- c:通过prefix取的别名，可以该为任意值，取名为c是规范，作用是调用forEach方法，
		forEach:相当于for循环，items:里面放循环对象，var:任意取名，然后通过该名调用要显示的值 -->
		<!-- 如果传过来的值只有一条，则不需要使用循环，${detail}:el表达式中放的是传过来的键 -->
		
		<!-- 用detail1输出早班信息 -->

	    </tr>
	    

	    <tr>
	          <td >1</td>
	          <td colspan="2">常用阀（14）关键阀（7）</td>
	          <td rowspan="7" colspan="3">1.阀门填料无泄漏<br>
	                           2.阀体无裂痕<br>       
	                           3.阀门法兰、液位计法兰、压力<br>
	                           表短接法兰及连接法兰无泄漏<br>
	                           4.阀门阀杆，无腐蚀<br>
	                           5.根部法兰完好，无腐蚀<br>
	                           6.阀门无内漏<br>
	                           </td>
	           
               <td >${safetyrecord1.showint(safetyrecord1.getFirst())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getFirst())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getFirst())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getFirst())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getFirst())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getFirst())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getFirst())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getFirst())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getFirst())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getFirst())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getFirst())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFirst())}</td>
	    </tr>
	    
        <tr>
	          <td >2</td>
	          <td colspan="2">排污阀（6）关键阀（3）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getSecond())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getSecond())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getSecond())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getSecond())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getSecond())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getSecond())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getSecond())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getSecond())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getSecond())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getSecond())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getSecond())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getSecond())}</td>
	    </tr>
	      <tr>
	          <td >3</td>
	          <td colspan="2">驰放阀（15）关键阀（3）</td>
	           
               <td >${safetyrecord1.showint(safetyrecord1.getThird())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getThird())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getThird())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getThird())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getThird())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getThird())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getThird())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getThird())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getThird())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getThird())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getThird())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getThird())}</td>
	    </tr>
	    
	      <tr>
	          <td >4</td>
	          <td colspan="2">液位计截至阀（32）<br>
	                                            关键阀（12）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getFourth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getFourth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getFourth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getFourth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getFourth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getFourth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getFourth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getFourth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getFourth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getFourth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getFourth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFourth())}</td>
	    </tr>
   
          <tr>
	          <td >5</td>
	          <td colspan="2">放空阀（9）关键阀（5）</td>
	           <td >${safetyrecord1.showint(safetyrecord1.getFifth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getFifth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getFifth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getFifth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getFifth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getFifth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getFifth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getFifth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getFifth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getFifth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getFifth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFifth())}</td>
	           
	    </tr>
	    
	      <tr>
	          <td >6</td>
	          <td colspan="2">液位计法兰（40）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getSixth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getSixth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getSixth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getSixth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getSixth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getSixth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getSixth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getSixth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getSixth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getSixth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getSixth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getSixth())}</td>
	    </tr>
	    
	      <tr>
	          <td >7</td>
	          <td colspan="2">压力表短接（39）</td>
	           
                <td >${safetyrecord1.showint(safetyrecord1.getSeventh())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getSeventh())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getSeventh())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getSeventh())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getSeventh())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getSeventh())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getSeventh())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getSeventh())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getSeventh())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getSeventh())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getSeventh())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getSeventh())}</td>
	    </tr>
	    
	      <tr>
	          <td >8</td>
	          <td colspan="2">压力表（23）、压力变<br>
	                         送器（16）</td>
	            <td colspan="3">在有效期内；限位标识完好；无<br>
	                         破损，泄露，腐蚀</td>
            <td >${safetyrecord1.showint(safetyrecord1.getEighth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getEighth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getEighth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getEighth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getEighth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getEighth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getEighth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getEighth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getEighth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getEighth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getEighth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getEighth())}</td>
	    </tr>
	    
	    <tr>
	          <td >9</td>
	          <td colspan="2">安全阀（7）</td>
	            <td colspan="3">根部截至阀打开，铅封完好；无<br>
	                                                      腐蚀</td>
                <td >${safetyrecord1.showint(safetyrecord1.getNineth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getNineth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getNineth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getNineth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getNineth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getNineth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getNineth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getNineth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getNineth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getNineth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getNineth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getNineth())}</td>
	    </tr>
	    
	    <tr>
	          <td >10</td>
	          <td colspan="2">液位计（6）</td>
	            <td colspan="3">无泄漏，裂纹，锈蚀等异常情况；<br>
	                 显示准确，无超过上下限位</td>
                <td >${safetyrecord1.showint(safetyrecord1.getTenth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getTenth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getTenth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getTenth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getTenth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getTenth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getTenth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getTenth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getTenth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getTenth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getTenth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getTenth())}</td>
	    </tr>
	    
	    <tr>
	          <td >11</td>
	          <td colspan="2">温度计（5）</td>
	            <td colspan="3">现场取样点是否完好，室内显示<br>
	                是否正常</td>
               <td >${safetyrecord1.showint(safetyrecord1.getEleventh())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getEleventh())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getEleventh())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getEleventh())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getEleventh())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getEleventh())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getEleventh())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getEleventh())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getEleventh())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getEleventh())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getEleventh())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getFirst())}</td>
	    </tr>
	    
	    <tr>
	          <td >12</td>
	          <td colspan="2">槽体及连接管道</td>
	            <td colspan="3">保冷完好；无破损，腐蚀，泄漏<br>
	               等异常情况，润滑情况完好，管<br>
	               道标识清晰准确；管道无振动</td>
                <td >${safetyrecord1.showint(safetyrecord1.getTwelveth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getTwelveth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getTwelveth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getTwelveth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getTwelveth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getTwelveth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getTwelveth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getTwelveth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getTwelveth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getTwelveth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getTwelveth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getTwelveth())}</td>
	    </tr>
	    
	    <tr>
	          <td >13</td>
	          <td colspan="2">9个监视器，25个报警<br>
	               装置</td>
	            <td colspan="3">无腐蚀，无泄漏</td>
               <td >${safetyrecord1.showint(safetyrecord1.getThirteenth())}</td>
               <td >${safetyrecord3.showint(safetyrecord3.getThirteenth())}</td>
               <td >${safetyrecord5.showint(safetyrecord5.getThirteenth())}</td>
               <td >${safetyrecord7.showint(safetyrecord7.getThirteenth())}</td>
               <td >${safetyrecord9.showint(safetyrecord9.getThirteenth())}</td>
               <td >${safetyrecord11.showint(safetyrecord11.getThirteenth())}</td>
               <td >${safetyrecord13.showint(safetyrecord13.getThirteenth())}</td>
               <td >${safetyrecord15.showint(safetyrecord15.getThirteenth())}</td>
               <td >${safetyrecord17.showint(safetyrecord17.getThirteenth())}</td>
               <td >${safetyrecord19.showint(safetyrecord19.getThirteenth())}</td>
               <td >${safetyrecord21.showint(safetyrecord21.getThirteenth())}</td>
               <td >${safetyrecord23.showint(safetyrecord23.getThirteenth())}</td>
	    </tr>
	      <tr>
	          <td colspan="2">巡检人签名</td>
	          <td colspan="2">早班：${safetyrecordsigs.get(0).getName()} </td>
	            <td colspan="4">中班：${safetyrecordsigs.get(1).getName()}</td>
               <td colspan="10">晚班：${safetyrecordsigs.get(2).getName()}</td>
	    </tr>
	     <tr>
	          <td colspan="2">备注<br>  <br>  <br>  <br> <br>  <br> </td>
	          <td colspan="2">${safetyrecordsigs.get(0).getRemark()}</td>
               <td colspan="4">${safetyrecordsigs.get(1).getRemark()}</td>
               <td colspan="10">${safetyrecordsigs.get(2).getRemark()}</td>
	    </tr>
	     <tr>
	          <td colspan="2">异常情况记<br>
	                              录<br> <br>  <br>  </td>
	          <td colspan="16">1.${safetyrecordsigs.get(0).getException()} <br>
	                               2.${safetyrecordsigs.get(1).getException()}<br>
	                     3.${safetyrecordsigs.get(2).getException()}</td>
	    </tr>
	</table>
</form>
</body>
</html>
```

### （3）controller层
1）数据显示
前面的内容总的来说还是做的比较顺利的，毕竟可以参考那篇配置SSM框架的博客，但到这一层我就有点懵了，我是真不太清楚jsp页面和controller之间是如何交互的。

于是我去看了下刚才发的那个springmvc教程视频，只看前三个视频差不多就够了，毕竟我现在的目的只是搞懂如何实现jsp页面和controller之间的交互。

搞懂了以后就很好写了。

代码如下
```javascript
@Controller
@RequestMapping("safety")
public class SafetyController {
	
	@Autowired
	private SafetyService SafetyService;
	
	private Map<Integer,Safetyrecord> safetyrecords=null;
	
	List<Safetyrecordsig> Safetysigs=null;
	
	MyDate mydate=null;
	
	public String sqldate(String s)
	{
		String dat[]=s.split("-");
		return dat[0]+dat[1]+dat[2];
	}
	
	@RequestMapping("show")
	public String show(@RequestParam("date")String date,Model model)
	{
		if(date=="")return "Error";
		
		String dat[]=date.split("-");
		
		mydate=new MyDate(Integer.parseInt(dat[0]),Integer.parseInt(dat[1]),Integer.parseInt(dat[2]));
		
		System.out.println(sqldate(date));
		
		safetyrecords =SafetyService.queryByDate(sqldate(date));
		
		Safetysigs=SafetyService.queryByDate_sig(sqldate(date));
		
		if(safetyrecords.size()==0&&Safetysigs.size()==0)return "Error";
		
		for(int i=0;i<3;i++)
		{
			if(i>=Safetysigs.size())Safetysigs.add(new Safetyrecordsig());
		}
		
		model.addAttribute("cordate",date);
		
		model.addAttribute("mydate",mydate);
		
		model.addAttribute("safetyrecordsigs",Safetysigs);
		
		model.addAttribute("safetyrecord1",safetyrecords.get(1));
		model.addAttribute("safetyrecord3",safetyrecords.get(3));
		model.addAttribute("safetyrecord5",safetyrecords.get(5));
		model.addAttribute("safetyrecord7",safetyrecords.get(7));
		model.addAttribute("safetyrecord9",safetyrecords.get(9));
		model.addAttribute("safetyrecord11",safetyrecords.get(11));
		model.addAttribute("safetyrecord13",safetyrecords.get(13));
		model.addAttribute("safetyrecord15",safetyrecords.get(15));
		model.addAttribute("safetyrecord17",safetyrecords.get(17));
		model.addAttribute("safetyrecord19",safetyrecords.get(19));
		model.addAttribute("safetyrecord21",safetyrecords.get(21));
		model.addAttribute("safetyrecord23",safetyrecords.get(23));
		return "detailOfSafety";
	}
```

2）导出文件
学长应该是考虑到了我肯定不会这块，所以他给我发了一个他之前写的导出文件的代码让我参考。

可惜我太笨了。。。连照猫画虎都画不明白。。。。还是去搜了一些博客，才最终写出来。以下为一些链接

[StringUtils的maven坐标](https://blog.csdn.net/weter_drop/article/details/101374710?utm_source=app)

[Excel动态合并行、列](https://blog.csdn.net/u013045878/article/details/52014194?utm_source=app)

 [使用XSSFWorkbook实现对excl读写](https://blog.csdn.net/fgghhfg574/article/details/103343030?utm_source=app)

以下为代码
```javascript
@RequestMapping("export")
	public void detailOfSafetyExport(HttpServletResponse response,HttpServletRequest request) throws IOException {
		String dates=request.getParameter("dates");
		
		String realPath=request.getSession().getServletContext().getRealPath("/");
    	File file = new File(realPath+"/DetailOfSafety.xlsx");		
    	FileInputStream in =new FileInputStream(file);
			//读取excel模板
		XSSFWorkbook wb = new XSSFWorkbook(in);
			//读取了模板内所有sheet内容
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println("date: "+dates);
		XSSFRow row=null;
		XSSFCellStyle cellStyle=wb.createCellStyle() ;
		XSSFFont font  = wb.createFont(); 
		font.setFontHeight(20);
		
		cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
		
		String filename=null;
		
	    if(StringUtils.isNotBlank(dates)) 
	    {
	    	
	    	safetyrecords =SafetyService.queryByDate(sqldate(dates));
			
			Safetysigs=SafetyService.queryByDate_sig(sqldate(dates));
			
			for(int i=0;i<3;i++)
			{
				if(i>=Safetysigs.size())Safetysigs.add(new Safetyrecordsig());
			}
				
				//开始写入数据
				//表头(待更改)
				
			String dat[]=dates.split("-");
			mydate=new MyDate(Integer.parseInt(dat[0]),Integer.parseInt(dat[1]),Integer.parseInt(dat[2]));
			
				System.out.println("date: "+mydate.toString());
				
				row=sheet.getRow(0);
				row.getCell(0).setCellValue("化工公司合成净化车间氨库岗位安全卫士巡检表"+"  "+mydate.toString());		
				
				
				row=sheet.getRow(5);
				String s="";
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getFirst()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(6);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getSecond()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(7);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getThird()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(8);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getFourth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(10);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getFifth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(11);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getSixth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(12);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getSeventh()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(13);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getEighth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(15);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getNineth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(16);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getTenth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(18);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getEleventh()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(20);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getTwelveth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(23);
				for(int i=0;i<12;i++) 
				{
					if(safetyrecords.get(2*i+1) == null) {
						row.createCell(i+6).setCellValue("");
					}else {
						s=Character.toString(safetyrecords.get(2*i+1).showint(safetyrecords.get(2*i+1).getThirteenth()));
                        row.createCell(i+6).setCellValue(s);
					}		
			    }	
				
				row=sheet.getRow(25);
				row.createCell(3).setCellValue("早班："+Safetysigs.get(0).getName());
				row.createCell(8).setCellValue("午班："+Safetysigs.get(1).getName());
				row.createCell(13).setCellValue("晚班："+Safetysigs.get(2).getName());
				
				row=sheet.getRow(26);
				row.createCell(3).setCellValue(Safetysigs.get(0).getRemark());
				row.createCell(8).setCellValue(Safetysigs.get(1).getRemark());
				row.createCell(13).setCellValue(Safetysigs.get(2).getRemark());
				
				row=sheet.getRow(28);
				row.createCell(3).setCellValue("1."+Safetysigs.get(0).getException()+"  "
				+"2."+Safetysigs.get(1).getException()+"  "
				+"3."+Safetysigs.get(2).getException());
				
				filename="export.xlsx";
				
	    }
	    else {
	    	
	    	filename="该表为空表"+".xlsx";
	    }
	 // 设置输出流,实现下载文件
		response.setHeader("Content-Disposition",
				"attachment;filename=" +URLEncoder.encode(filename,"UTF-8"));
				//FileOutputStream out = new FileOutputStream(response.getOutputStream());
		wb.write(response.getOutputStream());
		response.getOutputStream().close();
	}
}
```

其中读取的excel模板如下图所示

![在这里插入图片描述](https://img-blog.csdnimg.cn/2020071600571362.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
需要自己做好然后复制到webapp目录下

哦对了，忘了给你们看我的文件目录

以下为目录


![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716005918826.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)

## 4）效果展示
页面：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716010109155.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)点击选择日期


![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716010132246.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
点击查询

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716010154943.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
点击导出：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716010225472.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
打开文件进行查看：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716010256405.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
如果选择的日期无数据

![在这里插入图片描述](https://img-blog.csdnimg.cn/2020071601034284.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
不输入日期点击导出：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716010441195.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
查看文件：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200716010507147.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzY3NDQxNA==,size_16,color_FFFFFF,t_70)
总的来说这次任务我学到了很多东西，对SSM框架也算是有了一个初步的了解。

期待下次的任务！

（项目的源代码我以后会传上来）
