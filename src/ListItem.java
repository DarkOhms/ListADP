/**
 * Luke Martin
 * CISP 430
 *
 *  2/27/2016 Start
 */

public class ListItem <T> {
    public T data;

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
