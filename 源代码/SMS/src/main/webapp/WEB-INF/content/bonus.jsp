<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<title>Basic DataGrid - jQuery EasyUI Demo</title>
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
				<th bgcolor="#F0F0F0" data-options="field:'phone',width:160">奖金等级</th>
				<th bgcolor="#F0F0F0" data-options="field:'home',width:160">奖金金额</th>
				<th bgcolor="#F0F0F0" data-options="field:'option',width:120">操作1</th>
                <th bgcolor="#F0F0F0" data-options="field:'option2',width:120">操作2</th>
			</tr>
		</thead>
		<tbody>
			<tr>
			    <td>等级A</td>
			    <td>2300</td>
			    <td id="loginStart" ><font size="3">修改</font></td>
                <td>删除</td>
			</tr>
		</tbody>
	</table>
    <hr>
    <div>
        <h2>新增技能等级</h2>
        <form> 
		技能&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" /></br>
        </br>
        技能工资&nbsp;&nbsp;<input type="text" /></br>
        </br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" value="新建" />
        </form>
	</div>
    <div id="_login_div_quick_">
        <div class="login_no_qlogin" id="login">            
            <div id="header" class="header">
                <div class="switch" id="switch">                   
                    <a class="switch_btn_focus" id="switch_login" href="javascript:void(0);" tabindex="8">工资设定</a>
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
                                <br/>
								<br/>
								<br/> 
                                奖金金额：
                                <input type="text"  id="ff" required /> 
								<br/>
								<br/>
								<br/>                                                                                                        
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="submit" id="submit" value="提交"/>
                            </form>
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
    </div>
<script type="text/javascript">
    $.login('#loginStart');
</script>
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