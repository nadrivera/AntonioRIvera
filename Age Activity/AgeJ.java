import javax.swing.JOptionPane;

public class AgeJ{
	public static void main (String[] args){
		
		//JOptionPane
		
		int age;
		String input;
		
		while(true){
			
			try{
				
				input = (JOptionPane.showInputDialog(null,"Enter your Age\n"));
				
				if(input == null)
				
					System.exit(0);
					
				else if(input != null){
				
					age = Integer.parseInt(input);
					
					if(age < 0)
						JOptionPane.showMessageDialog(null, "\nYou Entered a Negative number/s.\n\tKindly Enter a Valid Value: ");
					else if(age >= 123)
						JOptionPane.showMessageDialog(null, "\nYou Exceed the Maximum required number/s.\n\tKindly Enter a Valid Value: ");
					else{
						if(age <= 3)
							JOptionPane.showMessageDialog(null, "Age Category: Baby");
						else if(age <= 12)
							JOptionPane.showMessageDialog(null, "Age Category: Child");
						else if(age <= 19)
							JOptionPane.showMessageDialog(null, "Age Category: Teen");
						else if(age <= 32)
							JOptionPane.showMessageDialog(null, "Age Category: Yound Adult");
						else if(age <= 45)
							JOptionPane.showMessageDialog(null, "Age Category: Middle Aged");
						else if(age <= 59)
							JOptionPane.showMessageDialog(null, "Age Category: Adult");
						else if(age <= 122)
							JOptionPane.showMessageDialog(null, "Age Category: Senior");
						
						break;
					}
				}
					
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "\nKindly Enter a Number.");
				JOptionPane.showMessageDialog(null, "\tKindly Enter your Age Again: ");
			}
		
		}
		
	}
}