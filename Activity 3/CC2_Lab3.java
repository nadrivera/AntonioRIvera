import java.util.Scanner;

public class CC2_Lab3 {
	public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    
    String name;
    int sum = 0, product = 1, average = 0, remainder = 0, count = 0;
       
    System.out.print("Enter your name: ");
    name = input.nextLine();
    
    /*if(!name.contains("!")){
      name += "!";
    }*/
    
    int lengthOfName = name.length();
       
    for(int x = 0; x < lengthOfName; x++){
      
      if(name.charAt(x) == '!'){
        count++;
      }
      
      char charName = name.charAt(x);
      int asciicode = (int)charName;
      System.out.println(charName + "-" + asciicode);
      
      sum = sum + name.charAt(x);
      product = product * name.charAt(x);
      average = (sum/(lengthOfName - count));
      remainder = product % average;
      
    }
    
    System.out.println(name);
        
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
    System.out.println("Average: " + average);
    System.out.println("Remainder: " + remainder);
    //System.out.println("Remainder2: " + product % average);
    
	}
}




