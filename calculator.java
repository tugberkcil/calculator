package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator {

	public static void main(String[] args) {
		JFrame frame =new JFrame("Calculator");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel=new JPanel();
		JPanel mainPanel=new JPanel();
		
		frame.add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.WHITE);
		frame.add(mainPanel);
		topPanel.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("0");
		label.setFont(new Font("Courier", Font.PLAIN, 20));
		
		topPanel.add(label, BorderLayout.EAST);
		mainPanel.setLayout(new GridLayout(4,4));
		
	    mainPanel.add( new JOperatorButton("7"));
	    mainPanel.add( new JOperatorButton("8"));
	    mainPanel.add( new JOperatorButton("9"));
	    mainPanel.add( new JOperandButton("/"));
	    mainPanel.add( new JOperatorButton("4"));
	    mainPanel.add( new JOperatorButton("5"));
	    mainPanel.add( new JOperatorButton("6"));
	    mainPanel.add( new JOperandButton("x"));
	    mainPanel.add( new JOperatorButton("1"));
	    mainPanel.add( new JOperatorButton("2"));
	    mainPanel.add( new JOperatorButton("3"));
	    mainPanel.add( new JOperandButton("-"));
	    mainPanel.add( new JOperatorButton("0"));
	    mainPanel.add( new JOperatorButton("."));
	    mainPanel.add( new JOperandButton("="));
	    mainPanel.add( new JOperandButton("+"));
		
     	frame.setVisible(true);

	}

}
