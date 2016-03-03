/**
 * Luke Martin
 * CISP 430
 * 
 *  2/27/2016 Start
 */

 *
 */
public class ListItem {
  
	//data
	int data;
	
	ListItem next = null;
	ListItem previous = null;
	
	ListItem(int newData){
		data = newData;
		next = null;
	}
	ListItem(ListItem newItem){
		data = newItem.getData();
		next = newItem.getNext();
	}
	public int getData(){
		return data;
	}
	public ListItem getNext(){
		return next;
	}
	public void setNext(ListItem refNext){
		next = refNext;
	}
	
}
