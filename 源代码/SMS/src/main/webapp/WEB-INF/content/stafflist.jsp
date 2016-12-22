<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>员工列表</title>
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
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:1332px"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:100">员工编号</th>
				<th data-options="field:'productid',width:100">员工姓名</th>
				<th data-options="field:'listprice',width:100">性别</th>
				<th data-options="field:'unitcost',width:100">年龄</th>
				<th data-options="field:'attr1',width:120">部门</th>
				<th data-options="field:'status',width:120">职位</th>
				<th data-options="field:'jointime',width:120">入职时间</th>
				<th data-options="field:'phone',width:160">联系方式</th>
				<th data-options="field:'home',width:160">住址</th>
				<th data-options="field:'optio1',width:120">操作1</th>
				<th data-options="field:'option',width:120">操作2</th>
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
			<td>2016-11-23</td>
			<td>13549863321</td>
			<td>江苏省徐州市</td>
			<td><a href="adminstaff.jsp">删除</a></td>
			<td><a href="adminstaff.jsp">修改</a></td>
			</tr>
		</tbody>
	</table>
  <input id="loginStart" type="button" value="添加" />
  <div id="_login_div_quick_">
        
                            <form onsubmit="return chk()" id="loginform" name="loginform" action="#" method="post" target="_self" height="600px">
								<table cellpadding=3>
										<tr>
											<td>姓名：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>性别：</td>
											<td><input id="txtRePass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>年龄：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>联系方式：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>邮箱：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>家庭住址：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>所属部门：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>职位：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>入职时间：</td>
											<td><input id="txtNewPass" type="Password" class="txt01" /></td>
										</tr>
										<tr>
											<td>补助类别：</td>
											<td>
												<label><select><option value="是">是</option><option value="否">否</option></select>补助1</label><br>
												<label><select><option value="是">是</option><option value="否">否</option></select>补助2</label><br>
												<label><select><option value="是">是</option><option value="否">否</option></select>补助3</label><br>
												<label><select><option value="是">是</option><option value="否">否</option></select>补助4</label><br>
											</td>
										</tr>					
               						 </table>
									<input type="submit" value="添加" />
                            </form>
                       
    </div>
	<script type="text/javascript">
    $.login('#loginStart');
</script>
</body>
</html>