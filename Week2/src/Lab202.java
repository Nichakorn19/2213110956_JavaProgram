import java.text.*;
import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes : ");
		int minute = scan.nextInt();
		int year = minute/60/24/356;
		int day = (minute/60/24)-(year*365);
		System.out.println(minute+" minutes is approximately "+year+" years "+day+" days");
	}

}
