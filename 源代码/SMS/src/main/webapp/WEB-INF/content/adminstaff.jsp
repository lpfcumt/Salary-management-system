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
    <div style="margin:10px 0;"></div>
    <form action="updateStaff" method="post">
    <c:forEach items="${sessionScope.liststaff}" var="liststaff">
    <h3>员工编号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.sid}" name="sid" /></h3>
    <h3>员工姓名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.staffname}" name="staffname"/></h3>
    <h3>员工性别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.sex}" name="sex"/></h3>
    <h3>员工邮箱&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.email}" name="email"/></h3>
    <h3>员工出生日期&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.birthday}" name="birthday"/></h3>
    <h3>员工联系电话&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.tel}" name="tel"/></h3>
    <h3>员工联系地址&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.address}" name="address"/></h3>
    <h3>员工所在部门&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.dept}" name="dept"/></h3>
    <h3>员工职位&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.job}" name="job"/></h3>
    <h3>员工基本工资类型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;<input style="width:200px" type="text" value="${liststaff.basesalarycate}" name="basesalarycate"/></h3>
   
	<input type="submit" value="确认修改" />
	</c:forEach>
	</form>
	
	<c:forEach items="${sessionScope.liststaff}" var="liststaff">
	<br><br><br>
	<a class="button" href="listAssistance?sid=${liststaff.sid}">修改补助类型</a>
	</c:forEach>
</body>
</html>