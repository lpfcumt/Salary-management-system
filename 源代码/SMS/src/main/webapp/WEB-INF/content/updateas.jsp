<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<title>修改补贴类型</title>
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>	
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.login.js"></script>
	
</head>
<body>
<form action="updateAssistancesum" method="post">
	<h4>
	<c:forEach items="${sessionScope.listasbyid}" var="listasbyid">
	<input name="asid" type="hidden" value="${listasbyid.asid}"></input>
		补贴编号:${listasbyid.assistancesumname}<br /><br />
		补贴项目:<input type="text" name="name" value="${listasbyid.name}"/><br /><br />
		补贴金额:<input type="text" name="assistancesum" value="${listasbyid.assistancesum}"/><br /><br />
		<input type="submit" value="提交"/>
	</c:forEach>
	</h4>
</form>
</body>
</html>