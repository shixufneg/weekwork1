<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游戏页面</title>
    <style>
        /*body{*/
            /*background: black;*/
        /*}*/
        #wk{
            width: 300px;
            height: 300px;
            background: white;
        }
    </style>
</head>
<body>
<div id="wk">
    <button onclick="getValue(this)">出拳</button>
</div>
</body>
<script src="../../js/jquery-3.3.1.js"></script>
<script>
    function getValue(num1){
        var num = 0;
        var img = document.getElementById("computer");
        var sheng = document.getElementById("sheng");
        var shu = document.getElementById("shu");
        if(img.getAttribute("src") == "0.png"){
            num = 0 ;

        }else if(img.getAttribute("src")== "1.png"){
            num=1;
        }else if(img.getAttribute("src") == "2.png"){
            num=2;
        }
        alert(num1);
        alert(num);
        //玩家出剪刀时
        if(num1 == 0){
            if(num1 - num == -1){
                shu.innerText = parseInt(shu.innerText)+1;
            }else if(num1 - num == -2){
                sheng.innerText = parseInt(sheng.innerText)+1;
            }else if(num1 - num==0){
                sheng.innerText = parseInt(sheng.innerText);
                shu.innerText = parseInt(shu.innerText);
            }
        }
        //玩家出石头时
        if(num1 - num == 1){
            sheng.innerText = parseInt(sheng.innerText)+1;
        }else if(num1 - num==0){
            sheng.innerText = parseInt(sheng.innerText);
            shu.innerText = parseInt(shu.innerText);
        }else if(num1-num == -1){
            shu.innerText = parseInt(shu.innerText)+1;
        }

//                玩家出布的时候
        if(num1- num ==2){
            shu.innerText = parseInt(shu.innerText)+1;
        }else if(num1-num == 1){
            sheng.innerText = parseInt(sheng.innerText)+1;
        }else if(num1 - num==0){
            sheng.innerText = parseInt(sheng.innerText);
            shu.innerText = parseInt(shu.innerText);
        }

    }
</script>
</html>
