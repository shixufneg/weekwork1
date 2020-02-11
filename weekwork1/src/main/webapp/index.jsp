<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游戏页面</title>
    <style>
    </style>
</head>
<body>
<form action="" method="get">
    <div><input type="text" placeholder="请输入生肖" name="ming"></div>
    <div><input type="text" placeholder="请输入月份数字" name="yue"></div>
    <div><input type="text" placeholder="请输入星座" name="dong"></div>
    <input type="submit" value="确认" onclick="x()">
</form>
</body>
<script src="../../js/jquery-3.3.1.js"></script>
<script>
    function x() {
        <%--alert(<%=request.getAttribute("name")%>)--%>
        // alert("浴小绯")
        alert(<%=request.getAttribute("name1")%>)
    }
</script>
</html>
