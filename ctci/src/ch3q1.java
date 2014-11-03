	
public class ch3q1 {
	
	static int default_stacksize = 10 ;		
	static int stack_pointers[] = {-1,-1,-1} ;
	
	public static void push(int snake[],int value, int stack_num){
		if ( (stack_pointers[stack_num]+1) >= default_stacksize)  {
			System.out.printf("stack No %d is full !", stack_num) ;			
		}
		stack_pointers[stack_num]++ ;
		
		snake[ stack_pointers[stack_num] + stack_num *default_stacksize  ] = value ;
	}

	static int pop(int snake[], int stack_num){
		if( isEmpty(stack_num)){			
			return -1 ;
		}
		else{
	     int result = snake[ stack_pointers[stack_num] + stack_num *default_stacksize  ] ;
	     snake[ stack_pointers[stack_num] + stack_num *default_stacksize  ] = 0 ;
	     stack_pointers[stack_num]-- ;
	     return result ;
		}		
		
		
	}
	
	static void peek(int[]snake, int stack_num){
		int result =  snake[ stack_pointers[stack_num] + stack_num *default_stacksize ] ;
		System.out.printf("peek stack No %d: %d\n", stack_num, result) ;
	}
	
	static boolean isEmpty(int stack_num){
		return stack_pointers[stack_num] == -1 ;
	}
	public static void print_3_stacks(int snake[]){
		System.out.println("SNAKE") ;
		for(int i = 0 ; i < snake.length ; i++){
			if( i == 0 || i == default_stacksize || i == 20){
				
				System.out.printf("%d------[ %d ]-------\n", i, snake[i]);
			}
			else System.out.printf("%d  [ %d ]\n", i, snake[i] );
		}
		
		
	}
	public static void main(String[] args) {
		
		
		int snake[] = new int[default_stacksize*3] ;
						
		
		push(snake, 34, 0 ) ;
		
		push(snake, 34, 1 ) ;
		
		push(snake, 99999, 2 ) ;
		push(snake, 99, 2 ) ;
		push(snake, 99, 2 ) ;	
		push(snake, 99, 2 ) ;
		push(snake, 80, 2 ) ;
		
		pop(snake, 2) ;
		peek(snake,2) ;
		print_3_stacks(snake);
		System.out.println("snake len: " +  snake.length) ;		
	}

}
