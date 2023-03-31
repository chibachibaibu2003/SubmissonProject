package dto;

public class searchbook_name {
	public searchbook_name(String book_name, String returnbook, String lending) {
		super();
		this.book_name = book_name;
		this.returnbook = returnbook;
		this.lending = lending;
	}
	private String book_name;
	private String returnbook;
	private String lending;
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
}
