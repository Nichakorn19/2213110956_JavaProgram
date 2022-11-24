import javax.swing.*;
import java.text.*;
import java.util.Scanner;

public class PensionContributionCalculator {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		// Declare constants
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		int salary, age;
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		
		System.out.print("Enter the monthly salaly: $");
		Scanner scan = new Scanner(System.in);
		salary = scan.nextInt();
		System.out.print("Enter the age : ");
		age = scan.nextInt();
		
		if(age <= 55) {
			employeeContribution = salary*EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = salary*EMPLOYER_RATE_55_AND_BELOW;		
		}else if(age <= 60)
				{
			employeeContribution = salary*EMPLOYEE_RATE_55_TO_60;
			employerContribution = salary*EMPLOYER_RATE_55_TO_60;
				}else if(age <= 65) {
					employeeContribution = salary*EMPLOYEE_RATE_60_TO_65;
					employerContribution = salary*EMPLOYER_RATE_60_TO_65;
				}else {
					employeeContribution = salary*EMPLOYEE_RATE_65_ABOVE;
					employerContribution = salary*EMPLOYER_RATE_65_ABOVE;
				}
		System.out.println("The employee's contribution is : $"+frm.format(employeeContribution));
		System.out.println("The employer's contribution is : $"+frm.format(employerContribution));
		contributableSalary = (int)employeeContribution+(int)employerContribution;
		System.out.println("The total contribution is : $"+frm.format(contributableSalary));
		
		
		
	}

}
