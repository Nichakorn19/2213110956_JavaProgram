import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] num = {25, 78, 41, 22, 36, 85, 37};
		int indexArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(checkIndex(num,indexArray)) {
			indexArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
		}
		currentData(num,indexArray);
		String prevData=(prevData(num,indexArray)!=-1)?"Previous data, nums["+(indexArray-1)+"] is "+prevData(num,indexArray):"NO previous data";
		String nextData=(nextData(num,indexArray)!=-1)?"Next data, nums["+(indexArray+1)+"] is "+nextData(num,indexArray):"No next data";
		JOptionPane.showMessageDialog(null, "Current data, nums["+indexArray+"] is "+currentData(num,indexArray)+"\n"+prevData+"\n"+nextData);
	}
	public static boolean checkIndex(int[] nums,int index) {
		return index < 0||index>nums.length-1;
	}
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		return index==0?-1:nums[index-1];
	}
	public static int nextData(int[] nums,int index) {
		return index == nums.length-1?-1:nums[index+1];
	}
}
