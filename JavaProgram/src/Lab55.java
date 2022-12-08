import java.util.*;

public class Lab55 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		String studentId = scan.nextLine();
		System.out.print("Enter Subject Id: ");
		String studentId = scan.nextLine();
		for(int i=0;i<studentId.length();i++) {
			if(studentId.length()<10) {
				System.out.print("Enter Student Id: ");
			}
		}
	}

}
