
abstract class List <T> {

    ListItem<T> head = null;
    ListItem<T> tail = null;
    int count;

    public void init(){

    }

    public void insert(ListItem newEntry){

        ListItem<T> nextEntry = new ListItem<>(newEntry);
        if (head == null) {
            head = nextEntry;
            tail = head;
        } else
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

    }
    public void sort();
}
