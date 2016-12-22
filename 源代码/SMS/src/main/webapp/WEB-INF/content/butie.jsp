<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<title>工资设定-补贴</title>
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>	
	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.login.js"></script>
	
</head>
<body>
	<table class="easyui-datagrid" title="Basic DataGrid" style="width:362px "
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'" border="1" cellspacing="0">
		<thead>
			<tr>
				<th bgcolor="#F0F0F0" data-options="field:'phone',width:160">补贴编号</th>
				<th bgcolor="#F0F0F0" data-options="field:'phone',width:160">补贴项目</th>		
				<th bgcolor="#F0F0F0" data-options="field:'home',width:160">补贴金额</th>
				<th bgcolor="#F0F0F0" data-options="field:'option',width:120">操作1</th>
               
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${sessionScope.listassistancesum}" var="listassistancesum">
			<tr>
				<td>${listassistancesum.assistancesumname}</td>
			    <td>${listassistancesum.name}</td>
			    
			    <td>${listassistancesum.assistancesum}</td>
			    <td><a href="listAssistancesumId?asid=${listassistancesum.asid}">修改</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
    <hr>
    
</body>
<script language="javascript">
    function toVaild(){
          var val = document.getElementById("ff").value;
          alert(val);
          if(val == ""){
              alert("请填写全部信息在提交");
               return false;
          }
          else{
               return true;
          }
     }
</script>
</html>