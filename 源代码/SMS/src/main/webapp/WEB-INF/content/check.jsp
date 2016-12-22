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
				<th bgcolor="#F0F0F0" data-options="field:'productid',width:100">状态</th>
				<th bgcolor="#F0F0F0" data-options="field:'listprice',width:100">迟到次数</th>
				<th bgcolor="#F0F0F0" data-options="field:'unitcost',width:100">实扣金额</th>
				<th bgcolor="#F0F0F0" data-options="field:'attr1',width:120">请假次数</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">实扣金额</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">应到天数</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">实到天数</th>
				<th bgcolor="#F0F0F0" data-options="field:'status',width:120">实扣金额</th>
				
				<th bgcolor="#F0F0F0" data-options="field:'option',width:120">操作</th>
			</tr>
			
		</thead>
		<tbody>
		 
		
			<tr>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.sid}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.staffname}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.year}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.month}</td>
			<td bgcolor="#F0F0F0" data-options="field:'itemid',width:100">${listunstaff.status}</td>
			<td data-options="width:120" ><input type="text" name="latetimes"  style="width=50" /></td>
			<td data-options="width:120"><input type="text"  name="deduction1" style="width=50"/></td>
			<td data-options="width:120"><input type="text"  name="leavetimes" style="width=50"/></td>
			<td data-options="width:120"><input type="text"  name="deduction2" style="width=50"/></td>
			<td data-options="width:120"><input type="text"  name="shulddays" style="width=50"/></td>
			<td data-options="width:120"><input type="text"  name="realdays" style="width=50"/></td>
			<td data-options="width:120"><input type="text"  name="deduction3" style="width=50"/></td>
			<td data-options="width:120"><input type="submit"  value="提交" style="width=120"/></td>
			
			
			</tr>
		
		
		</tbody>
	</table>
	<input type="hidden" value="${listunstaff.sid}" name="sid" />
			<input type="hidden" value="${listunstaff.year}" name="year" />
			<input type="hidden" value="${listunstaff.month}" name="month"/>
	</form>
	</div>
	</c:forEach>
	
    <div id="_login_div_quick_">
        <div class="login_no_qlogin" id="login">
            
            <div id="header" class="header">
                <div class="switch" id="switch">                   
                    <a class="switch_btn_focus" id="switch_login" href="javascript:void(0);" tabindex="8">漏勤登录</a>
                    <div class="switch_bottom" id="switch_bottom"></div>
                </div>
                <a id="close" class="close" href="javascript:void(0)" title="关闭" tabindex="9"></a>
            </div>
           
            <div class="web_qr_login" id="web_qr_login">
                <div class="web_qr_login_show" id="web_qr_login_show">
                    <div class="web_login" id="web_login">
                        
                        <div class="login_form">
                            <form onsubmit="return chk()" id="loginform" name="loginform" action="#" method="post" target="_self">
								<br/>
								<br/>
                                本月应到天数
                                <input type="text"  id="ff" required /> <br/> 
								<br/>
								<br/>
								本月实到天数
                                <input type="text"  id="ff" required /> <br/>
								<br/>
								<br/>
								本月未到天数
                                <input type="text"  id="ff" required /> <br/>
								<br/>
								<br/>
								<br/>                                                                                                        
                                <input type="submit" id="submit" value="提交"/>
                            </form>
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
    </div>

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