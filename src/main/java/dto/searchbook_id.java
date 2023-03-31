package dto;

public class searchbook_id {
	public searchbook_id(int book_id, String lending, String returnbook) {
		super();
		this.book_id = book_id;
		this.lending = lending;
		this.returnbook = returnbook;
	}
	private int book_id;
	private String lending;
	private String returnbook;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getLending() {
		return lending;
	}
	public void setLending(String lending) {
		this.lending = lending;
	}
	public String getReturnbook() {
		return returnbook;
	}
	public void setReturnbook(String returnbook) {
		this.returnbook = returnbook;
	}

}
