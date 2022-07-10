package Calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class JOperandButton extends JButton{
	public JOperandButton (String button) {
		setText(button);
		setBackground(Color.GRAY);
	    setFont(new Font("Courier", Font.PLAIN, 20));
	 }
}
