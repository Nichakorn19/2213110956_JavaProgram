import java.text.*;
import javax.swing.*;

public class MusicWorldApp {

	public static void main(String[] args) {
		String cdId;
		cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order\nPlease enter the ID of the CD");
		String cdTitle;
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		double cdSubtotal = cdPrice * cdQuantity;
		final double TAX_RATE = .0625;
		double cdTotal =cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null,"Summary of the transaction"+
		"\n\nCD ID:"+cdId+"\nCD Title:"+cdTitle+"\nCD Unit Price:$"+cdPrice+"\nCD Quantity:"+cdQuantity+
		"\n\nSubtotal:$"+cdSubtotal+"\nTax rate:"+TAX_RATE*100+"%"+"\nTotal:$"+cdTotal+"\n\nEnd of Program");
		

	}

}
