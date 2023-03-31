<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="dto.searchbook_name" %>
<%@ page import ="dto.searchbook_id" %>
<%@ page import ="dto.book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書検索</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String errorCode = request.getParameter("error");
		searchbook_name sbook_name = (searchbook_name)session.getAttribute("input_data");
		searchbook_id sbook_id = (searchbook_id)session.getAttribute("input_data");
		book bo = (book)session.getAttribute("input_data");
	%>
	<form action="BooksearchresultsServlet" method="post">
	<div>
	<label for="searchkeyword">図書名 もしくは 図書ID</label>
	<input type="text" name="searchkeyword" >
	</div>
	
	<div>
	<label for="lending_returnbook">貸出延滞あり</label>
	<input type="radio" name="lending_returnbook" value="0" id="lending_returnbook">
	</div>
	
	<div>
	<label for="lendid">貸し出しの有無</label>
	<input type="radio" name="lending" value="0" id="lending" checked>
	<label for="lending">貸出なし</label>
	<input type="radio" name="lending" value="1" id="lending">
	<label for="lending">貸出あり</label>
	</div>
	
	<div>
	<label for="returnbook">延滞の有無</label>
	<input type="radio" name="returnbook" value="0" id="returnbook" checked>
	<label for="returnbook">延滞なし</label>
	<input type="radio" name="returnbook" value="1" id="returnbook">
	<label for="returnbook">延滞あり</label>
	</div>
	
	
	<input type="submit" value="検索">
	</form>
	
	
</body>
</html>