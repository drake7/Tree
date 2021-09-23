package binarySearchTree;

public class Insertion {
	
	public void insertNode(Node root,int data)
	{
		
		if(root==null) {
			root=new Node(data);
		return;
		}
		if(root.key>=data)
		{
			System.out.println("left"+root.key);
			insertNode(root.left,data);
		}
		else if(root.key<data)
		{
			System.out.println("right"+root.key);
			
			insertNode(root.right,data);
		}
		
		return;
		
	}

}
