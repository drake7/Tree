package BinaryTree;

public class DifferenceBetweenEvenOddLevel {
	
	int nodeCount=0;
public int differenceBetweenOddEven(Node root)
{
	if(root==null)
		return 0;
	
	return root.data - differenceBetweenOddEven(root.left)-differenceBetweenOddEven(root.right);
}

public int nodesCount(Node root)
{

	if (root==null)
		return 0;
	
	
	nodesCount(root.left);
	nodesCount(root.right);
	nodeCount=nodeCount+1;
	
	return nodeCount;
}
}
