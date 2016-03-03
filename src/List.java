
abstract class List {

    ListItem head = null;
    ListItem tail = null;
    int count;

    public void init(){

    }

    public void insert(ListItem newEntry){

        ListItem nextEntry = new ListItem(newEntry);
        if(head == null){
            head = nextEntry;
            tail = head;
        }else

            count++;
    }

    public void delete(){

    }

    public ListItem search(){

        return found;
    }
    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }
    public boolean isFull(){

    }
    public void sort();
}
