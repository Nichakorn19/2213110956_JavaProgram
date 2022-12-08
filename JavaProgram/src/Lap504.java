import java.util.*;
import javax.swing.*;

public class Lap504 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullName = sc.nextLine();
		
		int result = fullName.indexOf(' ');
		String firstname = fullName.substring(0,result);
		
		String printname = firstname.toLowerCase();
		System.out.print(abbreviatName(fullName)+firstname.substring(0,1).toUpperCase()
				+printname.substring(1));

	}
	public static String abbreviatName(String Fname)
	{
		String initialLetter="";
		
		
		/*char secondname = Fname.charAt(result+1);
		int result2 =  Fname.lastIndexOf(' ');
		char threename = Fname.charAt(result2+1);*/
		
		for(int i=0;i < Fname.length() ; i++) 
		{
			if (Fname.charAt(i)==' ')
			{
				initialLetter = (initialLetter+Fname.charAt(i+1)).toUpperCase();
				initialLetter =initialLetter+".";
			}
		}					
		return initialLetter;
	}

}
