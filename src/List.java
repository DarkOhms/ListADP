
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
        	tail.next = nextEntry;
        	tail = nextEntry;
        }
        	count++;
    }
  
    public void delete(){

    }

    public boolean search(T data){
        
    	Iterator<T> it = this.iterator();
    	
    	if (data == null) {
    	    while(it.hasNext()) {
    	        if (it.next() == null) {
    	            return true;
    	        }
    	    }
    	} else {
    	    while(it.hasNext()) {
    	        if (data.equals(it.next())) {
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
