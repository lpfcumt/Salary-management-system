<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>工资查询</title>
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>		
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.login.js"></script>	
</head>
<body>
	<form action="listTotalsalaryByDept" method="post">
    <div>
		按时间查询：
		
		选择查询年份
		<select name="year">
			<option value ="2017">2017</option> 
			<option value ="2016">2016</option> 
			<option value ="2015">2015</option> 
			<option value ="2014">2014</option> 
		</select>
		月份
		<select name="month">
			<option value ="0">0</option> 
			<option value ="1">1</option> 
			<option value ="2">2</option> 
			<option value ="3">3</option>
            		<option value ="4">4</option>
            		<option value ="5">5</option>
            		<option value ="6">6</option>
            		<option value ="7">7</option>
           		<option value ="8">8</option>
            		<option value ="9">9</option>
            		<option value ="10">10</option>
            		<option value ="11">11</option>
           		<option value ="12">12</option> 
		</select>
		部门名称：<input name="department" type="text"/>
        <input type="submit" value="查询"	/>
	</div>
	</form>
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:1202px "
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'" border="1" cellspacing="0">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:120">员工编号</th>
				<th data-options="field:'productid1',width:120">员工姓名</th>
				<th data-options="field:'producti13d',width:120">部门</th>
				<th data-options="field:'listp131rice',width:120">年份</th>
				<th data-options="field:'at54tr1',width:120">月份</th>
				<th data-options="field:'att654r1',width:120">状态</th>
				<th data-options="field:'sta13tus',width:120">补助工资</th>
				<th data-options="field:'ho153me',width:160">基本工资</th>
				<th data-options="field:'ho543ma',width:160">职位工资</th>
				<th data-options="field:'ho45352ma',width:160">奖金</th>
				<th data-options="field:'ho54345ma',width:160">实扣工资</th>
				<th data-options="field:'ho453ma',width:160">合计</th>
				<th data-options="field:'ho543453ma',width:160">实发工资</th>
				<th data-options="field:'ho45354ma',width:160">备注</th>
				<th data-options="field:'ho45354ma',width:160">时间</th>
				<th data-options="field:'opt213ion',width:250">操作员</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sessionScope.listtotalsalary}" var="listtotalsalary">
			<tr>
				<td>${listtotalsalary.sid}</td>
				<td>${listtotalsalary.staffname}</td>
				<td>${ listtotalsalary.department}</td>
				<td>${ listtotalsalary.year}</td>
				<td>${ listtotalsalary.month}</td>
				<td>${ listtotalsalary.status}</td>
				<td>${ listtotalsalary.assistancesum}</td>
				<td>${ listtotalsalary.basesalarysum}</td>
				<td>${ listtotalsalary.jobsum}</td>
				<td>${ listtotalsalary.rewardsum}</td>
				<td>${ listtotalsalary.deductionsum}</td>
				<td>${ listtotalsalary.totalsum}</td>
				<td>${ listtotalsalary.realsum}</td>
				<td>${ listtotalsalary.tip}</td>
				<td>${ listtotalsalary.times}</td>
				<td>${ listtotalsalary.adminname}</td>
				
				
			</tr>
			</c:forEach>
		</tbody>
		
		</table>
</body>
</html>