<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>
<script>
function checkForm(){
var theForm=document.form1;
if(theForm.username.value==""){
	alert("请输入用户名！");
}
else if(theForm.password.value==""){
	alert("请输入密码！");
}
else {
	theForm.submit();
}
}
function clearbox(){
var theForm=document.form1;
	theForm.username.value="";
}
function selectbox(){
var usernameText=document.getElementById("username");
usernameText.select();
}
</script>
<body>
<form id="form1" name="form1"  action="UserManager?action=login" method="post">
  <label></label>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <table width="301" border="0" align="center">
    <tr>
      <td width="125"><div align="right">用户名:</div></td>
      <td width="200"><label>
        <input name="username" type="text" id="username" value="admin" onfocus="selectbox()" onclick="clearbox()" />
      </label></td>
    </tr>
    <tr>
      <td><div align="right">密码:</div></td>
      <td><input name="password" type="password" id="password" /></td>
    </tr>
    <tr>
      <td colspan="2"><label>
        <div align="center">
          <input type="button"  value="提交" onclick="JavaScript:checkForm();" />
        </div>
      </label></td>
    </tr>
  </table>
</form>
</body>
</html>
