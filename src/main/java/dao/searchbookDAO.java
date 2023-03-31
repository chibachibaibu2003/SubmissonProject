package dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.book;
import dto.lendbook;
import dto.searchbook;
import dto.searchbook_id;
import dto.searchbook_name;

public class searchbookDAO {
	private static Connection getConnection() throws URISyntaxException, SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    URI dbUri = new URI(System.getenv("DATABASE_URL"));

	    String username = dbUri.getUserInfo().split(":")[0];
	    String password = dbUri.getUserInfo().split(":")[1];
	    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

	    return DriverManager.getConnection(dbUrl, username, password);
	}

	public static int registerbook(searchbook_name sbook_name) {
		String sql = "INSERT INTO book VALUES(?, ?, ?)";
		int result = 0;
		
	try (
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		){
		pstmt.setString(1, sbook_name.getBook_name());
		pstmt.setString(2, sbook_name.getLending());
		pstmt.setString(3, sbook_name.getReturnbook());
		
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} finally {
			System.out.println(result + "件一致しました。");
		}
		return result;
	}
	public static int registerbook(searchbook_id sbook_id) {
		String sql = "INSERT INTO book VALUES(?, ?, ?)";
		int result = 0;
		
	try (
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		){
		pstmt.setInt(1, sbook_id.getBook_id());
		pstmt.setString(2, sbook_id.getLending());
		pstmt.setString(3, sbook_id.getReturnbook());
		
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} finally {
			System.out.println(result + "件一致しました。");
		}
		return result;
	}

//Connection con = getConnection();でエラーが出るのでコメントにしてます
	
//	public static List<searchbook> searchBooks(String keyword) {
//		String sql = "SELECT * FROM book WHERE book_name LIKE ?";
//		List<searchbook> searchbookList = new ArrayList<>();
//		try (
//				Connection con = getConnection();
//				PreparedStatement pstmt = con.prepareStatement(sql);
//			){
//
//			
//			try (ResultSet rs = pstmt.executeQuery()){
//			
//				while(rs.next()) {
//					
//					String book_name = rs.getString("book_name");
//					String returnbook = rs.getString("returnbook");
//					String lending = rs.getString("lending");
//					String lending_returnbook = rs.getString("lending_returnbook");
//					searchbook searchbooks = new searchbook(book_name, returnbook, lending, lending_returnbook);
//					searchbookList.add(searchbooks);
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		 return searchbookList;
//	}
}

