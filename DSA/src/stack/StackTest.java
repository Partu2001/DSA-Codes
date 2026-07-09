package stack;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
	
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		
//		s.pop();
//		System.out.println(s);
//		
//		System.out.println(s.peek());
		
		System.out.println("Reversed Order : ");
		for(int i=s.size()-1;i>=0;i--) {
			System.out.print(s.get(i) + " ");
		}
	}
}
