<%--
  Created by IntelliJ IDEA.
  User: 02
  Date: 2020/3/13
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="anno/testRequestParam?name=haha">点击案例</a>

<form action="anno/testRequestBody" method="post">
    用户姓名： <input type="text" name="uname"/><br>
    用户年龄： <input type="text" name="age"/><br>
    <input type="submit" value="提交"/>
</form>

<a href="anno/testPathVariable/10">点击案例</a>

<br>
<a href="anno/testRequestHeader">获取请求头信息</a>

<br>

<a href="anno/testCookieValue">获取cookie信息</a>

<br>

<form action="anno/testModelAttribute" method="post">
    用户姓名： <input type="text" name="uname"/><br>
    用户年龄： <input type="text" name="age"/><br>
    <input type="submit" value="提交"/>
</form>
<br>

<a href="anno/testSessionAttributes">testSessionAttributes</a>
<a href="anno/getSessionAttributes">getSessionAttributes</a>
<a href="anno/delSessionAttributes">delSessionAttributes</a>

<br>
</body>
</html>
