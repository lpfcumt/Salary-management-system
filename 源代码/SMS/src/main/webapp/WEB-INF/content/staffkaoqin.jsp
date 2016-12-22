<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>员工考勤记录</title>
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
                <th field="price" width="80" align="right">迟到次数</th>
                <th field="cost" width="100" align="right">实扣金额</th>
                <th field="price" width="80" align="right">请假次数</th>
                <th field="cost" width="100" align="right">实扣金额</th> 
                <th field="price" width="80" align="right">应到天数</th>
                <th field="price" width="80" align="right">实到天数</th>
                <th field="cost" width="100" align="right">实扣金额</th>
                <th field="cost" width="100" align="right">状态</th>
                <th field="cost" width="100" align="right">考勤时间</th>                
            </tr>
        </thead>
         <tbody>
        <c:forEach items="${sessionScope.listsalary}" var="listsalary">
        	<tr>
        		<td>${listsalary.sid}</td>
        		<td>${listsalary.staffname}</td>
        		<td>${listsalary.year}</td>
        		<td>${listsalary.month}</td>
        		<td>${listsalary.latetimes}</td>
        		<td>${listsalary.deduction1}</td>
        		<td>${listsalary.leavetimes}</td>
        		<td>${listsalary.deduction2}</td>
        		<td>${listsalary.shulddays}</td>
        		<td>${listsalary.realdays}</td>
        		<td>${listsalary.deduction3}</td>
        		<td>${listsalary.status}</td>
        		<td>${listsalary.time}</td>
        	</tr>
        </c:forEach>
        </tbody>
    </table>
    
</body>
</html>