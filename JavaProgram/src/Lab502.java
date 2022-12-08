import javax.swing.*;

public class Lab502 {
	static String email;
	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail() {
		String answer = "";
		do {
		email = JOptionPane.showInputDialog("Input your e-mail:");
		checkEmailError(email);
		answer = JOptionPane.showInputDialog("Continue[y||Y to continue]");
		}while(answer.equalsIgnoreCase("y"));
	}
	public static void  checkEmailError(String checkMail) {
		while(checkMail.startsWith("@")||checkMail.contains(" ")) {
			checkMail = JOptionPane.showInputDialog("Input your E-mail, again:");
		}
		checkMail = checkMail.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(checkMail)
				?"Your E-mail is "+checkMail 
				:"Your E-mail is not hotmail or gmail dot com");
	}
	public static boolean checkEmail(String checkMail) {
		if(checkMail.endsWith("@gmail.com")||checkMail.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}
	}

}
