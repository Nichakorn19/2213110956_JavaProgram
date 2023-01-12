import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber1 frame = new CalculateTwoNumber1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber1() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(43, 28, 89, 19);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(142, 27, 130, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setBounds(43, 58, 92, 14);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(142, 55, 130, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResult.setBounds(325, 173, 99, 19);
		contentPane.add(lblResult);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(43, 88, 70, 14);
		contentPane.add(lblOperator);

		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(142, 86, 55, 19);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel lblDigit = new JLabel("How to show Digit");
		lblDigit.setBounds(43, 122, 99, 14);
		contentPane.add(lblDigit);
		
		final JRadioButton rdbtnDigit1 = new JRadioButton("1 Digit");
		rdbtnDigit1.setBounds(163, 118, 109, 23);
		contentPane.add(rdbtnDigit1);
		
		final JRadioButton rdbtnDigit2 = new JRadioButton("2 Digit");
		rdbtnDigit2.setBounds(163, 147, 109, 23);
		contentPane.add(rdbtnDigit2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnDigit1);
		group.add(rdbtnDigit2);
		JLabel lblshow = new JLabel("Option to show ");
		lblshow.setBounds(43, 177, 89, 14);
		contentPane.add(lblshow);
		
		final JCheckBox chckbxShowRe = new JCheckBox("Show Result at Dialog box");
		chckbxShowRe.setBounds(142, 173, 177, 23);
		contentPane.add(chckbxShowRe);
		
		

		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//JComboBox
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;

					//JRadioButton
					DecimalFormat frmNumber = null;
					if(rdbtnDigit1.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(rdbtnDigit2.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}

					lblResult.setText(frmNumber.format(sum));
					
					if(chckbxShowRe.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
				}
			}
		});
		btnOK.setBounds(124, 229, 89, 23);
		contentPane.add(btnOK);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(223, 229, 89, 23);
		contentPane.add(btnExit);
		
	
		


	}
}