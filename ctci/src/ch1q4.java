
public class ch1q4 {
      public String replace_with_20(String to_work_with){
    	  
    	String res = "" ;
    	
    	for(int i = 0 ; i < to_work_with.trim().length() ; i++){
    		if( to_work_with.charAt(i) == ' ')
    			res += "%20" ;
    	
    	else res += to_work_with.substring(i, i+1) ;
    	}  
    	return res ;
      	}
      
      public String replace_with_20_2(char []str){
    	 int spacecount = 0 ; 
    	 int newlen = 0 ;
    	 String same = str.toString() ;
    	 System.out.println("same string : " + same) ;
    	 
    	 System.out.println( "same string trimmed :" +   same.trim() ) ;
    	 
    	 int len = same.length() ;
    	 System.out.println("trimmed len:" + len) ;
    	 for(int i = 0 ; i < len; i++){
    		 if(str[i] == ' ') spacecount++ ;
    	 }
    	 
    	 newlen = str.length  + spacecount *2 ;
    	 
    	 char []final_res = new char[newlen] ;
    	 int final_res_position = 0 ;
    	 for(int i = 0 ; i < str.length; i++){
    		 if( str[i] == ' '){
    			 final_res[final_res_position] = '%' ;
    			 final_res[final_res_position+1] = '2' ;
    			 final_res[final_res_position+2] = '0' ;
    			 final_res_position += 2 ;
    			 //final_res_position++;
    		 }
    		 else final_res[final_res_position] = str[i] ;
    		 final_res_position++ ;
    	 }
    	 return new String(final_res) ;
      }      
    }

