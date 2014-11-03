
public class node {	
	     int data ;
	     node next = null ;  
	     
	     public node(int newdata){
	     data = newdata ;
	     next = null ;
	     }  
	     
	     public void attach(int newdata){
	    	 node list = this ;
	    	 if(list.next == null)System.out.println("alas only 1 element given! last element so far " + list.data) ;

	    	 {
	    		 while(list.next != null){
	    			 
	    			 //System.out.println("---------------------------------------") ;
	    			 //System.out.println("rolling to the end of the list, current digit : " + list.data ) ;
	    			 
	    			 list = list.next ;	    			 
	    			 //System.out.println("2nd row : " + list.data ) ;
	    			 
	    		 }
	    		 list.next = new node(newdata) ;
	    		 //this.next = new node(newdata) ;
	    		 
	    	 }
	    	 
	    	 
	     }
	     
	     public void print_list_loop(){
	    	 node list = this ;
	    	 if(list == null){System.out.println("this time the list is empty") ;}
	       while(list != null){
	         if(list.next == null){ System.out.println(list.data + " end ") ; break ;}
	         System.out.print( list.data + "-->" ) ;
	         list = list.next ;
	       }             
	     }
	     	     	     
	     public static void main(String args[]){
	            
	          node first = new node( 4) ;
	          
	          System.out.println("\n\nattaching 78:") ;
	          first.attach(78) ;
	          System.out.println("\n\nattaching 5:") ;
	          first.attach(5) ;
	          System.out.println("\n\nattaching 51:") ;	          
	          first.attach(51) ;
	          System.out.println("\n\nattaching 157:") ;
	          first.attach(157) ;
	          System.out.println("\n\nattaching 3:") ;
	          first.attach(3) ;
	             	                 	          
	          //first.print_list_loop() ;
	          
	     } 	        	
}



















































/*
public static void attach_to_end( int newdata, node list){
	 
	 System.out.println("------------------------------") ;
	 //System.out.println("new value: " + newdata ) ;
	 System.out.print("original list: " ) ;
	 print_list_loop(list) ;
	 
       node to_be_added = new node(newdata) ;
       if(list == null){ System.out.println("list is null!!!") ;list = to_be_added ;
       print_list_loop(list) ;
       return ;}
       
       if( list == null ){ 
       	System.out.println("original list is null") ;
       	list = new node(newdata) ;// return list ;
       }
       		            	           
       while(list.next != null){
       	
       	System.out.println("inside the loop(attach function)\nskipping " + list.data) ;
             list = list.next ;
       }
       
       System.out.println("\nnow adding next to : " + list.data); 
       list.next = to_be_added ;           
       //return list ;
}
*/