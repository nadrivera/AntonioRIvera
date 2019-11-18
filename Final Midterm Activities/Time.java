import javax.swing.JOptionPane;

public class Minutes{
	public static void main (String[] args){
		String input;
		int minutes1, minutes2, hours; 
		
		input = JOptionPane.showInputDialog("Enter time in minutes: ");
		minutes1 = Integer.parseInt(input); 
		hours = minutes1/60; 
		minutes2 = minutes1%60;
		JOptionPane.showMessageDialog(null, minutes1 + " is equal to " + hours + " hours and " + minutes2 + " minute/s");
	} 
}