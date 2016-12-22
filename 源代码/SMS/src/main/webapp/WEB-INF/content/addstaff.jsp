<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加用户</title>
<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link rel="stylesheet" type="text/css" href="css/login.css"/>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>		
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.login.js"></script>
</head>
<body>
	
        
                            <form onsubmit="return chk()" id="loginform" name="loginform" action="addStaff" method="post" target="_self" height="600px">
								<table cellpadding=3>
										<tr>
											<td>姓名：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="staffname"/></td>
										</tr>
										
										<tr>
											<td>年龄：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="address"/></td>
										</tr>
										<tr>
											<td>性别：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="sex"/></td>
										</tr>
										<tr>
										<tr>
											<td>联系方式：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="tel"/></td>
										</tr>
										<tr>
											<td>邮箱：</td>
											<td><input id="txtNewPass" type="email" class="txt01" name="email"/></td>
										</tr>
										<tr>
											<td>家庭住址：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="address"/></td>
										</tr>
										<tr>
											<td>所属部门：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="dept"/></td>
										</tr>
										<tr>
											<td>职位：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="job"/></td>
										</tr>
										<tr>
											<td>出生年月：</td>
											<td><input id="txtNewPass" type="text" class="txt01" name="birthday"/></td>
										</tr>
										<tr>
											<td>工资类型：</td>
											<td><select name="basesalarycate">
											<c:forEach items="${sessionScope.listcate}" var="listcate">
													<option value ="${listcate}">${listcate}</option> 
													
											</c:forEach>
												</select></td>
										</tr>
													
               						 </table>
									<input type="submit" value="添加" />
                            </form>
                       
    
</body>
</html>