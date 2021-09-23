package binarySearchTree;

public class Insertion {
	
	public Node insertNode(Node root,int data)
	{
		
		if(root==null) {
			System.out.println("root null"+data);
			root=new Node(data);
		return root;
		}
		if(root.key>=data)
		{
			System.out.println("left"+root.key);
			root.left=insertNode(root.left,data);
		}
		else if(root.key<data)
		{
			System.out.println("right"+root.key);
			
			root.right=insertNode(root.right,data);
		}
		
		return root;
		
	}

}
