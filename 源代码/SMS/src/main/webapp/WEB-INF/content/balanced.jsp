<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>结算员工工资</title>
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	
</head>
<body>
<form action="listStaff3" method="post">

	<table  title="Basic DataGrid" style="width:1200px"
			>
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
				<th data-options="field:'opt213ion',width:250">操作</th>
			</tr>
		</thead>
		<tbody>
			
			<tr>
				<td>${sessionScope.staffid}</td>
				<td>${sessionScope.staffname1}</td>
				<td>${ sessionScope.department}</td>
				<td>${ sessionScope.year}</td>
				<td><s:property value="#session.month"/></td>
				<td><s:property value="#session.status"/></td>
				<td><s:property value="#session.assistancesum"/></td>
				<td><s:property value="#session.basesalarysum"/></td>
				<td><s:property value="#session.jobsum"/></td>
				<td><s:property value="#session.rewardsum"/></td>
				<td><s:property value="#session.deduction"/></td>
				<td><s:property value="#session.totalsum"/></td>
				<td><input type="text" name="realsum"></input></td>
				<td><input type="text" name="tip"></input></td>
				<td><input type="submit" value="发放" ></input></td>
				
				
			</tr>
			
		</tbody>
		
		</table>
		<input type="hidden" name="sid" value="${sessionScope.staffid}"></input>
		
		<input type="hidden" name="department" value="${ sessionScope.department}"></input>
		<input type="hidden" name="assistancesum" value="${ sessionScope.assistancesum}"></input>
		<input type="hidden" name="basesalarysum" value="${ sessionScope.basesalarysum}"></input>
		<input type="hidden" name="rewardsum" value="<s:property value="#session.rewardsum"/>"></input>
		<input type="hidden" name="deductionsum" value="${ sessionScope.deduction}"></input>
		<input type="hidden" name="totalsum" value="${ sessionScope.totalsum}"></input>
		<input type="hidden" name="jobsum" value="${ sessionScope.jobsum}"></input>
</form>
</body>

</html>