package stack;

public class StackTest2 {
	
	int [] arr=new int[5];
	int top=-1;
	
	public void push(int data) {
		if(top==arr.length-1) {
			System.out.println("Stack overflow");
			return;
		}
		arr[++top]=data;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return -1;
		}
		return arr[top--];
	}
	
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	
	public void peek() {
		if(top==-1) {
			System.out.println(top);
		}
		else {
			System.out.println(arr[top]);
		}
	}

	public static void main(String[] args) {
		
		StackTest2 st=new StackTest2();
		st.push(10);
		st.push(5);
		st.push(1);
		st.push(9);
		st.push(7);
		st.display();
		
		System.out.println("After Pop");
		st.pop();
		st.display();
		
		st.peek();
	}

}
