package BinaryTree;
public class BinaryTreeApp {
	public static void main(String...s)
	{
		
		BinaryTree t=new BinaryTree();
		
		Node root=t.createNewNode(5);
		root.left=t.createNewNode(7);
		root.left.left=t.createNewNode(51);
		root.right=t.createNewNode(11);
		root.left.right=t.createNewNode(25);	
		
		Traversal traverse=new Traversal();
	//	traverse.inorder(root);
		
	//	traverse.preorder(root);
		
		traverse.postorder(root);
		
	}

}
