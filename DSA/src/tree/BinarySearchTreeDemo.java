package tree;

public class BinarySearchTreeDemo {
	
	public Node insert(Node root,int data) {
		if(root==null) {
			return new Node(data);
		}
		if(data>root.data) {
			root.left=insert(root.left, data);
		}
		else if(data<root.data) {
			root.right=insert(root.right, data);
		}
		return root;
		
	}
	
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data+ " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
	
		BinarySearchTreeDemo tree=new BinarySearchTreeDemo();
		Node root=null;
		root=tree.insert(root, 50);
		root=tree.insert(root, 10);
		root=tree.insert(root, 20);
		root=tree.insert(root, 5);
		root=tree.insert(root, 55);
		root=tree.insert(root, 60);
		root=tree.insert(root, 65);
		
		tree.inorder(root);
		
		
	}

}
