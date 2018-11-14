<html>
<head>
    <title>新增</title>
</head>
<body>
<form action="${request.contextPath}/user/toadduser" method="post">
 
    <table class="gridtable" style="width:800px;">
        <tr>
            <th colspan="5">用户信息 - [<a href="${request.contextPath}/user/toMain">返回</a>]</th>
        </tr>
        <tr>
            <th>用户名称：</th>
            <td><input type="text" name="name" />
            </td>
            <th>用户性别：</th>
            <td><input type="text" name="sex" />
            </td>
            <td><input type="submit" value="保存"/></td>
        </tr>
    <#if msg??>
        <tr style="color:#00ba00;">
            <th colspan="5">${msg}</th>
        </tr>
    </#if>
    </table>
</form>


</body>
</html>
