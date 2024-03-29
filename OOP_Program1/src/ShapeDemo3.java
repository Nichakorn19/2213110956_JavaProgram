import java.util.Scanner;

import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		double[] radius = new double[5];
		double[] height = new double[5];
		String[] input = new String[5];
		for (int i = 0; i < 5; i++) {
			input[i] = JOptionPane.showInputDialog(null,"Input radius, height");
			String[] split = input[i].split(" "); 
			radius[i] = Double.parseDouble(split[0]);
			height[i] = Double.parseDouble(split[1]);
			cylinder[i] = new Cylinder(radius[i], height[i]);
		}
		int i =1;
		String output = "";
		for(Cylinder _cy : cylinder) {
			output += "Cylinder " + i + ", volume=" + _cy.getVolume()+"\n";
			i++;
		}
		JOptionPane.showMessageDialog(null, output);
	}

}
