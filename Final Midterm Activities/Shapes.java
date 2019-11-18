import java.util.Scanner;
import java.text.DecimalFormat;

public class Shapes {
    public static void main(String[] args) {

	    DecimalFormat df = new DecimalFormat("0.00");
	    Scanner scan = new Scanner (System.in);
	
	    double pi = Math.PI, radius, length, width, height, base, totalArea;
	    String shape;
	    char yes;
		
		do{	
			System.out.print("\nShapes Available in the System are:\n  - Circle\n  - Square\n  - Rectangle\n  - Triangle");
			System.out.print("\n\nEnter Name of Shape: ");
			shape = scan.next();
			System.out.println();
					
			try{
				switch (shape.toUpperCase()) {
					
				    case "C":
				    case "CIRCLE":
						do{
							System.out.print("Please enter VALID radius of a circle: ");
							radius = scan. nextDouble();
						}while(radius <= 0);
		
						totalArea = pi * radius * radius ;
						System.out.println("Area of the circle is: " + df.format(totalArea) + "\n");
						break;
					case "S":
					case "SQUARE":
						do{
							System.out.print("Please enter VALID length|width of a square: ");
							length = scan. nextDouble ();
						}while(length <= 0);
								
						totalArea = length * length;
						System.out.println("\nArea of the square is: " + df.format(totalArea) + "\n");
						break;						
					
					case "R":
					case "RECTANGLE":
						do{
							System.out.print("Please enter VALID length of the rectangle: ");
							length = scan. nextDouble ();		
						}while(length <= 0);
								
						do{
							System.out.print("\nPlease enter VALID width of a rectangle: ");
							width = scan. nextDouble();
						}while(width <= 0);
								
						totalArea = length*width;
						System.out.println("\nArea of the rectangle is: " + df.format(totalArea) + "\n");
						break;
					
					case "T":
					case "TRIANGLE":
						do{
							System.out.print("Please enter VALID base|width of a triangle: ");
							base = scan. nextDouble ();
						}while(base <= 0);
							
						do{
							System.out.print("\nPlease enter VALID height of a triangle: ");
							height = scan. nextDouble();
						}while(height <= 0);
							
						totalArea = ((base*height)/2);
						System.out.println("\nArea of the triangle is: " + df.format(totalArea) + "\n");
						break;
	
					default:
						System.out.println("\nOnly Available Shapes in the System are:\n  - Circle\n  - Square\n  - Rectangle\n  - Triangle");
				}
					
			}catch(Exception e){
				
				System.out.println("Invalid Input. Not a Number\n");
				yes = scan.next().charAt(0);
			}
					
			System.out.print("\tDo you want to try Again ??? (Y/N): ");
			yes = scan.next().charAt(0);
	
		}while(yes == 'y' || yes == 'Y');
		
		
    }
}
