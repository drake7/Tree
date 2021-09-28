package binarySearchTree;

public class NodeWithMinValue {
	
	public int minNode(Node root)
	{
		if(root==null)
			return -1;
		
		Node temp=new Node(0); 
		
		while(root.left!=null)
		{
			root=root.left;
		}
		
		
	return root.key;	
	}
	
	
	public boolean isBST(Node root)
	{
		if(root == null)
			return true;
		
		if(root.left!=null && root.left.key>root.key)
			return false;
		
		if(root.right!=null && root.right.key<root.key)
			return false;
		
		if (!isBST(root.left) || !isBST(root.right))
	        return false;
	     
		return true;
		
	}

}
