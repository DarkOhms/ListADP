
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

    public ListItem<T> search(){
        return new ListItem<T>(); // what is found?
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
}
