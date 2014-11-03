
public class queue {

	node first ;
	node last ;
	
	
	public void insert(node newnode){
		
		if( first == null ){
			last = newnode ;
			first = last ;
			
		}
		else{
			last.next = newnode ;			
			last = last.next ;
		}
	}
	
	public node remove(){
		if( first!= null ){
			node temp = first ;
			first= first.next ;
			return temp ;
		}
		return null ;
	}
	
}
