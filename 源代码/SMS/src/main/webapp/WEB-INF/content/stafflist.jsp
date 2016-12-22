<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:1600px"
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:100">员工编号</th>
				<th data-options="field:'productid',width:100">员工姓名</th>
				<th data-options="field:'listprice',width:100">性别</th>
				<th data-options="field:'unitcost',width:100">出生年月</th>
				<th data-options="field:'attr1',width:120">部门</th>
				<th data-options="field:'status',width:120">职位</th>
				<th data-options="field:'jointime',width:120">入职时间</th>
				<th data-options="field:'phone',width:160">联系方式</th>
				<th data-options="field:'hom465e',width:160">住址</th>
				<th data-options="field:'home',width:160">基本工资等级</th>
				<th data-options="field:'optio1',width:120">操作1</th>
				<th data-options="field:'option',width:120">操作2</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sessionScope.listallstaff}" var="listallstaff">
			<tr>
			<td>${listallstaff.sid}</td>
			<td>${listallstaff.staffname}</td>
			<td>${listallstaff.sex}</td>
			<td>${listallstaff.birthday}</td>
			<td>${listallstaff.dept}</td>
			<td>${listallstaff.job}</td>
			<td>${listallstaff.jointime}</td>
			<td>${listallstaff.tel}</td>
			<td>${listallstaff.address}</td>
			<td>${listallstaff.basesalarycate}</td>
			<td><a href="deleteStaff?sid=${listallstaff.sid}">删除</a></td>
			<td><a href="listStaff1?sid=${listallstaff.sid}">修改</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />
  <a  type="button" href="listBasesalarycate1" >添加员工</a>
  <div id="_login_div_quick_">
        
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
													<option value ="等级一">等级一</option> 
													<option value ="等级二">等级二</option> 
													<option value ="等级三">等级三</option> 
													<option value ="等级四">等级四</option>
													<option value ="等级五">等级五</option>
													<option value ="等级六">等级六</option> 
												</select></td>
										</tr>
													
               						 </table>
									<input type="submit" value="添加" />
                            </form>
                       
    </div>
	
</body>
</html>