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

public class ListItem {
    
	//members are public because Mike said it was cool.  :)
	public int data;

    public ListItem next = null;
    public ListItem prev = null;

    ListItem(int newData){
        data = newData;
    }
    ListItem(ListItem newItem){
        data = newItem.data;
        next = newItem.next;
        prev = newItem.prev;
    }
}
