<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Laboratory</title>
<link rel ="stylesheet"href="css/deletebook.css">
</head>
<body bgcolor="#F2FDFF">
	<h1  style="font-size:3rem;">削除する本のIDを入力してください</h1>
	<form action="DeleteBook2Servlet" method="post">
		<div class="center2">
		<input type="text" name="id" class="box1" placeholder="ID" style="font-size:2.4rem;" ><br>
		</div>
			<div class="yoko_narabi">
		<input type="submit" value="削除" class="button_s">
		<a href="AdminHomeServlet" class="button_a">戻る</a>
		</div>
	</form>
</body>
</html>