
public class stack {

	node top ;

	public void push(int newdata){
		node t = new node(newdata) ;

		t.next = top ;
		top = t ;
	}
	public Object pop(){
		if( top != null){
			int result = top.data ;
			top = top.next ;
			return result ;
		}
		return null ;

	    	
	}

	public int peek(){
		return top.data ;
	}

}
