
public class ch1q3 {
	
	  public String sort(String s){
		  char []same_string_in_chars = s.toCharArray() ;
		  java.util.Arrays.sort(same_string_in_chars) ;
		  return new String(same_string_in_chars) ;
	  }
	  
      public boolean is_permut(String s1, String s2){
    	  
    	  if( s1.length() != s2.length() ) return false ;
    	  
    	  s1 = sort(s1) ;
    	  s2 = sort(s2) ;
    	  System.out.println("s1 sorted: " + s1) ;
    	  System.out.println("s2 sorted: " + s2) ;
    	  if( s1.equals(s2))return true ;
    	  else return false ;
      }
}
