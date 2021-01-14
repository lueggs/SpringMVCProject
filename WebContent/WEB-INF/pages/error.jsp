<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>追風者｜錯誤頁</title>
<%@ include file="/WEB-INF/pages/global/frontEnd_header.jsp"%>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<style>
body {
	background-color: #f5f5f5;
	font-family: "メイリオ", Meiryo, "ヒラギノ角ゴ Pro W3", "Hiragino Kaku Gothic Pro",
		"ＭＳ Ｐゴシック", "MS PGothic", Arial, Helvetica, sans-serif;
	color: #333333;
}
</style>

</head>
<body>
	<%@ include file="/WEB-INF/pages/global/frontEnd_top.jsp"%>
	<div class="mt-5 text-center">
		<h1 class="text-danger">發生了一點兒錯誤！</h1>
		<h5 class="text-secondary mt-2">請重新回到首頁再操作一次</h5>
		<p class="text-secondary">${errorcode}</p>
		<div style="width:1500px;height:800;background-image: url('img/error.png');background-size:cover;background-repeat:no-repeat"></div>
		
	</div>
	<%@ include file="/WEB-INF/pages/global/frontEnd_footer.jsp"%>
</body>
</html>