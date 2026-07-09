package tree;

public class PreOrdered {
	
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data + " ");
		preorder(root.left);
		preorder( root.right);
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
		preorder(root);

	}

}
