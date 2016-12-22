<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>客户端分页demo</title>
    <link rel="stylesheet" type="text/css" href="css/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/icon.css">
    <link rel="stylesheet" type="text/css" href="css/demo.css">
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
    <h2>员工个人信息</h2>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div></div>
    </div>
     <c:forEach items="${sessionScope.liststaff1}" var="liststaff">
    <div style="margin:10px 0;"></div>
    <h3>员工照片</h3>
    <img src=""/><br/>
    <h3>员工编号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.sid}</h3>
    <h3>员工姓名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.staffname}</h3>
    <h3>员工性别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.sex}</h3>
    <h3>员工出生日期&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.birthday}</h3>
    <h3>员工联系电话&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.tel}</h3>
    <h3>员工联系地址&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.address}</h3>
    <h3>员工所在部门&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.dept}</h3>
    <h3>员工职位&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.job}</h3>
    <h3>员工入职时间&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.jointime}</h3>
    <h3>员工基本工资等级&nbsp;&nbsp;&nbsp;&nbsp;:${liststaff.basesalarycate}</h3>
    <br><br><br>
    <h3><a href="listAssistance1?sid=${liststaff.sid}">查看补助信息</a></h3>
    </c:forEach>
    
</body>
</html>