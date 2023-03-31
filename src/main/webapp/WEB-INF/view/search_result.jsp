<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dto.book" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Laboratory</title>
 <link rel="stylesheet" href="css/search_result.css">
</head>
<body bgcolor="#F2FDFF">
  <header>
    <div class="header">
    <div class="left"><h1 class="title"><img src="img/aikon.png"alt="" width="70" height="70">Book Laboratory</h1>
    </div>
      </div>
    <nav class="nav">
      <ul class="menu-group">
      </ul>
    </nav>
  </header>
<div class="box1">
  <img src="img/aikon.png"alt="" width="70" height="70">
  	<font size="6">
  		<a>ホーム</a>
  		<a>検索</a>
  		<a>マイページ</a>
  	</font>
	<div class="logout">
		<a href="./LogoutServlet"><button class="logout" style="font-size: 25px;">ログアウト</button></a>
	</div>
</div>
<div class="box2">
	<p class="search_Word" style="font-size: 1.2rem;">検索ワード</p>
<% String keyword=(String)request.getAttribute("keyword");%>
	<p class="search_text" style="font-size: 1.2rem;"><%=keyword %></p>
</div>
<%
	List<book> list=(List<book>)session.getAttribute("SearchBook");
	for(book bo : list){
%>
 <div class="yoko_narabi">
	<div class="book_cover">  
		<img src="data:image/png;base64,<%=bo.getURL()%>"width="180"height="245">  
 	</div>
 	<div class="tate_narabi">
 		<p class="book_title" style="font-size:1.6rem;"><%=bo.getBook_name() %></p>
 		<div class="author">
 			<p style="font-size:1.5rem;">作者:<%=bo.getAuthor_name() %></p>
  		</div>
  		<div class="publication">
			<p style="font-size:1.5rem;">出版日:<%=bo.getPub_date() %></p>
   		</div>
 	</div>
    <a href="./BookinfoServlet?isbn=<%=bo.getIsbn()%>" class="btn btn--orange" >本の詳細へ</a> 
</div>
 <%} %>        
</body>
</html>