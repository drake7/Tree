package BinaryTree;

public class Traversal {
	
	public void inorder(Node node)
	{
		
		if(node==null)
			return;
		
		inorder(node.left);
		System.out.println(node.data+" ");
		inorder(node.right);
	}

	
	public void preorder(Node node) {
		if(node==null)
		return;
		
		System.out.println(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}
	
	
	
	public void postorder(Node node) {
		if(node==null)
		return;
		
		
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data + " ");
	}
	
	
}
