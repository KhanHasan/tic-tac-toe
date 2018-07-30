
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TTT {
	public static boolean bt1 = false;
	public static boolean bt2 = false;
	public static boolean bt3 = false;
	public static boolean bt4 = false;
	public static boolean bt5 = false;
	public static boolean bt6 = false;
	public static boolean bt7 = false;
	public static boolean bt8 = false;
	public static boolean bt9 = false;
	public static int i = 0;
	
	public static String [][]a= {
			{"","",""},
			{"","",""},
			{"","",""}};
	
	public static JButton btn1 = new JButton(a[0][0]);
	public static JButton btn2 = new JButton(a[0][1]);
	public static JButton btn3 = new JButton(a[0][2]);
	public static JButton btn4 = new JButton(a[1][0]);
	public static JButton btn5 = new JButton(a[1][1]);
	public static JButton btn6 = new JButton(a[1][2]);
	public static JButton btn7 = new JButton(a[2][0]);
	public static JButton btn8 = new JButton(a[2][1]);
	public static JButton btn9 = new JButton(a[2][2]);
	
	
	public static void make() {
		JFrame frame = new JFrame("Tic Tac Toe");
		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		btn1.setBackground(Color.black);
		btn2.setBackground(Color.black);
		btn3.setBackground(Color.black);
		btn4.setBackground(Color.black);
		btn5.setBackground(Color.black);
		btn6.setBackground(Color.black);
		btn7.setBackground(Color.black);
		btn8.setBackground(Color.black);
		btn9.setBackground(Color.black);

		panel.setLayout(new GridLayout(3,3,3,3));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		btn1.setPreferredSize(new Dimension(200,200));
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
	
	
	public static void main(String[] args) {
		
		make();
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(bt1==false &&  i%2==1) {
				a[0][0]="X";
				btn1.setFont(new Font("Arial", Font.BOLD, 100));
				btn1.setForeground(Color.white);
				btn1.setText(a[0][0]);
				bt1=true;
				i++;
			}
			else if(bt1==false && i%2==0){
				a[0][0]="O";
				btn1.setFont(new Font("Arial", Font.BOLD, 100));
				btn1.setForeground(Color.white);
				btn1.setText(a[0][0]);
				bt1=true;
				i++;
			}
			checkgm();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt2==false && i%2==1) {
					a[0][1] = "X";
					btn2.setFont(new Font("Arial", Font.BOLD, 100));
					btn2.setForeground(Color.white);
					btn2.setText(a[0][1]);
					bt2=true;
					i++;
				}
				else if(bt2==false && i%2==0){
					a[0][1]="O";
					btn2.setFont(new Font("Arial", Font.BOLD, 100));
					btn2.setForeground(Color.white);
					btn2.setText(a[0][1]);
					bt2=true;
					i++;
				}	
				checkgm();
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt3==false && i%2==1) {
					a[0][2] = "X";
					btn3.setFont(new Font("Arial", Font.BOLD, 100));
					btn3.setForeground(Color.white);
					btn3.setText(a[0][2]);
					bt3=true;
					i++;
				}
				else if(bt3==false && i%2==0) {
					a[0][2]="O";
					btn3.setFont(new Font("Arial", Font.BOLD, 100));
					btn3.setForeground(Color.white);
					btn3.setText(a[0][2]);
					bt3=true;
					i++;
				}			
				checkgm();
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt4==false && i%2==1) {
					a[1][0] = "X";
					btn4.setFont(new Font("Arial", Font.BOLD, 100));
					btn4.setForeground(Color.white);
					btn4.setText(a[1][0]);
					bt4=true;
					i++;
				}
				else if(bt4==false && i%2==0) {
					a[1][0]="O";
					btn4.setFont(new Font("Arial", Font.BOLD, 100));
					btn4.setForeground(Color.white);
					btn4.setText(a[1][0]);
					bt4=true;
					i++;
				}		
				checkgm();
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt5==false && i%2==1) {
					a[1][1] = "X";
					btn5.setFont(new Font("Arial", Font.BOLD, 100));
					btn5.setForeground(Color.white);
					btn5.setText(a[1][1]);
					bt5=true;
					i++;
				}
				else if(bt5==false && i%2==0) {
					a[1][1]="O";
					btn5.setFont(new Font("Arial", Font.BOLD, 100));
					btn5.setForeground(Color.white);
					btn5.setText(a[1][1]);
					bt5=true;
					i++;
				}			
				checkgm();
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt6==false && i%2==1) {
					a[1][2] = "X";
					btn6.setFont(new Font("Arial", Font.BOLD, 100));
					btn6.setForeground(Color.white);
					btn6.setText(a[1][2]);
					bt6=true;
					i++;
				}
				else if(bt6==false && i%2==0) {
					a[1][2]="O";
					btn6.setFont(new Font("Arial", Font.BOLD, 100));
					btn6.setForeground(Color.white);
					btn6.setText(a[1][2]);
					bt6=true;
					i++;
				}	
				checkgm();
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt7==false && i%2==1) {
					a[2][0] = "X";
					btn7.setFont(new Font("Arial", Font.BOLD, 100));
					btn7.setForeground(Color.white);
					btn7.setText(a[2][0]);
					bt7=true;
					i++;
				}
				else if(bt7==false && i%2==0) {
					a[2][0]="O";
					btn7.setFont(new Font("Arial", Font.BOLD, 100));
					btn7.setForeground(Color.white);
					btn7.setText(a[2][0]);
					bt7=true;
					i++;
				}		
				checkgm();
				}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt8==false && i%2==1) {
					a[2][1] = "X";
					btn8.setFont(new Font("Arial", Font.BOLD, 100));
					btn8.setForeground(Color.white);
					btn8.setText(a[2][1]);
					bt8=true;
					i++;
				}
				else if(bt8==false && i%2==0) {
					a[2][1]="O";
					btn8.setFont(new Font("Arial", Font.BOLD, 100));
					btn8.setForeground(Color.white);
					btn8.setText(a[2][1]);
					bt8=true;
					i++;
				}	
				checkgm();
				}
		});
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bt9==false && i%2==1) {
					a[2][2] = "X";
					btn9.setFont(new Font("Arial", Font.BOLD, 100));
					btn9.setForeground(Color.white);
					btn9.setText(a[2][2]);
					bt9=true;
					i++;
				}
				else if(bt9==false && i%2==0) {
					a[2][2]="O";
					btn9.setFont(new Font("Arial", Font.BOLD, 100));
					btn9.setForeground(Color.white);
					btn9.setText(a[2][2]);
					bt9=true;
					i++;
				}		
				checkgm();
				}
		});
		}
		
	public static void checkgm() {
		if(a[0][0].equals("O")&&a[0][1].equals("O")&&a[0][2].equals("O")) {
			btn1.setBackground(Color.red);
			btn2.setBackground(Color.red);
			btn3.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
		}
		if(a[1][0].equals("O")&&a[1][1].equals("O")&&a[1][2].equals("O")) {
			btn4.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn6.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
		}
		if(a[2][0].equals("O")&&a[2][1].equals("O")&&a[2][2].equals("O")) {
			btn7.setBackground(Color.red);
			btn8.setBackground(Color.red);
			btn9.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
		}
		if(a[0][0].equals("O")&&a[1][0].equals("O")&&a[2][0].equals("O")) {
			btn1.setBackground(Color.red);
			btn4.setBackground(Color.red);
			btn7.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
			
		}
		if(a[0][1].equals("O")&&a[1][1].equals("O")&&a[2][1].equals("O")) {
			btn2.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn8.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
		}
		if(a[0][2].equals("O")&&a[1][2].equals("O")&&a[2][2].equals("O")) {
			btn3.setBackground(Color.red);
			btn6.setBackground(Color.red);
			btn9.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
		}
		if(a[0][0].equals("O")&&a[1][1].equals("O")&&a[2][2].equals("O")) {
			btn1.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn9.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
		}
		if(a[0][2].equals("O")&&a[1][1].equals("O")&&a[2][0].equals("O")) {
			btn3.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn7.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 1 Wins (O Player)");
			System.exit(0);
		}
		//---------------------------------
		if(a[0][0].equals("X")&&a[0][1].equals("X")&&a[0][2].equals("X")) {
			btn1.setBackground(Color.red);
			btn2.setBackground(Color.red);
			btn3.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(a[1][0].equals("X")&&a[1][1].equals("X")&&a[1][2].equals("X")) {
			btn4.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn6.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(a[2][0].equals("X")&&a[2][1].equals("X")&&a[2][2].equals("X")) {
			btn7.setBackground(Color.red);
			btn8.setBackground(Color.red);
			btn9.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(a[0][0].equals("X")&&a[1][0].equals("X")&&a[2][0].equals("X")) {
			btn1.setBackground(Color.red);
			btn4.setBackground(Color.red);
			btn7.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(a[0][1].equals("X")&&a[1][1].equals("X")&&a[2][1].equals("X")) {
			btn2.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn8.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(a[0][2].equals("X")&&a[1][2].equals("X")&&a[2][2].equals("X")) {
			btn3.setBackground(Color.red);
			btn6.setBackground(Color.red);
			btn9.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(a[0][0].equals("X")&&a[1][1].equals("X")&&a[2][2].equals("X")) {
			btn1.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn9.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(a[0][2].equals("X")&&a[1][1].equals("X")&&a[2][0].equals("X")) {
			btn3.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn7.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "Player 2 Wins (X Player)");
			System.exit(0);
		}
		if(i==9) {
			btn1.setBackground(Color.red);
			btn2.setBackground(Color.red);
			btn3.setBackground(Color.red);
			btn4.setBackground(Color.red);
			btn5.setBackground(Color.red);
			btn6.setBackground(Color.red);
			btn7.setBackground(Color.red);
			btn8.setBackground(Color.red);
			btn9.setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "TIE GAME");
			System.exit(0);
		}
	}
	
	}


