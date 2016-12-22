<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>jQuery仿QQ登陆表单DEMO演示</title>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.login.js" ></script>
</head>
<body>
    <!-- 代码 开始 -->
    <p id="loginStart" style="text-align:center">点击设定计件工资</p>
    <div id="_login_div_quick_">
        <div class="login_no_qlogin" id="login">           
            <div id="header" class="header">
                <div class="switch" id="switch">                   
                    <a class="switch_btn_focus" id="switch_login" href="javascript:void(0);" tabindex="8">计件工资设定</a>
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
                                <br/>
                                每件工资额：
                                <input type="text"  id="ff" required /><br/>
                                <br/>
                                <br/>
                                <br/>                                                                                                          
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" id="submit" value="提交"/>
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
    <!-- 代码 结束 -->
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
