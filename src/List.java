
class List <T extends Comparable> {

    ListItem<T> head = null;
    ListItem<T> tail = null;
    int count;

    public void insert(ListItem newEntry){

        ListItem<T> nextEntry = new ListItem<T>(newEntry);
        if(head == null) {
            head = nextEntry;
            tail = head;
        }else
        if(nextEntry.data.compareTo(head.data)<0){
            nextEntry.next = head;
            head = nextEntry;
        }else
        if(nextEntry.data.compareTo(tail.data)>0){
        	 tail.next = nextEntry;
             tail = nextEntry;
        }else{
        	ListItem temp = head;
        	 while (temp.next.data.compareTo(nextEntry.data) < 0)
                 temp = temp.next;
             nextEntry.next = temp.next;
             temp.next = nextEntry;
        }
        	count++;
    }

    public void delete(){

    }

    public ListItem<T> search(){
        return found; // what is found?
    }
    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }
    public boolean isFull(){
       
    	ListItem<T> test = new ListItem<T>();
        if(test == null)
        	return true;
        else
        	return false;
        
    }
    public void sort();
}
