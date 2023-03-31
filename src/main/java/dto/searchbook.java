package dto;

public class searchbook{
	public searchbook(String book_name, String returnbook, String lending, String lending_returnbook) {
		super();
		this.book_name = book_name;
		this.returnbook = returnbook;
		this.lending = lending;
		this.lending_returnbook = lending_returnbook;
	}

	private String book_name;
	private String returnbook;

	private String lending;

	private String lending_returnbook;

	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getReturnbook() {
		return returnbook;
	}
	public void setReturnbook(String returnbook) {
		this.returnbook = returnbook;
	}

	public String getLending() {
		return lending;
	}
	public void setLending(String lending) {
		this.lending = lending;
	}
	public String getLending_returnbook() {
		return lending_returnbook;
	}
	public void setLending_returnbook(String lending_returnbook) {
		this.lending_returnbook = lending_returnbook;
	}
}



