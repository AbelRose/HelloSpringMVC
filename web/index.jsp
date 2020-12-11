<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- day04 -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                url:"testJson",
                type:"POST",
                dataType:"json",
                success:function (msg){
                    /*
                        [
                            {"id":1001,"lastName":"E-AA","email":"aa@163.com","gender":1,"department":{"id":101,"departmentName":"D-AA"}},
                            {"id":1002,"lastName":"E-BB","email":"bb@163.com","gender":1,"department":{"id":102,"departmentName":"D-BB"}},
                            {"id":1003,"lastName":"E-CC","email":"cc@163.com","gender":0,"department":{"id":103,"departmentName":"D-CC"}},
                            {"id":1004,"lastName":"E-DD","email":"dd@163.com","gender":0,"department":{"id":104,"departmentName":"D-DD"}},
                            {"id":1005,"lastName":"E-EE","email":"ee@163.com","gender":1,"department":{"id":105,"departmentName":"D-EE"}}
                        ]
                    */
                    /* for(var i in msg){
                        var emp = msg[i];
                        alert("id="+emp.id+",lastName="+emp.lastName+",departmentName="+emp.department.departmentName);
                    } */
                    //第一种实现方式
                    /* var tb = "<table>";
                    tb += "<tr><th>id</th><th>lastName</th><th>email</th><th>gender</th><th>departmentName</th></tr>";
                    for(var i in msg){
                        var emp = msg[i];
                        tb += "<tr><td>"+emp.id+"</td><td>"+emp.lastName+"</td><td>"+emp.email+"</td><td>"+emp.gender+"</td><td>"+emp.department.departmentName+"</td></tr>";
                    }
                    tb += "</table>";
                    $("body").append(tb); */
                    //第二种实现方式
                    $("body").append("<table></table>");
                    $("table").append("<tr><th>id</th><th>lastName</th><th>email</th><th>gender</th><th>departmentName</th></tr>");
                    for(var i in msg){
                        var emp = msg[i];
                        $("table").append("<tr><td>"+emp.id+"</td><td>"+emp.lastName+"</td><td>"+emp.email+"</td><td>"+emp.gender+"</td><td>"+emp.department.departmentName+"</td></tr>");
                    }
                }
            });
        });
    });
</script>
<!-- day04 -->

<html>
  <head>
<%-- day01   <title>$Title$</title>--%>
    <title>欢迎</title> <!-- day03 -->
  </head>
  <body>

<%-- day01   <a href="hello?username=admin&password=123456"> 测试springMVC </a>--%>

<%-- day02   <form action="test" method="POST">--%>
<%--      <input type="submit" value="测试POST"/>--%>
<%--    </form>--%>

<%-- day03   <a href="test">测试SpringMVC</a>--%>
<%-- day03   <a href="emps">员工信息</a> <!-- day03 -->--%>

<%-- day04   <input id="btn" type="button" value="测试ajax" />
    <a href="testJson">testJson</a>
--%>

<%--<a href="testException">测试异常</a>--%>

<%-- day05--%>
    <a href="testListener">测试监听器</a>

  </body>
</html>
