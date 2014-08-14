<html>
<head>
    <title>Welcome!</title>
</head>
<body>
<#include "./header.ftl"/>
<table border="1">
    <tr><th>Name</th><th>Price</th></tr>
    <#list userList as user>
        <tr><th>${user}</th><th>1.0</th></tr>
    </#list>
</table>
<!--use include to include another ftl file content in this file.-->
<#include "./footer.ftl"/>
</body>
</html>