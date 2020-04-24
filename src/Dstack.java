
public class Dstack {
	int top = 0;
	int capacity = 2;
	int stack[] = new int[capacity];
	
	public void insert(int data) {
		
		if(size()==capacity) 
			expand();
		
		stack[top] = data;
		top++;
	}
	
	public void expand() {
		int length = size();
		int []dyNamic = new int[capacity*2];
		System.arraycopy(stack, 0, dyNamic, 0, length);
		stack = dyNamic;
		capacity*=2;
	}
	public int delete() {
		int data;
		
		if(top <= 0) {
			System.out.println("Stack is empty");
			return 0;
		}
		
		else {
			top--;
	    data = stack[top];
	    stack[top] = 0;	
	    shrink();
	    
	}
		  
	    return data;
	}
	
	private void shrink() {
		int length = size();
		if(length<capacity/2/2)
			capacity = capacity/2;
		int []newStack = new int[capacity];
		System.arraycopy(stack,0, newStack, 0, length);
		stack = newStack;
		
	}

	public int size() {
		return top;
	}
	
	public int peek(int index) {
		int data;
		data = stack[index];
		return data;
	}
	
	public void show() {
		System.out.print("Element = ");
		for(int n : stack) {
			System.out.print(n + " ");
		}
	}

}
