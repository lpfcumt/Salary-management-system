<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>员工工资记录</title>
    <link rel="stylesheet" type="text/css" href="css/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/icon.css">
    <link rel="stylesheet" type="text/css" href="css/demo.css">
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
 <form action="listTotalsalaryBySid" method="post">
   <div >
		选择查询年份
		<select name="year">
			<option value ="2017">2017</option> 
			<option value ="2016">2016</option> 
			<option value ="2015">2015</option> 
			<option value ="2014">2014</option> 
		</select>
        <input type="submit" value="查询"	/>
	</div>
	</form>
    <div class="demo-info">
        <div class="demo-tip icon-tip"></div>
        <div></div>
    </div>
    <div style="margin:10px 0;"></div>
 
    <table id="dg" title="Client Side Pagination" style="width:1200px;height:500px" data-options="
                rownumbers:true,
                singleSelect:true,
                autoRowHeight:false,
                pagination:true,
                pageSize:10">
        <thead>
            <tr>
                <th field="inv" width="80">员工编号</th>
                <th field="date" width="100">员工姓名</th>
                <th field="name" width="80">年份</th>
                <th field="amount" width="80" align="right">月份</th>
                <th field="price" width="100" align="right">基本工资</th>
                <th field="cost" width="100" align="right">职位工资</th>
                <th field="note" width="100">补助工资</th>
                <th field="note" width="100">奖金</th>
                <th field="note" width="100">实扣工资</th>
                <th field="note" width="100">总计</th>
                <th field="note" width="100">实发</th>
                <th field="note" width="100">状态</th>
                <th field="note" width="100">备注</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${sessionScope.listsalary}" var="listsalary">
        	<tr>
        		<td>${listsalary.sid}</td>
        		<td>${listsalary.staffname}</td>
        		<td>${listsalary.year}</td>
        		<td>${listsalary.month}</td>
        		<td>${listsalary.basesalarysum}</td>
        		<td>${listsalary.jobsum}</td>
        		<td>${listsalary.assistancesum}</td>
        		<td>${listsalary.rewardsum}</td>
        		<td>${listsalary.deductionsum}</td>
        		<td>${listsalary.totalsum}</td>
        		<td>${listsalary.realsum}</td>
        		<td>${listsalary.status}</td>
        		<td>${listsalary.tip}</td>
        	</tr>
        </c:forEach>
        </tbody>
    </table>
   
</body>
</html>