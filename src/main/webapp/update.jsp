<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ZhiChao
  Date: 2017/11/8
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/update.action">
    <input type="hidden"name="people.id" value="<s:property value="people.id"/> ">
    姓名:<input type="text" name="people.name" value="<s:property value="people.name"/>"/>
    性别:<input type="text" name="people.sex" value="<s:property value="people.sex"/>"/>
    生日:<input type="text" name="people.birthday" value="<s:property value="people.birthday"/>"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
