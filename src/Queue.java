
public class Queue <T> extends List <T> {

	public void enqueue(T data){
	
		insert(data);
	}
	
	public T dequeue(){
		
		T tempData = firstInLine();
		removeFromTail();
		return tempData;
	}
	
	public T firstInLine(){
		if(head == null){
			return null;
		}else{
			return head.data;
		}
	}
}
