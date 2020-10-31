<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> <!--导入JQuery包 -->
    <script type="text/javascript">
        function test() {
            $.ajax({
                url:"testAjax_DELETE",
                type:"DELETE",
                data:{id:1001},
                dataType:"json",
                success:function (obj) {
                    alert(obj)
                }
            });
        }
    </script>

</head>
<body>

    <a href="testREST/1001"> 测试GET </a> <!-- a标签默认的访问方式是GET -->
    <p>
    <form action="testREST" method="POST"> <!-- 如果想用POST 只能用表单 -->
        <input type="submit" value="测试POST"/>
    </form>

    <form action="testREST" method="POST">
        <input type="hidden" name="_method" value="PUT"/> <!--通过隐藏域 修改操作 -->
        <input type="submit" value="测试PUT"/>
    </form>

    <form action="testREST/1001" method="POST">
        <input type="hidden" name="_method" value="DELETE"/> <!--通过隐藏域 删除操作 -->
        <input type="submit" value="测试DELETE"/>
    </form>

    <input type="button" value="测试AJAX" onclick="test()">

</body>
</html>
