public class VariablesAndDataTypes {
	public static void main (String[] args){

			String fSentence = "\nThe temperature in Baguio city has warmed throughout the years.";
			char fLetter = 'A';
			float degrees = 16.0f;
			double degrees2 = 23.5;
			byte hours = 24;
			short weeks = 4;
			int days = 7;
			long months = 12;
			
			boolean b = false;
			
			/*System.out.print(fSentence + "\n\t" + fLetter + " recent news article stated that the city has been averaging " + degrees + 
			"degrees celsius at dawn and " + time + " at noon.\n\t\tRegardless, lowlanders still feel cold " + hours + " hours a day, " 
			+ days + " days a week, " + weeks + " weeks per months and " + months + " month each year.\n\n");*/
			
			if(b == true){
        System.out.print(fSentence + "\n\t" + fLetter + " recent news article stated that the city has been averaging " + degrees + 
        "degrees celsius at dawn and " + degrees2 + " at noon.\n\t\tRegardless, lowlanders still feel cold " + hours + " hours a day, " 
        + days + " days a week, " + weeks + " weeks per months and " + months + " month each year.\n\n");
        }else{
          System.out.println("\nThe boolean was changed to a False value.");
      }
			
			
	}
}