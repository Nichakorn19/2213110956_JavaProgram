import javax.swing.*;
import java.util.*;
public class Lab605 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int number[] = new int[5];
		for(int i=0;i<number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" :"));
		}
		showEven(number);
		showOdd(number);
	}
	public static void showEven(int[] nums) {
		String evenNum ="";
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				evenNum+=nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+evenNum);
	}
	public static void showOdd(int[] nums) {
		String oddNum ="";
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				oddNum+=nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number:\n"+oddNum);
	}
	
}
