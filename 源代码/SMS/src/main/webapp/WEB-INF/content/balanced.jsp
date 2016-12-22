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
	选择查询部门
		<select>
			<option value ="所有部门">所有部门</option> 
			<option value ="部门1">部门1</option> 
			<option value ="部门2">部门2</option> 
			<option value ="部门3">部门3</option> 
		</select>
	</div>
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:1200px"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:120">员工编号</th>
				<th data-options="field:'productid',width:120">员工姓名</th>
				<th data-options="field:'listprice',width:120">基本工资</th>
				<th data-options="field:'attr1',width:120">岗位工资</th>
				<th data-options="field:'status',width:120">技能工资</th>
				<th data-options="field:'home',width:160">奖金</th>
				<th data-options="field:'homa',width:160">补贴</th>
				<th data-options="field:'option',width:250">总计</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
				<td>7</td>
				<td>6000</td>
			</tr>
		</tbody>
	</table>
</body>
</html>