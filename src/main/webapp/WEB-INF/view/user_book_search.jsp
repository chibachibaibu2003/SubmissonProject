<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/user_book_search.css">
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
		<a href="./LogoutServlet">
			<button class="logout" style="font-size: 25px;">ログアウト</button>
		</a>
	</div>
	</div>
	<div class="text_top">
		<h1>検索したいキーワードを入力して下さい！</h1>
	</div>	
	<div class="yoko_narabi">
	<form action="SearchResultServlet"method="get">
		<div class="right">
			<input class="search" type="search" name="word" placeholder="キーワードを入力してください">
			<button class="search_button" href=""><img src="img/2.png" alt="" width="45" height="45"></button>
 		</div>
  	</form>
  </div>
  <div class="text_under">
	<h2 >入力したキーワードを図書名、著者名、</h2><br>
	<h2 >ISBN、出版社のそれぞれから検索をかけて</h2><br>
	<h2 >検索結果を表示します！</h2>
  </div>

</body>
</html>