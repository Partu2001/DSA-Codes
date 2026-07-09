package stack;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        String demo = "This is Book";
        Stack<Character> s = new Stack<>();
        
        for(char c:demo.toCharArray()) {
        	if(c!=' ') {
        		s.push(c);
        	}else {
        		while(!s.isEmpty()) {
        			System.out.print(s.pop());
        		}
        		System.out.print(" ");
        	}
        }
        while(!s.isEmpty()) {
        	System.out.print(s.pop());
        }
    }
}