package day3;

import javax.swing.JOptionPane;

public class PublicClassDay3 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Determination");
		System.out.print("Frisk");
		System.out.println("Papyrus");
		String name = "Thadius";
		String ans = JOptionPane.showInputDialog("Sans");
		JOptionPane.showMessageDialog(null, "Play UnderTale");
		JOptionPane.showMessageDialog(null, ans);
		JOptionPane.showMessageDialog(null, "HaveYouPlayedUndertale" + ans);

	}

}
