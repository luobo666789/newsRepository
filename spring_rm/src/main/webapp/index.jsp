<%--
  Created by IntelliJ IDEA.
  User: 02
  Date: 2020/3/13
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

   <h1>案例</h1>

   <%--<a href="hello">点击案例</a>
    把数据封装到Account类中
   <form action="account/saveAccount" method="post">
       姓名： <input type="text" name="username"/><br>
       密码： <input type="text" name="password"/><br>
       金额： <input type="text" name="money"/><br>
       用户名：   <input type="text" name="user.uname"/><br>
       用户年龄： <input type="text" name="user.age"/><br>
       <input type="submit" value="提交"/>
   </form>
   把数据封装到Account类中，把数据封装到List和map集合中去
   <form action="account/saveAccount" method="post">
       姓名： <input type="text" name="username"/><br>
       密码： <input type="text" name="password"/><br>
       金额： <input type="text" name="money"/><br>

       用户名：   <input type="text" name="list[0].uname"/><br>
       用户年龄： <input type="text" name="list[0].age"/><br>

       用户名：   <input type="text" name="map['one'].uname"/><br>
       用户年龄： <input type="text" name="map['one'].age"/><br>
       <input type="submit" value="提交"/>
   </form>--%>
   <%--自定义类型转换器--%>
   <form action="account/saveUser" method="post">
       用户姓名： <input type="text" name="uname"/><br>
       用户年龄： <input type="text" name="age"/><br>
       用户生日： <input type="text" name="birthday"/><br>
       <input type="submit" value="提交"/>
   </form>
</body>
</html>
