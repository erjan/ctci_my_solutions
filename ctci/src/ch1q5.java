public class ch1q5 {
	/*
    public void compressed(String original_string){
    	int streak ;
    	for(int i = 0 ; i < original_string.length() ; i++){
    		System.out.println("---------------------------------") ;	
    		
    		if (i == original_string.length()-1) break ;
    		
    		streak = 0 ;
    		boolean is_streak = true ;
    		while(is_streak){
        		System.out.println("while **** while *** while") ;
    			char next = original_string.charAt(i+1) ;
        		char current = original_string.charAt(i) ;
        		
        		
    			if( current == next ){ System.out.println(" + 1 ") ; 
    			streak++ ;}
        		else is_streak = false ;//System.out.println("streak ended, its length: " + streak) ;
    		}    		
    		System.out.println("streak ended, its length: " + streak) ;
    		    		    		
    		
    		}//end of for     		
    	}
    	
    }
*/

public String compressed(String original_string){
	int streak ;
	String compressed_string = "" ;
	for(int i = 0 ; i < original_string.length() ; i++){
		if (i == original_string.length()-1) break ;
		System.out.println("---------------letter " + original_string.charAt(i) + " ------------------") ;			
				
		streak = 0 ;
		
		char next = original_string.charAt(i+1) ;
    	char current = original_string.charAt(i) ;    		    	
		if( current == next ){ streak++ ;}			
    	else		System.out.println("streak ended, its length: " + streak) ;
		--i ;
		}//end of for
	
	  if(compressed_string.length() >= original_string.length()) return original_string ;
	  else return compressed_string ;
	  
	}
	
}

