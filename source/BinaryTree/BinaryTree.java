package BinaryTree;

class Node{
	
	int data;
	Node left,right;
	
}
public class BinaryTree {
public Node createNewNode(int data)
{
	
	Node a=new Node();
	a.data=data;
	a.left=null;
	a.right=null;
	
	return a;
}
}
