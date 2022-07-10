package Calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class JOperatorButton extends JButton {
	public JOperatorButton(String button) {
		setBackground(Color.WHITE);
		setText(button);
	    setFont(new Font("Courier", Font.PLAIN, 20));
		}
}
