import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		double h = height/100;
		double bmi = weight/(Math.pow(h, 2));
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're "+(bmi<=18.5?"Underweight":bmi<=24.9 ?"Normal-weight":
			bmi<=29.9 ?"Overweight":"Obesity"),"BMI",JOptionPane.WARNING_MESSAGE);

	}

}
