<%@ page language="java" import="java.util.*"
	import="com.fsq.beans.User" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'main.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<base href="<%=basePath%>">
<link rel="stylesheet" href="static/css/lightbox.css" type="text/css" media="screen" />
<script src="static/js/jquery-1.7.2.min.js"></script>


</head>
<body style='backgroud:pink'>
	<table width='100%' border='0' cellspacing='0' cellpadding='5'>
		<tr>
			<td align="center" colspan="4"><jsp:include
					page="/admin/Top.jsp"></jsp:include></td>
		</tr>
		<tr>
			<td align="center" colspan="4"><jsp:include
					page="/admin/navibar1.jsp"></jsp:include></td>
		</tr>
		<tr align='center'>
			<c:forEach var="photo" items="${selAllList}" varStatus="status">
				<c:choose>
					<c:when test="${status.count % 4 == 0}">
						<li>
							<div class="img_block">
								<img src="uploadimg/${photo.path}" />
								<a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
								<a href="#" class="ilike">YYM</a>
							</div>
							<h3>TITLE</h3>
							<div class="iNum"><span>1</span><a href="#">4</a></div>
							<p>简介文字</p>
						</li>


<%--						<td width='25%'>--%>
<%--							<table border=1 align=center cellpadding=3 cellspacing=1--%>
<%--								bordercolor="#666666" bgcolor='#ffffff' class='bk1'>--%>
<%--								<tr>--%>
<%--									<td align="center"><a--%>
<%--										href="PhotoManager?action=selOne&id=${photo.id}&str=client"--%>
<%--										target='_blank'> <img src="uploadimg/${photo.path}"--%>
<%--											alt="${photo.shuoming }" width=150 height=113 border='0'--%>
<%--											align="middle" class='bk1'> </a></td>--%>
<%--								</tr>--%>
<%--							</table> <br> <a--%>
<%--							href="PhotoManager?action=selOne&id=${photo.id}&str=client">${photo.name}</a>&nbsp;&nbsp;|&nbsp;&nbsp;点击：${photo.dianji}--%>
<%--						</td>--%>
						<c:out value="</tr>" escapeXml="false" />
						<c:out value="<tr align='center'>" escapeXml="false" />
					</c:when>
					<c:otherwise>
<%--						<td width='25%'>--%>
<%--							<table border=1 align=center cellpadding=3 cellspacing=1--%>
<%--								bordercolor="#666666" bgcolor='#ffffff' class='bk1'>--%>
<%--								<tr>--%>
<%--									<td align="center"><a--%>
<%--										href="PhotoManager?action=selOne&id=${photo.id}&str=client"--%>
<%--										target='_blank'> <img src="uploadimg/${photo.path}"--%>
<%--											alt="${photo.shuoming }" width=150 height=113 border='0'--%>
<%--											align="middle"> </a></td>--%>
<%--								</tr>--%>
<%--							</table> <br> <a--%>
<%--							href="PhotoManager?action=selOne&id=${photo.id}&str=client">${photo.name}</a>&nbsp;&nbsp;|&nbsp;&nbsp;点击：${photo.dianji}--%>
<%--						</td>--%>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</tr>
	</table>
</body>
</html>
