<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>Basic DataGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:1202px"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:100">员工编号</th>
				<th data-options="field:'productid',width:100">员工姓名</th>
				<th data-options="field:'listprice',width:100">性别</th>
				<th data-options="field:'unitcost',width:100">年龄</th>
				<th data-options="field:'attr1',width:120">部门</th>
				<th data-options="field:'status',width:120">职位</th>
				<th data-options="field:'option',width:120">考核状态</th>
				
			</tr>
		</thead>
		<tbody>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>已考核</td>
			
		</tbody>
	</table>
</body>
</html>