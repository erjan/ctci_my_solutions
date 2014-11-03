
public class some_crazy_example {

	
	public static void print_array(int []a){
		for(int i = 0 ; i  < a.length ; i++)
			System.out.println(" a[" + i + "]: " + a[i]) ;
		
	}
	
	
	public static node divide_around_x(node node, int x){
		System.out.println("---------------DIVIDE AROUND X----------------------------------------") ;
		node less_than = null ;
		node bigger_than = null ;
						
		while( node!= null){
			System.out.println("^^^^") ;
		    node temp = node.next ;
		    System.out.println("comparing :" +  node.data) ;
		    if(node.data < x){
		    	System.out.println("LESS ") ;
		    	node.next = less_than ;
		    	less_than = node ;
		    	
		    }
		    else if(node.data >= x){
		    	System.out.println("BIGGER ") ;
		    	node.next = bigger_than ;
		    	bigger_than = node ;
		    }		    
			node = temp ;			
		}
		
		less_than.print_list_loop();
		bigger_than.print_list_loop();
		
		node result = less_than ;
		//hop through the node to the end of it
		while( less_than.next != null){
			less_than = less_than.next ;			
		}
		less_than.next = bigger_than ;
		//result = less_than ;
		return result ;
		
		
	}
	
	
	public static void main(String[] args) {
       
		node first = new node( 1);		
		first.attach(2) ;
		first.attach(3) ;
		first.attach(4) ;
		first.attach(5) ;
		first.attach(6) ;
		first.attach(7) ;
		
		node result = divide_around_x( first, 5) ;
		result.print_list_loop() ;
		
	}

}
