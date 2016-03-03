/**
 * Luke Martin
 * CISP 430
 *
 *  2/27/2016 Start
 */

public class ListItem {
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
