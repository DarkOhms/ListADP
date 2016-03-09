
import java.util.*;

public class Driver {

	public static void main(String[] args){
		
		
		Integer temp = 25;
		String userInput = "";
	    
		OrderedList<Integer> myMothaFuckinList = new OrderedList<Integer>();
	
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
	    Iterator<Integer> it = myMothaFuckinList.iterator();
	    
	    //iterate
	    while(it.hasNext())
	    	System.out.println(it.nextData().toString());
	    
	}
}
