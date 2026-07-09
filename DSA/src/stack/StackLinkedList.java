package stack;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}


public class StackLinkedList {
	
	Node top;
	
	public void push(int data) {
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
	}
	
	public int pop() {
		if(top==null) {
			System.out.println("Stack underflow");
			return-1;
		}
		
		int v=top.data;
		top=top.next;
		return v;
	}
	
	public int peek() {
		
		return top.data;
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {

		StackLinkedList sl=new StackLinkedList();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);
		sl.push(50);
		sl.display();
		
		sl.pop();
		sl.display();
		
		System.out.println(sl.peek());


	}

}
