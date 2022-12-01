package week4;
import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message: ");
		String message = scan.nextLine();
		int index = 0;
		if(message.toLowerCase().indexOf("nichi")>=0) {
				index++;
			}
		if(index==1) {
			System.out.println("Nichi is sentence.");
		}
		else {
			System.out.println(message);
		}
		
	}

}
