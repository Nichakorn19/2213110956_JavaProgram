import java.io.*;
import java.util.*;
import java.text.*;

public class ATMBanking {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("0-000-000-00-0");
		System.out.print("Enter account number  : ");
		String accNum = console.nextLine();
		while (accNum != fm.format(accNum)) {
			System.out.print("Input wrong type, Enter account number  : ");
			accNum = console.nextLine();
		}
	}

}
