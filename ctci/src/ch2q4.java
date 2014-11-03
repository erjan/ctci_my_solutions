
public class ch2q4 {
	
	public static void divide_list_around_x(int x, node list){
				
		node less_than = new node(0);
		node bigger_than  = new node(0);
		
		node current = list ;
		while(current != null){
			if( current.data < x){
				System.out.println(" \n\nfound one smaller :" + current.data) ;
				less_than.attach(current.data);
				System.out.println("inside function, after attaching, less than is: ") ;
			    less_than.print_list_loop();
			}			
			else{
				System.out.println(" \n\nfound one bigger :" + current.data) ;
				bigger_than.attach(current.data) ;
				
			}
			current = current.next ;			
		}
		
		System.out.println("-------------------------------------------------------------") ;
		less_than = less_than.next ;
		bigger_than = bigger_than.next ;
		less_than.print_list_loop() ;
		bigger_than.print_list_loop() ;
		
		System.out.println("end of the function") ;

	}
	
	
	public static void main(String[] args) {

		 node first = new node( 4) ;                    
         first.attach( 78) ;
         first.attach( 5) ;
         first.attach( 51) ;
         first.attach( 157) ;
         first.attach( 3) ;          	                   
                
         divide_list_around_x(78,first) ; 
	}

}
