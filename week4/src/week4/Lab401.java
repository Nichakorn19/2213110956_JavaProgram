package week4;
import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		String firstName,lastName;
		
		int spaceofWord = fullName.indexOf(' ');
		if(spaceofWord==-1){
			System.out.println("Incorrect Name");
		}
		else { 
			firstName = (fullName.substring(0,fullName.indexOf(" ")));
			lastName = (fullName.substring(fullName.indexOf(" ")));
			System.out.println("First name: "+firstName.toUpperCase()+"\nLast name: "+lastName.toLowerCase());
		}
	}

}
