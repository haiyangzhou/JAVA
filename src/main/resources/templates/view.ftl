<html>
<head>
    <title>用户信息</title>
</head>
<body>
<center>

</center>
<table border="1px" align="center">
    	<tr>
	    	<td>用户编号</td>
	    	<td>用户名称</td>
	    	<td>用户性别</td>
	    	<td>操作</td>
    	</tr>
	    <#list data as use>
	    	<tr>
		    	<td>${use.id }</td>
		    	<td>${use.name }</td>
		    	<td>${use.sex }</td>
		    	<td> 
 
	
				 </td>
		    	
	    	</tr>
	    </#list>
    </table>
</body>
</html>
