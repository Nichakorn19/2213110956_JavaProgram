import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accNum,String pass,int money) {
		super(accNum,pass);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException {
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		while(read.hasNext()) {
			String accNum = read.next();
			String pass = read.next();
			money = read.nextInt();
		}
		return false;
	}
	
	public void show() {
		
	}
}
