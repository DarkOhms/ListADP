/**
 * Luke Martin
 * CISP 430
 *
 *  2/27/2016 Start
 *  
 *  3/2/2016
 *  
 *  
 */

<<<<<<< HEAD
public class ListItem {
    
	//members are public because Mike said it was cool.  :)
	public int data;
=======
public class ListItem <T> {
    public T data;
>>>>>>> origin/master

    public ListItem<T> next = null;
    public ListItem<T> prev = null;

    ListItem(T newData){
        data = newData;
    }
    ListItem(ListItem<T> newItem){
        data = newItem.data;
        next = newItem.next;
        prev = newItem.prev;
    }
}
