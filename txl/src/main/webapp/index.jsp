<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
</head>
<body>
<form id="add" method="post">
    用户名：<input type="text" name="name"><br/><br/>
    密码：&nbsp<input type="password" name="password">
    <a onclick="abc();" class="easyui-linkbutton" >提交</a>
</form>
<script type="text/javascript">
    function abc(){
        $("#add").form("submit",{
            url:"${pageContext.request.contextPath}/user/register.do",
            onSubmit:function(){
               true;
            },
            success:function(ret){
                if(ret=="ok"){
                   alert("注册成功");
                }
            }
        });
    }
</script>
</body>
</html>
