/*
 * Luke Martin
 * CISP 430
 * Dixon
 * 
 *  Class Associations
 *  
 *  List<T> ----------- 1:m contains --- ListItem<T>
 *  List<T> ----------- 1:m uses  ------ Iterator<T>
 *  Iterator<T> ------- 1:1 uses ------- ListItem<T>
 *  OrderedList<T> ---- 1:1 extends ---- List<T>
 *  Stack<T> ---------- 1:1 extends ---- List<T>
 *  Queue<T> ---------- 1:1 extends ---- List<T>
 *  
 *  Class List<T>
 *  
 *  (#)ListItem<T> head
 *  (#)ListItem<T> tail
 *  (#)int count
 *  (+)void insert(T) //insert list item into the list at tail
 *  (+)void delete(T)  //deletes first instance of a ListItem containing T data
 *  (+)boolean search(T) //returns true if the data is in the list
 *  (+)boolean isEmpty() //returns true if head is null
 *  (+)boolean isFull()  // attempts to allocate memory for a new list item
 *  (+)int getCount()  // returns count
 *  (+)Iterator<T> iterator() //gets an iterator for the list 
 *  
 *  Class OrderedList<T extends Comparable<T>> extends List<T>
 *  
 *  (+)void insert(T) // performs a sorted insert
 *  
 *  Class ListItem<T>
 *  
 *  (#)ListItem<T> next
 *  (#)ListItem<T> prev
 *  (#)T data
 *  (#)ListItem() // default constructor
 *  (#)ListItem(T) // parameterized constructor
 *  (#)ListItem(ListItem<T>) // parameterized constructor
 *  
 *  Class Iterator<T>
 *  
 *  (#)ListItem<T> currentItem
 *  (+)Iterator<T> (ListItem<T>) // constructor
 *  (+)T nextItem() // gets the next item
 *  (+)boolean hasNext() //checks if the iterator has gone through the list
 *  
 *   Class Stack<T>
 *   
 *   (+)push(T) // adds to the tail of the list
 *   (+)T pop() //reveals and removes a ListItem from the tail
 *   (+)T showTop() //reveals top
 *   
 *   Class Queue<T>
 *   
 *   (+)enqueue(T) // inserts a ListItem
 *   (+)T dequeue() // removes a ListItem from head
 */
public class List <T> {

    ListItem<T> head = null;
    ListItem<T> tail = null;
    int count = 0;

    public void insert(T newEntry){

        ListItem<T> nextEntry = new ListItem<T>(newEntry);
        if(head == null) {
            head = nextEntry;
            tail = head;
        }else{
        	nextEntry.prev = tail;
        	tail.next = nextEntry;
        	tail = nextEntry;
        }
        	count++;
    }
  
    public void delete(T data){
      
      //head case lol!
      if(head.data == data){
    	 head = head.next;
    	 head.prev = null;
      }else{
    	  if(tail.data == data){
    		  tail = tail.prev;
    		  tail.next = null;
    	  }else{
    		  ListItem<T> i = head.next;
    		  while (i != null) {
    		    if(i.data.equals(data)){
    		      i.prev.next = i.next;	
    		      break;
    		    }
    		    
    		      i = i.next;
    		  }
    		    }
    		   
    	    }
      count--;
          }
  
    public boolean search(T data){
        
    	Iterator<T> it = this.iterator();
    	
    	if (data == null) {
    	    while(it.hasNext()) {
    	        if (it.nextData() == null) {
    	            return true;
    	        }
    	    }
    	} else {
    	    while(it.hasNext()) {
    	        if (data.equals(it.nextData())) {
    	            return true;
    	        }
    	    }
    	}
    	return false;
   }
    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }
    
    public int getCount(){
    	return count;
    }
    
    @SuppressWarnings("unused")
    public boolean isFull(){
       try{
    	ListItem<T> test = new ListItem<T>();
       }catch(OutOfMemoryError e){
       return true;}
       
       return false;
        
    }
 
    public Iterator<T> iterator(){
    	Iterator<T> it = new Iterator<T>(head);
    	return it;
    }
    
}
