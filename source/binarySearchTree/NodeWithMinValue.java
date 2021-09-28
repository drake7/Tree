package binarySearchTree;

public class NodeWithMinValue {
	
	public int minNode(Node root)
	{
		Node temp=new Node(0); 
		while(root.left!=null)
		{
			root=root.left;
		}
		
		
	return root.key;	
	}

}
