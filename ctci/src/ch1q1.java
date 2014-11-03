
public class ch1q1 {

	public boolean all_unique_characters(String many_letters){		
		for(int i = 0 ; i < many_letters.length() ; i++){
			System.out.println("--------------------------") ;
			char current_char = many_letters.charAt(i) ;
			System.out.print("current letter: " + current_char + " comparing to: ") ;
			
			for(int j = i+1 ; j < many_letters.length() ; j++){
				System.out.print( many_letters.charAt(j) + " ") ;
				if(current_char == many_letters.charAt(j)) { System.out.println("\nerror: found identical letter:" + many_letters.charAt(j) + " = " + current_char) ; return false ;}
			}			
			System.out.println() ;
		}		
		return true ;
	}	
	public boolean all_unique_chars2(String check_me){
		boolean set[] = new boolean[256] ;
		for(int i = 0  ; i < check_me.length() ; i++){
			int current = check_me.charAt(i) ;
			if( set[current]) return false ;
			else set[current] = true ;			
		}
		return true ;
	}	
}
