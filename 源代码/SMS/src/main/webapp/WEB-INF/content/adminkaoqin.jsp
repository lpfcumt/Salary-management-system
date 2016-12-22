<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>员工考勤记录</title>
   <link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>		
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.login.js"></script>	
</head>
<body>
	<form action="listAdByTime" method="post">
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
        <input type="submit" value="查询"	/>
	</div>
	</form>
<br>
	<form action="listAttendance" method="post">
    <div>
		按员工查询：
		输入查询员工编号
		<input type="text" name="sid"/>
		
        <input type="submit" value="查询"	/>
	</div>
	</form>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div></div>
    </div>
    <div style="margin:10px 0;"></div>
 
    <table class="easyui-datagrid" title="Basic DataGrid" style="width:1202px "
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'" border="1" cellspacing="0">
        <thead>
		
			<tr>
				<th bgcolor="#F0F0F0" data-options="field:'itemid',width:100">员工编号</th>
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">员工姓名</th>
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">年份</th>
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">月份</th>
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">状态</th>
				<th bgcolor="#F0F0F0" data-options="field:'listprice',width:100">迟到次数</th>
				<th bgcolor="#F0F0F0" data-options="field:'unitcost',width:100">实扣金额</th>
				<th bgcolor="#F0F0F0" data-options="field:'attr1',width:120">请假次数</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">实扣金额</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">应到天数</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">实到天数</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">实扣金额</th>
				
				
			</tr>
			
		</thead>
		<tbody>
		 
		<c:forEach items="${sessionScope.listadbytime}" var="listadbytime">
			<tr>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listadbytime.sid}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listadbytime.staffname}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listadbytime.year}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listadbytime.month}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listadbytime.status}</td>
			<td data-options="width:120" >${listadbytime.latetimes}</td>
			<td data-options="width:120">${listadbytime.deduction1}</td>
			<td data-options="width:120">${listadbytime.leavetimes}</td>
			<td data-options="width:120">${listadbytime.deduction2}</td>
			<td data-options="width:120">${listadbytime.shulddays}</td>
			<td data-options="width:120">${listadbytime.realdays}</td>
			<td data-options="width:120">${listadbytime.deduction3}</td>
			
			
			
			</tr>
		</c:forEach>
		
		</tbody>
    </table>

</body>
</html>