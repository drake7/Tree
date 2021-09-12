package BinaryTree;

public class HeightOfBinaryTree {
	
	public int height(Node root)
	{
		if(root==null)
			return -1;
		
		return max(height(root.left),height(root.right))+1;
	
	}
	public int max(int first,int second)
	{
		return first>second?first:second;
	}
}
