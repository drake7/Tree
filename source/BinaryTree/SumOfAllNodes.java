package BinaryTree;

public class SumOfAllNodes {
	
	int sum=0;
	public int sumOfBinaryTree(Node root)
	{
		if (root==null)
			return sum;
		
		sumOfBinaryTree(root.left);
		sumOfBinaryTree(root.right);
		sum=sum+root.data;
		
		return sum; 
	}

}
