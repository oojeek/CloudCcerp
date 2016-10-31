<%--
  Created by IntelliJ IDEA.
  User: OOJEEK
  Date: 2016/10/28
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>委托单位清单</title>
    <link href="/css/style.css" type="text/css" rel="stylesheet"/>
</head>
<body>
    <h1 style="color: red;">委托单位清单</h1>

    <table class="tab">
        <thead>
            <tr>
                <th>ID</th><th>单位名称</th><th>单位年龄</th><th>距离</th><th>成立时间</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${list}" varStatus="statu">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.delegateName}</td>
                    <td>${item.delegateAge}</td>
                    <td>${item.delegateDistance}</td>
                    <td><fmt:formatDate value="${item.createTime}" type="both" pattern="yyyy年MM月dd日 HH:mm:ss"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
