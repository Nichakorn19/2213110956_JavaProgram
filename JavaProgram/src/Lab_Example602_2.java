import javax.swing.*;
public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptWasFound = false;
	public static void main(String[] args) {
		String dName = JOptionPane.showInputDialog("Enter a department name");
		for(int i=0;i<deptName.length;i++) {
			if(dName.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}
		if(deptWasFound) {
			JOptionPane.showMessageDialog(null, dName+" was found in the list.");
		}else {
			JOptionPane.showMessageDialog(null, dName+" was not found in the list.");
		}
	
	}
}
