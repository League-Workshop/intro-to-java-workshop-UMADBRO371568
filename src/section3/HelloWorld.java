package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello");
String userName=JOptionPane.showInputDialog("What is your name");
	
	
	JOptionPane.showMessageDialog(null,"Hello " +userName);

}
}
