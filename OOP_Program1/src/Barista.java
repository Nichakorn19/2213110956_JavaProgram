
public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name,char gender) {
		this.name = name;
		this.gender = gender;	
	}
	public Barista() {
		
	}
	public String getName() {
		return name;
	}
	public String getGenderName() {
		if(gender=='M')
			return "Male";
		else if(gender=='F')
			return "Female";
		else
			return " ";
	}
}
