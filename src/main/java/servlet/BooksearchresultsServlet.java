package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.searchbookDAO;
import dto.lendbook;
import dto.book;
import dto.searchbook_name;
import dto.searchbook_id;

/**
 * Servlet implementation class BooksearchresultsServlet
 */
@WebServlet("/BooksearchresultsServlet")
public class BooksearchresultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BooksearchresultsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String searchkeyword = request.getParameter("searchkeyword");
		String book_name = request.getParameter("book_name");
		int book_id = Integer.parseInt("book_id");
		String lending = request.getParameter("lending");
		lending = lending.equals("0") ? "貸出なし" : "貸出あり";
		String returnbook = request.getParameter("returnbook");
		returnbook = returnbook.equals("0") ? "延滞なし" : "延滞あり";
		String lending_returnbook = request.getParameter("lending_returnbook");
		
		//キーワードが図書IDか図書名の判断
		if(searchkeyword == book_name) {
			searchbook_name searchbook_name = new searchbook_name(book_name, lending, returnbook);//図書名 貸出なし
			
			if(lending_returnbook == null) {
				
			//貸出の有無
				if(lending=="0") {//貸出判断 貸出があれば延滞判断へ
					returnbook="0";
					searchbook_name searchbook = new searchbook_name(book_name, lending, returnbook); //図書名 貸出あり 延滞なし
				}else {//延滞判断
					searchbook_name searchbook = new searchbook_name(book_name, lending, returnbook);//図書名 貸出あり 延滞あり
				}
			}else {
				lending="1";
				returnbook="1";
				searchbook_name searchbook = new searchbook_name(book_name, lending, returnbook);//図書名 貸出あり 延滞あり
			}
		
		} else {
			int searchkeywor = Integer.parseInt(searchkeyword);
			if(searchkeywor == book_id) {
				searchbook_id searchbook_id = new searchbook_id(book_id, lending, returnbook);//図書ID 貸出なし
				if(lending_returnbook == null) {
					//貸出の有無
					if(lending=="0") {//貸出判断 貸出があれば延滞判断へ
						returnbook="0";
						searchbook_id searchbookid = new searchbook_id(book_id, lending, returnbook);//図書ID 貸出あり 延滞なし
					}else {//延滞判断
						searchbook_id searchbookid = new searchbook_id(book_id, lending, returnbook); //図書ID 貸出あり 延滞あり
					}
				}else {
					lending="1";
					returnbook="1";
					searchbook_id searchbook = new searchbook_id(book_id, lending, returnbook);//図書ID 貸出あり 延滞あり
				}
		}
		}
		String view = "WEB-INF/view/bookseaechresult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
