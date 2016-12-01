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
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>	
    <link rel="stylesheet" type="text/css" href="css/index.css">
    
	
    
<title>工资管理系统</title>

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
							<c:if test="${sessionScope.staffname==null}">
								<a href="#">登录</a>
							</c:if>
							<c:if test="${sessionScope.staffname!=null}" var="users">
								<a href="#" >${sessionScope.staffname}您好</a>
							</c:if>	
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
 <!--  轮播图部分 -->  
<div class="box">
    <div class="row">
		<div class="col-md-12">
			<h1 class="text-center">
				工资管理系统
			</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-10">
			<div class="carousel slide" id="carousel-304319">
				<ol class="carousel-indicators">
					<li class="active" data-target="#carousel-304319" data-slide-to="0">
					</li>
					<li data-target="#carousel-304319" data-slide-to="1">
					</li>
					<li data-target="#carousel-304319" data-slide-to="2">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="Carousel Bootstrap First" src="image/1.jpg">
						<div class="carousel-caption">
							<h4>
								工资
							</h4>
							<p>
								固定工作关系里的员工所得的具有发放上的时间规则的薪酬，雇主或者法定用人单位依据法律规定、或行业规定、或根据与员工之间的约定，以货币形式对员工的劳动所支付的报酬。.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="Carousel Bootstrap Second" src="image/2.jpg">
						<div class="carousel-caption">
							<h4>
								合理规划工资
							</h4>
							<p>
								拿到工资后合理地规划，选择投资、理财、储蓄，让“钱”生“钱”
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="Carousel Bootstrap Third" src="image/3.jpg">
						<div class="carousel-caption">
							<h4>
								工资的增加
							</h4>
							<p>
								工资的获得基于你对公司的贡献，为公司创造更多价值，我们没理由不给出更高的工资
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-304319" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-304319" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<div class="col-md-1">
		</div>
	</div>
 <!--  引用部分 -->  
	<div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-4">
			<blockquote>
				<p>
					管理的第一目标是使较高的工资与较低的劳动成本结合起来
				</p> <small>美国古典管理学家  泰罗</small>
			</blockquote>
		</div>
		<div class="col-md-2">
		</div>
		<div class="col-md-4">
			<blockquote>
				<p>
					伟大的成绩和辛勤的劳动是成正比例的，有一分劳动就有一分收获，日积月累，从少到多，奇迹就可以创造出来
				</p> <small>鲁迅</small>
			</blockquote>
		</div>
		<div class="col-md-1">
		</div>
	</div>
<!--  引用部分 --> 
    <div class="row">
		<div class="col-md-2">
		</div>
		<div class="col-md-3">
			<address>
				 <strong>Design by</strong><br> Tom King <br> XuZhou,JiangSu Province,PRC<br> <abbr title="Phone">mobilePhone:</abbr> 18361273097
			</address>
		</div>  
		<div class="col-md-2">
            <address>
				 <strong><br><br><br><br><br>&copy; copyright 2016 EC 2014-2 </strong>
			</address>
		</div>
		<div class="col-md-4"> 
			<address>
				 <strong>School of Management,CUMT .</strong><br>DaXue Road 1<br> XuZhou, JiangSu Province,PRC<br> <abbr title="Phone">P:</abbr> (86) 0521-83591234
			</address>
		</div>
		<div class="col-md-1">
		</div>
	</div>


</div>

</body>
</html>
