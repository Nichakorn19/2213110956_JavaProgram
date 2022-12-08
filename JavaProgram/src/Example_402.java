import javax.swing.*;
public class Example_402 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your E-mail:");
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your E-mail, again:");
		}
		inputEmail = inputEmail.toLowerCase();
		/*if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your E-mail is "+inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your E-mail is not hotmail or gmail dot com");
		}*/
		boolean checkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (checkEmail)
				?"Your E-mail is "+inputEmail 
				:"Your E-mail is not hotmail or gmail dot com");
	}

}
