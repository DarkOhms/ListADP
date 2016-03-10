
public class Driver {

	public static void main(String[] args){
		
		
		Integer temp = 25;
		String userInput = "";
	    
		OrderedList<Integer> myMothaFuckinList = new OrderedList<Integer>();
	
		myMothaFuckinList.insert(5);
		myMothaFuckinList.insert(10);
		myMothaFuckinList.insert(2);
		myMothaFuckinList.insert(3);
		myMothaFuckinList.insert(0);
		
//	    Scanner reader = new Scanner(System.in);
//	    
//	    System.out.println("Enter an Integer for insert then done when finished.");
//	    
//	    while(!userInput.equals("done")){
//	      System.out.print("Enter the next Integer: ");
//	      userInput = reader.nextLine();
//	      if(!userInput.equals("done")){
//	        temp = Integer.valueOf(userInput);
//	        myMothaFuckinList.insert(temp);
//	      }
//	    }
	
	    Iterator<Integer> it = myMothaFuckinList.iterator();
	    
	    //iterate
	    while(it.hasNext())
	    	System.out.println(it.nextData().toString());
	    
	    //search
//	    System.out.println("Enter an Integer for search: ");
//	    userInput = reader.nextLine();
	    userInput = "5";
	    if(myMothaFuckinList.search(Integer.valueOf(userInput)))
	    	System.out.println(userInput + " found.");
	    else
	    	System.out.println(userInput + " not found.");
	    
	    //delete
//	    System.out.println("Enter an Integer to delete from the list: ");
//	    userInput = reader.nextLine();
	    userInput = "5";
	    myMothaFuckinList.delete(Integer.valueOf(userInput));
	    
	  //iterate
		it = myMothaFuckinList.iterator();
	    while(it.hasNext())
	    	System.out.println(it.nextData().toString());
	   
//	    reader.close();
	    
	}
	 
}
