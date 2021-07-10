<%--
  Created by IntelliJ IDEA.
  User: 64169
  Date: 2021/7/7
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a {
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
      h3 {
        /*字体所占的宽度*/
        width: 180px;
        /*字体所占高度*/
        height: 40px;
        /*外边距*/
        margin: 100px auto;
        /*字体居中*/
        text-align: center;
        /*行高*/
        line-height: 40px;
        /*背景颜色*/
        background: #6bffe9;
        /*背景圆角*/
        border-radius: 10px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>
