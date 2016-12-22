<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>所有员工信息</title>
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript">
  		function rec(){
    	alert("确认发放吗？");
  		}
   </script>
</head>
<body>
	<div>
		<input type="submit" value="新建发放工资记录"/>	
		<input name="button" type="button" onClick="rec()" value="发放所有员工工资" />
	</div>
	<table class="easyui-datagrid" title="" style="width:1200px"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:120">员工编号</th>
				<th data-options="field:'productid',width:120">员工姓名</th>
				<th data-options="field:'productid',width:120">部门</th>
				<th data-options="field:'listprice',width:120">年份</th>
				<th data-options="field:'attr1',width:120">月份</th>
				<th data-options="field:'attr1',width:120">状态</th>
				
				<th data-options="field:'option',width:250">操作</th>
			</tr>
		</thead>
	</table>
		<table class="easyui-datagrid" title="" style="width:1200px"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
			<thead>
			<c:forEach items="${sessionScope.liststaff1}" var="liststaff1">
			<tr>
				<th data-options="field:'itemid',width:120">${liststaff1.sid}</th>
				<th data-options="field:'productid',width:120">${liststaff1.staffname}</th>
				<th data-options="field:'listprice',width:120">${liststaff1.department}</th>
				<th data-options="field:'attr1',width:120">${liststaff1.year}</th>
				<th data-options="field:'status',width:120">${liststaff1.month}</th>
				<th data-options="field:'home',width:160">${liststaff1.status}</th>
				
				<th data-options="field:'option',width:250"><a href="settleTotalsalary?sid=${liststaff1.sid}">结算</a></th>
			</tr>
			</c:forEach>
		</thead>
		
		</table>
	
</body>
</html>