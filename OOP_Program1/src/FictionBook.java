
public class FictionBook {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		if(this.author_name.trim().contains(" ")) 
			return true;
		else 
			return false;
	}
	
	public String toString() {
		return "";
	}
	
}
