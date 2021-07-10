<%--
  Created by IntelliJ IDEA.
  User: 64169
  Date: 2021/7/7
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书城 ---- 修改书籍</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>图书城 ------ 修改书籍</small>
                </h1>
            </div>
        </div>
        <div class="row-md-1 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">返回书籍列表</a>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--修改是依据ID进行修改的,但是不允许用户修改ID,所以此处用隐藏域来传递ID--%>
<%--        <input type="hidden" name="bookID" value="${QBook.bookID}">--%>
        <%--使用readonly来只读ID框,依据上传的ID修改数据库--%>
        <div class="form-group">
            <label for="bookID">书籍编号:</label>
            <input type="text" name="bookID" class="form-control" id="bookID" value="${QBook.bookID}" readonly>
        </div>
        <div class="form-group">
            <label for="bookName">书籍名称:</label>
            <input type="text" name="bookName" class="form-control" id="bookName" value="${QBook.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量:</label>
            <input type="text" name="bookCounts" class="form-control" id="bookCounts" value="${QBook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述:</label>
            <input type="text" name="detail" class="form-control" id="detail" value="${QBook.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</body>
</html>
