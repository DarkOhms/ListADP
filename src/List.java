
public class List <T> {

    ListItem<T> head = null;
    ListItem<T> tail = null;
    int count;

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
    
    @SuppressWarnings("unused")
    public boolean isFull(){
       try{
    	ListItem<T> test = new ListItem<T>();
       }catch(OutOfMemoryError e){
       return true;}
       
       return false;
        
    }
    public void sort(){}
    
    public Iterator<T> iterator(){
    	Iterator<T> it = new Iterator<T>(head);
    	return it;
    }
    
}
