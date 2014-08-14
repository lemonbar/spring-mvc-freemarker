<#import "/spring.ftl" as spring/>
<html>
<head>
    <title>Please input your names, seperator with '-' char.</title>
</head>
<body>
<#include "./header.ftl"/>
<form action="greeting" method="POST" name="user">
    First Name:
    <input type="text" name="firstName"/><br>
    Last Name:
    <input type="text" name="lastName"/><br>
    <input type="submit" value="submit"/>
</form>
<!--use include to include another ftl file content in this file.-->
<#include "./footer.ftl"/>
</body>
</html>