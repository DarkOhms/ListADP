/**
 * 
 */

/**
 * @author The Force
 *
 */
public class Stack <T> extends List<T>{

  public void push(T newEntry){
	
	  super.insert(newEntry);
  }
  
  public T pop(){
	  
	  T tempData = tail.data;
	  ListItem <T> newTail = new ListItem<T>(tail.prev.data);
	  tail = newTail;
	  return tempData;
  }
  public T showTop(){
	  
	  return tail.data;
  }
}
