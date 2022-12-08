import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space."+"\n:");
		String fullname = scan.nextLine();
		String firstName = fullname.substring(0,fullname.indexOf(' '));
		System.out.print(abbreviatName(fullname.toUpperCase())+firstName);

	}
	public static String abbreviatName(String fullname) {
		String midName = "";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				midName = midName+fullname.charAt(i+1);
				midName = midName+".";
			}
		}
		return midName;
	}

}
