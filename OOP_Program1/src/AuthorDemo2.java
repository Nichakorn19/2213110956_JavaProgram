import java.util.*;
public class AuthorDemo2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Author author = new Author();
		for(int i=1;i<=4;i++) {
			line();
			System.out.print("Input author name   : ");
		
			System.out.print("Input author e-mail : ");
		
			line();
		}
	}
	public static void line() {
		for(int i=1;i<50;i++)
			System.out.print("-");
			System.out.println();
	}
}
