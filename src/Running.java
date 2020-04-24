
public class Running {

	public static void main(String[] args) {
		Dstack stack = new Dstack();
		stack.insert(4);
		stack.insert(6);
		stack.insert(2);
		stack.insert(8);
		stack.delete();
		stack.delete();
		stack.insert(9);
		
		
		//System.out.println(stack.peek(3));
//		
//		stack.delete();
//		stack.delete();
//		stack.delete();
//		stack.delete();
//		stack.delete();
	
		
		System.out.println(stack.delete());
		
		stack.show();
		stack.size();
	}

}

