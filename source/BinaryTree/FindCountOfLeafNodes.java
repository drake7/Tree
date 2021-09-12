package BinaryTree;

public class FindCountOfLeafNodes {
	int sum=0;
	public int Count(Node root)
	{
		
	if(root==null)
		return sum;
	
	if(root.left==null && root.right==null)
		return 1;
	
	return Count(root.left)+Count(root.right);
	}
}
