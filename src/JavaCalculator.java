import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.SystemColor;

public class JavaCalculator {
//visit http://www.adsingh.net
	private JFrame frmScientificCalculator;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.

	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCalculator window = new JavaCalculator();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaCalculator() {
		initialize();
	}//visit http://www.adsingh.net

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.setTitle("Scientific Calculator");
		frmScientificCalculator.getContentPane().setBackground(Color.WHITE);
		frmScientificCalculator.setResizable(false);
		frmScientificCalculator.setBounds(100, 100, 446, 839);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificCalculator.getContentPane().setLayout(null);
		
		JLabel lblScientificCalculator = new JLabel("Scientific Calculator");
		lblScientificCalculator.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblScientificCalculator.setBounds(12, 13, 404, 29);
		frmScientificCalculator.getContentPane().add(lblScientificCalculator);
		//visit http://www.adsingh.net
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBackground(SystemColor.menu);
		textField.setFont(new Font("DialogInput", Font.PLAIN, 48));
		textField.setBounds(12, 55, 404, 89);
		frmScientificCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnR.setBounds(12, 192, 71, 72);
		frmScientificCalculator.getContentPane().add(btnR);
		
		JButton btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});//visit http://www.adsingh.net
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnx.setBounds(12, 277, 71, 72);
		frmScientificCalculator.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnXy.setBounds(12, 362, 71, 72);
		frmScientificCalculator.getContentPane().add(btnXy);
		
		JButton btnX_1 = new JButton("X^3");
		btnX_1.setEnabled(false);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}//visit http://www.adsingh.net
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX_1.setBounds(12, 447, 71, 72);
		frmScientificCalculator.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("X^2");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});//visit http://www.adsingh.net
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX.setBounds(12, 532, 71, 72);
		frmScientificCalculator.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				double fact=1;
				while(a!=0 && a<999999999 && a>-999999999)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnN.setBounds(12, 617, 71, 72);
		frmScientificCalculator.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPlusMinus.setBounds(12, 702, 71, 72);
		frmScientificCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEx.setBounds(95, 192, 71, 72);
		frmScientificCalculator.getContentPane().add(btnEx);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);//visit http://www.adsingh.net
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLog.setBounds(95, 277, 71, 72);
		frmScientificCalculator.getContentPane().add(btnLog);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}//visit http://www.adsingh.net
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPercent.setBounds(95, 362, 71, 72);
		frmScientificCalculator.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(95, 447, 71, 72);
		frmScientificCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(95, 532, 71, 72);
		frmScientificCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(95, 617, 71, 72);
		frmScientificCalculator.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSin.setBounds(178, 192, 71, 72);
		frmScientificCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSinh.setBounds(178, 277, 71, 72);
		frmScientificCalculator.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClear.setBounds(178, 362, 71, 72);
		frmScientificCalculator.getContentPane().add(btnClear);
		//visit http://www.adsingh.net
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(178, 447, 71, 72);
		frmScientificCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(178, 532, 71, 72);
		frmScientificCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}//visit http://www.adsingh.net
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(178, 617, 71, 72);
		frmScientificCalculator.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(95, 702, 154, 72);
		frmScientificCalculator.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}//visit http://www.adsingh.net
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCos.setBounds(261, 192, 71, 72);
		frmScientificCalculator.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCosh.setBounds(261, 277, 71, 72);
		frmScientificCalculator.getContentPane().add(btnCosh);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
					
				}//visit http://www.adsingh.net
			}
		});
		btnBackSpace.setFont(new Font("wingdings", Font.PLAIN, 17));
		btnBackSpace.setBounds(261, 362, 71, 72);
		frmScientificCalculator.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(261, 447, 71, 72);
		frmScientificCalculator.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(261, 532, 71, 72);
		frmScientificCalculator.getContentPane().add(btn6);
		//visit http://www.adsingh.net
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(261, 617, 71, 72);
		frmScientificCalculator.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDot.setBounds(261, 702, 71, 72);
		frmScientificCalculator.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});//visit http://www.adsingh.net
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTan.setBounds(344, 192, 71, 72);
		frmScientificCalculator.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTanh.setBounds(344, 277, 71, 72);
		frmScientificCalculator.getContentPane().add(btnTanh);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdd.setBounds(344, 362, 71, 72);
		frmScientificCalculator.getContentPane().add(btnAdd);
		//visit http://www.adsingh.net
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSub.setBounds(344, 447, 71, 72);
		frmScientificCalculator.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMul.setBounds(344, 532, 71, 72);
		frmScientificCalculator.getContentPane().add(btnMul);
		//visit http://www.adsingh.net
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDivide.setBounds(344, 617, 71, 72);
		frmScientificCalculator.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second= Double.parseDouble(textField.getText());
				if (operation=="+"){
					result = first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}//visit http://www.adsingh.net
				else if (operation=="-"){
					result = first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="*"){
					result = first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="/"){
					result = first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="%"){
					result = first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation=="X^Y")
				{
					double resultt=1;
					for (int i=0;i<second;i++)
					{
						resultt = first*resultt;
					}
					
					
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}//visit http://www.adsingh.net
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEqual.setBounds(344, 702, 71, 72);
		frmScientificCalculator.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnOn = new JRadioButton("ON");
		rdbtnOn.setBackground(Color.WHITE);
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMul.setEnabled(true);
				btnEqual.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnN.setEnabled(true);
				btnX.setEnabled(true);
				btnX_1.setEnabled(true);
				btnXy.setEnabled(true);
				btnPercent.setEnabled(true);
				btnClear.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnR.setEnabled(true);
				btnEx.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnx.setEnabled(true);
				btnLog.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				textField.setEnabled(true);
			}//visit http://www.adsingh.net
		});
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setBounds(12, 153, 71, 25);
		frmScientificCalculator.getContentPane().add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setBackground(Color.WHITE);
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnDivide.setEnabled(false);
				btnMul.setEnabled(false);
				btnEqual.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnN.setEnabled(false);
				btnX.setEnabled(false);
				btnX_1.setEnabled(false);
				btnXy.setEnabled(false);
				btnPercent.setEnabled(false);
				btnClear.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnR.setEnabled(false);
				btnEx.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnx.setEnabled(false);
				btnLog.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				textField.setEnabled(false);
				//visit http://www.adsingh.net
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(95, 153, 71, 25);
		frmScientificCalculator.getContentPane().add(rdbtnOff);
		
		JButton btnNewButton = new JButton("ABOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String aboutText=
        				"<html><big>Scientific Calculator</big><hr>"
        				+"<p align=right>Created and Designed by AD Singh"
        				+"<hr><p align=left>I Used jdk1.8 to compile the source code.<br><br>"
        				+"<strong>Thanx for using <u>Scientific Calculator</u></strong><br>"
        				+"<strong>For more visit: <u>http://www.adsingh.net/projects</u></strong><br>"
        				+"Your Comments as well as bug reports are very welcome at<p align=center>"
        				+"<hr><em><big>contactus@adsingh.net</big></em><hr><html>";
				JOptionPane.showMessageDialog(JavaCalculator.this.frmScientificCalculator,aboutText,"Dedicated To You!",JOptionPane.INFORMATION_MESSAGE);
			}//visit http://www.adsingh.net
		});
		btnNewButton.setBounds(261, 157, 155, 25);
		frmScientificCalculator.getContentPane().add(btnNewButton);
	}
}
