<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="param" method="post">
        username:<input type="text" name="name"><br>   对应required = false
        password:<input type="text" name="password"><br>
        age:<input type="text" name="age"><br>
        province:<input type="text" name="address.province"><br> <!-- 支持级联关系 可以从USer中的address属性获取值 表单名和name属性名一致才行 -->
        city:<input type="text" name="address.city"><br>
        country:<input type="text" name="address.country"><br>
        <input type="submit" value="添加">
    </form>

</body>
</html>
