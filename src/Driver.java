
import java.util.*;

public class Driver {

	public static void main(String[] args){
		
		
		Integer temp = 25;
		String userInput = "";
	    
		List<Integer> myMothaFuckinList = new List<Integer>();
	
	    Scanner reader = new Scanner(System.in);
	    
	    System.out.println("Enter an Integer for insert then done when finished.");
	    
	    while(!userInput.equals("done")){
	      System.out.print("Enter the next Integer: ");
	      userInput = reader.nextLine();
	      if(!userInput.equals("done")){
	        temp = Integer.valueOf(userInput);
	        myMothaFuckinList.insert(temp);
	      }
	    }
	 
	    reader.close();
	}
}
