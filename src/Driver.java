
import java.util.*;

public class Driver {

	public static void main(String[] args){
		
		/*
		Integer temp = 25;
		String userInput = "";
	    
		OrderedList<Integer> myMothaFuckinList = new OrderedList<Integer>();
	
	    Scanner reader = new Scanner(System.in);
	    
	    System.out.println("Enter an Integer for insert then done when finished.");
	    
	    while(!userInput.equals("done")){
	      System.out.print("Enter the next Integer: ");
	      
	      userInput = reader.nextLine();
	      //remember to do verify input
	      
	      if(!userInput.equals("done")){
	        temp = Integer.valueOf(userInput);
	        myMothaFuckinList.insert(temp);
	      }
	    }
	
	    Iterator<Integer> it = myMothaFuckinList.iterator();
	   
	    //iterate
	    while(it.hasNext())
	    	System.out.println(it.nextData().toString());
	    
	    //search
	    System.out.println("Enter an Integer for search: ");
	    userInput = reader.nextLine();
	    
	    if(myMothaFuckinList.search(Integer.valueOf(userInput)))
	    	System.out.println(userInput + " found.");
	    else
	    	System.out.println(userInput + " not found.");
	    
	    //delete
	    System.out.print("Enter an Integer to delete from the list: ");
	    userInput = reader.next();
	    
	    myMothaFuckinList.delete(Integer.valueOf(userInput));
	    it = myMothaFuckinList.iterator();
	    
	  //iterate
	    while(it.hasNext())
	    	System.out.println(it.nextData().toString());
	   
	    reader.close();*/
	  //test stack
	    Stack<String> pancake = new Stack<String>();
	    pancake.push("Let's");
	    pancake.push("Test");
	    pancake.push("the");
	    pancake.push("stack.");
	    
	    Iterator<String> syrup = pancake.iterator();
	    
	    while(syrup.hasNext())
	    	System.out.println(syrup.nextData().toString());
	    
	    System.out.println(pancake.pop());
	    System.out.println(pancake.pop());
	    System.out.println(pancake.pop());
	    System.out.println(pancake.pop());
	    System.out.println(pancake.pop());
	    
	  //test queue
	    Queue<Double> cash = new Queue<Double>();
	    
	    cash.enqueue(25.60);
	    cash.enqueue(30.50);
	    cash.enqueue(66.70);
	    cash.enqueue(75.21);
	    cash.enqueue(100.00);
	    
	    System.out.println(cash.dequeue());
	    System.out.println(cash.dequeue());
	    System.out.println(cash.dequeue());
	    System.out.println(cash.dequeue());
	    System.out.println(cash.dequeue());
	}
	 
}
