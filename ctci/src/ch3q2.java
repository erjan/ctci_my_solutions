
public class ch3q2 {

	
	private class StackWithMin extends Stack<NodeWithMin>
		public void push(int value){
		int newmin = Math.min(value, min()) ;
		super.push(new NodeWithMin(value,newmin)) ;
	}
	public int min(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE ;					
		}
		else{
			return peek().min ;
		}
	}
	
    private class NodeWithMin{
    	public int value ;
    	public int min ;
    	public NodeWithMin(int v, int newmin){
    		value = v ;
    		min = newmin ;
    	}
    }

}
