package tree;

class Node{
	 int data;
	 Node right,left;
	 
	 public Node(int data) {
		 this.data=data;
	     left=right=null;	 
	 }
}
public class BinaryTreeDemo {
	
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder( root.right);
	}

	public static void main(String[] args) {
		
		Node root=new Node(5);
		root.left=new Node(10);
		root.right=new Node(20);
		root.left.left=new Node(1);
		root.left.right =new Node(2);
		root.right.left=new Node(3);
		root.right.right =new Node(4);
		
		System.out.println("Inorder Tree :");
		inorder(root);

	}

}
