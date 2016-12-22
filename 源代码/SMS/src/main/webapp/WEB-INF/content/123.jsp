<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>员工编号:${sessionScope.sid2}</h3>


 <c:if test="${empty sessionScope.listassistance}">
 <form action="addAssistance">

	
	
	 
	 
	 <h3>补助类型：</h3>
	 <h4><br>
	 <input type="hidden" name="sid"  value="${sessionScope.sid2}"/>
	 <input type="hidden" name="staffname"  value="${sessionScope.staffname2}"/>
	 类型一:<input type="text" name="cate1" value="否" /><br><br>
	 类型二:<input type="text" name="cate2" value="否" /><br><br>
	 类型三:<input type="text" name="cate3" value="否" /><br><br>
	 类型四:<input type="text" name="cate4" value="否" /><br><br>
	 类型五:<input type="text" name="cate5" value="否" /><br><br>
	 类型六:<input type="text" name="cate6" value="否" /><br><br>
	 类型七:<input type="text" name="cate7" value="否" /><br><br>
	 类型八:<input type="text" name="cate8" value="否" /><br><br>
		<h5>(请在输入框里填“是”或者“否”)</h5>
		<input type="submit" value="提交"/>
		
		</h4>
	
	</form>
</c:if>
<c:if test="${not empty sessionScope.listassistance}">
<c:forEach items="${sessionScope.listassistance}" var="listassistance">
<form action="updateAssistance">

	
	
	<input type="hidden" name="sid"  value="${sessionScope.sid2}"/>
	 
	 <h3>补助类型：</h3>
	 <h4><br>
	 类型一:<input type="text" name="cate1" value="${listassistance.cate1}"><br><br>
	 类型二:<input type="text" name="cate2" value="${listassistance.cate2}"><br><br>
	 类型三:<input type="text" name="cate3" value="${listassistance.cate3}"><br><br>
	 类型四:<input type="text" name="cate4" value="${listassistance.cate4}"><br><br>
	 类型五:<input type="text" name="cate5" value="${listassistance.cate5}"><br><br>
	 类型六:<input type="text" name="cate6" value="${listassistance.cate6}"><br><br>
	 类型七:<input type="text" name="cate7" value="${listassistance.cate7}"><br><br>
	 类型八:<input type="text" name="cate8" value="${listassistance.cate8}"><br><br>
		<h5>(请在输入框里填“是”或者“否”)</h5>
		<input type="submit" value="提交"/>
		
		</h4>
	
	</form>
	</c:forEach>
	</c:if>



</body>
</html>