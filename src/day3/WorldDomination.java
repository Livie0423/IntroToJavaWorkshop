package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String ans = JOptionPane.showInputDialog(null, "do u know how to code");

		// 2. If they say "yes", tell them they will rule the world.
		if (ans.equals("yes")) {
			JOptionPane.showMessageDialog(null, "U WIL RUL DA WURLD!1!11!!");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "GUD LUK WASHIN DISHIS!!!11!!1");

		}

	}
}
