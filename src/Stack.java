
public class Stack {
	int top = 0;
	int stack[] = new int[5];
	
	public void insert(int data) {
		
		if(top == 5) {
			System.out.println("Stack is full");
		}
		else
		{	
		
		stack[top] = data;
		top++;
	}
	}
	
	public int delete() {
		
		
		if(top <= 0) {
			System.out.println("Stack is empty");
			return 0;
		}
		
		else {
			top--;
		int data = stack[top];
	    stack[top] = 0;	
	    return data;
	    
	}
	}
	
	public void size() {
		System.out.println("size = "+ top);
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
