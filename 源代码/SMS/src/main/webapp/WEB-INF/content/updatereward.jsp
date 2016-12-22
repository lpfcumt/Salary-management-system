<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改奖金</title>
</head>
<body>
	<form action="updateReward" method="post">
	<h4>
	<c:forEach items="${sessionScope.listrewardbyid}" var="listrewardbyid">
	<input name="rid" type="hidden" value="${listrewardbyid.rid}"></input>
		奖金等级:${listrewardbyid.rewardgrade}<br /><br />
		奖金金额:<input type="text" name="rewardsum" value="${listrewardbyid.rewardsum}"/><br /><br />
		
		<input type="submit" value="提交"/>
	</c:forEach>
	</h4>
</form>
</body>
</html>