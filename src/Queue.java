
public class Queue <T> extends List <T> {

	public void enqueue(T data){
	
		insert(data);
	}
	
	public T dequeue(){
		
		T tempData = head.data;
		ListItem <T> newHead = new ListItem<T>(head.next.data);
		newHead.next = head.next;
		head = newHead;
		return tempData;
	}
}
