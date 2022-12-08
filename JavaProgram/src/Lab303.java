import javax.swing.*;
import java.text.*;

public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		final int  withdraw= Integer.parseInt(
				JOptionPane.showInputDialog("You balance : 800,000"+
		"\nInput money to withdraw:"));
		int b1000=0;
		int b500=0;
		int b100=0;
		int total=withdraw;
		if(withdraw>800000) {
			JOptionPane.showMessageDialog(null, 
					"Error: Cannot withdraw more than balance","ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}else if(withdraw>20000)
		{
			JOptionPane.showMessageDialog(null, 
					"Error: Cannot withdraw more than 20,000 baht.","ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}else if(withdraw%100!=0)
		{
			b1000 = total/1000; 
			total = total - (b1000*1000);
			b500 = total/500;
			total = total - (b500*500);
			b100 = total/100;
			total = total - (b100*100);
			JOptionPane.showMessageDialog(null, 
					"Error: Cannot withdraw more than "+total +" baht.","ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}else {
			b1000 = total/1000; //17
			total = total - (b1000*1000);
			b500 = total/500;
			total = total- (b500*500);
			b100 = total/100;
			total = total - (b100*100);
			JOptionPane.showMessageDialog(null, "You withdraw "
			+frm.format(withdraw)+
					" baht."
					+"\n1000 = "+b1000+
					"\n500 = "+b500+
					"\n100 = "+b100);
			
		}
		
			
		
		
		
		
		
		

			
			
			
			 
		

	}

}
