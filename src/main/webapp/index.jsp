<%--
  Created by IntelliJ IDEA.
  User: ZhiChao
  Date: 2017/11/7
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="<%=request.getContextPath()%>/findAll.action">
      <input type="submit">
  </form>
  <table>
      <tr>
          <td>id</td>
          <td>姓名</td>
          <td>性别</td>
          <td>生日</td>
      </tr>
      <s:iterator value="peoples" var="p">
          <tr>
              <td><s:property value="#p.id"/> </td>
              <td><s:property value="#p.name"/> </td>
              <td><s:property value="#p.sex"/> </td>
              <td><s:property value="#p.birthday"/> </td>
              <td><a href="<%=request.getContextPath()%>updateUi.action?id=<s:property value="#p.id"/> ">修改</a></td>
              <td><a href="<%=request.getContextPath()%>delete.action?id=<s:property value="#p.id"/> ">删除</a></td>
          </tr>
      </s:iterator>
  </table>
  <s:debug/>
  </body>
</html>
