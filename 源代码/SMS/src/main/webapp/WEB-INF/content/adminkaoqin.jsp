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
    <div>
		按部门查询：
		选择查询部门&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<select style="width:130px">
			<option value ="部门1">部门1</option> 
			<option value ="部门2">部门2</option> 
			<option value ="部门3">部门3</option> 
			<option value ="部门4">部门4</option> 
			<option value ="所有部门">所有部门</option> 
		</select>
		选择查询年份
		<select>
			<option value ="2017">2017</option> 
			<option value ="2016">2016</option> 
			<option value ="2015">2015</option> 
			<option value ="2014">2014</option> 
		</select>
		月份
		<select>
			<option value ="0">0</option> 
			<option value ="1">1</option> 
			<option value ="2">2</option> 
			<option value ="3">3</option>
            		<option value ="4">4</option>
            		<option value ="5">5</option>
            		<option value ="6">6</option>
            		<option value ="7">7</option>
           		<option value ="8">8</option>
            		<option value ="9">9</option>
            		<option value ="10">10</option>
            		<option value ="11">11</option>
           		<option value ="12">12</option> 
		</select>
        <input type="submit" value="查询"	/>
	</div>
<br>
    <div>
		按员工查询：
		输入查询员工编号
		<input type="text" />
		选择查询年份
		<select>
			<option value ="2017">2017</option> 
			<option value ="2016">2016</option> 
			<option value ="2015">2015</option> 
			<option value ="2014">2014</option> 
		</select>
		月份
		<select>
			<option value ="0">0</option> 
			<option value ="1">1</option> 
			<option value ="2">2</option> 
			<option value ="3">3</option>
            		<option value ="4">4</option>
            		<option value ="5">5</option>
            		<option value ="6">6</option>
            		<option value ="7">7</option>
           		<option value ="8">8</option>
            		<option value ="9">9</option>
            		<option value ="10">10</option>
            		<option value ="11">11</option>
           		<option value ="12">12</option> 
		</select>
        <input type="submit" value="查询"	/>
	</div>
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
                <th field="inv" width="80">Inv No</th>
                <th field="date" width="100">Date</th>
                <th field="name" width="80">Name</th>
                <th field="amount" width="80" align="right">Amount</th>
                <th field="price" width="80" align="right">Price</th>
                <th field="cost" width="100" align="right">Cost</th>
                <th field="note" width="110">Note</th>
            </tr>
        </thead>
    </table>
    <script>
 
        function getData(){//模拟数据
            var rows = [];
            for(var i=1; i<=80000; i++){
                var amount = Math.floor(Math.random()*1000);
                var price = Math.floor(Math.random()*1000);
                rows.push({
                    inv: 'Inv No '+i,
                    date: $.fn.datebox.defaults.formatter(new Date()),
                    name: 'Name '+i,
                    amount: amount,
                    price: price,
                    cost: amount*price,
                    note: 'Note '+i
                });
            }
            //console.log(JSON.stringify(rows));
            return rows;
 
        }
 
        function pagerFilter(data){
            if (typeof data.length == 'number' && typeof data.splice == 'function'){    // 判断数据是否是数组
                data = {
                    total: data.length,
                    rows: data
                }
            }
            var dg = $(this);
            var opts = dg.datagrid('options');
            var pager = dg.datagrid('getPager');
            pager.pagination({
                onSelectPage:function(pageNum, pageSize){
                    opts.pageNumber = pageNum;
                    opts.pageSize = pageSize;
                    pager.pagination('refresh',{
                        pageNumber:pageNum,
                        pageSize:pageSize
                    });
                    dg.datagrid('loadData',data);
                }
            });
            if (!data.originalRows){
                data.originalRows = (data.rows);
            }
            var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
            var end = start + parseInt(opts.pageSize);
            data.rows = (data.originalRows.slice(start, end));
            return data;
        }
 
        $(function(){//加载数据
            $('#dg').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData());
        });
    </script>
</body>
</html>