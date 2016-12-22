<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<title>添加考勤</title>
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>		
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.login.js"></script>	
</head>
<body>
		<table class="easyui-datagrid" title="Basic DataGrid" style="width:1202px "
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'" border="1" cellspacing="0">
		
		</table>
		 <c:forEach items="${sessionScope.listunstaff}" var="listunstaff">
		 <div>
		 <form action="addAttendance" method="post">
		
		<table class="easyui-datagrid" title="Basic DataGrid" 
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'" border="1" cellspacing="0">
			<thead>
		
			<tr>
				<th bgcolor="#F0F0F0" data-options="field:'itemid',width:100">员工编号</th>
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">员工姓名</th>
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">年份</th>
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">月份</th>
				
				
				<th bgcolor="#F0F0F0" data-options="field:'option',width:120">操作</th>
			</tr>
			
		</thead>
		<tbody>
		 
		
			<tr>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.sid}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.staffname}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.year}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.month}</td>
			
			<td data-options="width:120"><input type="submit"  value="新建" style="width=120"/></td>
			
			
			</tr>
		
		
		</tbody>
	</table>
	<input type="hidden" value="${listunstaff.sid}" name="sid" />
			<input type="hidden" value="${listunstaff.year}" name="year" />
			<input type="hidden" value="${listunstaff.month}" name="month"/>
	</form>
	</div>
	</c:forEach>
</body>
</html>