package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String s =JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(s.equals("yes")) {
	JOptionPane.showMessageDialog(null, "yay");
}

else { 
		// 3. Otherwise, wish them good luck washing dishes.
JOptionPane.showMessageDialog(null,"Otherwise,good luck washing dishes.");

	}
}
}
