<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后��? -->
    <link rel="stylesheet" type="text/css" href="css/css/bootstrap.min.css">
    <script src="js/js/jquery-1.11.0.min.js"></script>
    <script src="js/js/bootstrap.min.js"></script>	
    <link rel="stylesheet" type="text/css" href="css/css/login.css">
    
    
<title>员工登录页面</title>

</head>

<body>

 <!--  顶部导航 -->   
		<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default navbar-static-top" role="navigation">
				<div class="navbar-header">
					 
					<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="#">Brand</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">登录</a>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li>
							<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input class="form-control" type="text">
						</div> 
						<button class="btn btn-default" type="submit">
							Submit
						</button>
							</form>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>
 <!--  登录部分 -->  
<div class="box">
	<div class="login-box">
		<div class="login-title text-center">
			<h1><small>登录框</small></h1>
		</div>
		<div class="login-content">
			
			<div class="form">
				<form action="loginStaff" method="post" id="myform">
					<div class="form-group">
						<div class="col-xs-12  ">
							<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
							<input type="text" id="username" name="username" class="form-control" placeholder="用户名">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12  ">
							<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="password" id="password" name="password" class="form-control" placeholder="密码">
							</div>
						</div>
					</div>
					
				<div class="form-group form-actions">
					<div class="col-xs-4 col-xs-offset-4 ">
						<button type="submit" class="btn btn-sm btn-info" value="登录" onclick="return checkForm()"><span class="glyphicon glyphicon-off"></span> 登录</button>
					</div>
				</div>

			</form>
			</div>
			
		</div>
	</div>
</div>
  
<script>
function checkForm(){
	var username=$("#username").val();
	var password=$("#password").val();
	
	
	$.ajax({
		   url:'aa',// 跳转到 action  
		   data:{  
	    		username : username,password : password  
		    }, 
		    type:'post',  
		    cache:false,  
		    dataType:'json',  
		    success:function(data) { 
		    	console.log(data);
		    	if(data.flag==false){
		    		alert("密码错误,请重新输入!");
		    		 return false;
		    	}
		    	else{
		    		
		    		
		    		
		    		$("#myform").submit();
			    	return true;
			    	}
		     }
		   
	})
	return false;
	
};

</script>



</body>
</html>
