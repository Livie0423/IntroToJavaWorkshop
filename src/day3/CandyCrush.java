package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String yas = JOptionPane.showInputDialog(null, "WHO DO YOU NOT LIKE!?!?");
		// 2. Change the next line so that the pop-up will tell them they have a
		// crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + yas);
		// 3. Ask the user for the name of their best friend
		String yus = JOptionPane.showInputDialog(null, "YOUR BEST FRIENDS NAME!");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, yus + " YER FRIEND IS SWEET AS THAT THERE CANDY!");
	}
}
