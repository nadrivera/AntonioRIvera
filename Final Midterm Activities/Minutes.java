import javax.swing.JOptionPane;

public class Minutes{
	public static void main (String[] args){
	
		String input, yes;
		int minutes1, minutes2, hours;
		char y;
		
		do{
			try{
				input = JOptionPane.showInputDialog("Enter time in minutes: ");
				
				if(input == null){
					
					JOptionPane.showMessageDialog(null, "Thank You");
					System.exit(0);
					
				}else if(input != null){
					
					minutes1 = Integer.parseInt(input);
				
					if(minutes1 > 0){

						hours = minutes1/60;
						minutes2 = minutes1%60;
						
						JOptionPane.showMessageDialog(null, minutes1 + " is equal to " + hours + " hours and " + minutes2 + " minute/s");
					}else
						JOptionPane.showMessageDialog(null, "Invalid Time");
				}
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Invalid Input");
			}
			
			yes = JOptionPane.showInputDialog("Do you want to try Again ??? (Y/N): ");
			
			if(yes == null){
				JOptionPane.showMessageDialog(null, "Thank You");
				System.exit(0);
			}
			
			y = yes.charAt(0);
			
			
		}while(y == 'y' || y == 'Y');
		
		JOptionPane.showMessageDialog(null, "Thank You");	
	
	}
}