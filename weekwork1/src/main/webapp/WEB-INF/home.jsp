<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/5 0005
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游戏页面</title>
    <style>
        button{
            border: none;
        }
        #wk{
            width: 300px;
            height: 300px;
            background: white;
            border: 1px black solid;
            color:red;
            font-style: italic;
            font-weight: bold;
        }
        #cjwk{
            width: 100%;
            height: 900px;
        }
    </style>
</head>
<body>
<div id="cjwk">
    <button id="blue">蓝色</button>
    <button id="green">绿色</button>
    <div id="wk" ></div>
    <div>输入颜色首字母： <input type="text" id="i1"  onchange="myInput()">
        <button id="b1">确认</button>
    </div>
</div>

</body>
<script src="../../js/jquery-3.3.1.js"></script>
<script>
    $(document).ready(function(){
        alert("欢迎来到斑斓界——流光梦境，请选择自己喜欢的模式");
    })
    $("#blue").click(function(){
        $("#wk").css("background-color","blue")
        $("#wk").text("蓝色背景");
        $("#blue").css("background-color","blue")
        $("#green").css("background-color","white")
    });
    $("#green").click(function(){
        $("#wk").css("background-color","green")
        $("#wk").text("绿色背景");
        $("#blue").css("background-color","white")
        $("#green").css("background-color","green")
    });
    //大小写转换
    function myInput() {
        var x = document.getElementById("i1");
        x.value = x.value.toUpperCase()
    }
    //按钮功能
    document.getElementById("b1").addEventListener("click",buttonXD)
    function buttonXD() {
        //获取input的值
        var a = document.getElementById("i1");
        var b = a.value;
        if(b == "B"){
            var elementById = document.getElementById("wk");
            elementById.style.backgroundColor="blue";
        }else if(b == "G"){
            var elementById = document.getElementById("wk");
            elementById.style.backgroundColor="green";
        }
    }
</script>
</html>
