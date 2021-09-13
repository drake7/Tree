package BinaryTree;

public class HeightOfBinaryTree {
	
	int levelOfTree=0;
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
	
	public void printElemenetAtGivenLevel(Node root,int level)
	{
		if (root==null)
			return;
	
		if (level==1)
		{
			System.out.println(root.data+" ");
		return;
		}
		printElemenetAtGivenLevel(root.left,level-1);
		printElemenetAtGivenLevel(root.right,level-1);
		
		
		
	}

}
