public class IfStatements {
	public static void main (String[] args){
		
		boolean a = true;
		String b;
		b = a?"a is true":"a is false";
		
		System.out.println(b);
		
	
		String fName = "Michael";
		String lName = "Gay yaman Jr";
		char mI = 'L';
		short age = 21;
		String ageChecker;
		ageChecker = (age >= 18)? "Age is above 18" : "Age is below 18";
		
		System.out.println(fName + " " + lName);
		System.out.println(ageChecker);
		System.out.println();
		
		int num1 = 20;
		int num2 = 10;
		
		//boolean cond1 = 10!=10;
		
		if(num1 == num2 || num1 >= num2){
			if(num1 == num2){
				System.out.println(num1 + " is equal to " + num2);
			}else if(num1 >= num2){
				System.out.print(num1 + " is equal or greater than " + num2);
			}
			
			//System.out.println(num1 + " is equal to " + num2 + " or " + num1 + " is equal or greater than " + num2);
			
		}else if (num1 != num2 || num1 < num2){
			System.out.println(num1 + " is not equal to " + num2 + " or " + num1 + " is less than " + num2);
		}else if (num1 <= num2){
			System.out.println(num1 + " is less than and equal " + num2);
		}else{
			System.out.println("The End");
		}
	
		
		
	}
}