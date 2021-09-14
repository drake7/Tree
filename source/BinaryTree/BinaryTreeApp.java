package BinaryTree;
public class BinaryTreeApp {
	public static void main(String...s)
	{
		
		BinaryTree t=new BinaryTree();
		SumOfAllNodes sum=new SumOfAllNodes();
		
		Node root=t.createNewNode(5);
		root.left=t.createNewNode(7);
		root.left.left=t.createNewNode(51);
		root.right=t.createNewNode(11);
		root.left.right=t.createNewNode(25);	
		
	//	Traversal traverse=new Traversal();
	//	FindCountOfLeafNodes fcl=new FindCountOfLeafNodes();
	//	DifferenceBetweenEvenOddLevel diff=new DifferenceBetweenEvenOddLevel();
	//	HeightOfBinaryTree height=new HeightOfBinaryTree();
		
		BreadthFirstSearch bfs=new BreadthFirstSearch();
	//	traverse.inorder(root);
		
		
		
	//	traverse.preorder(root);
		
	//	traverse.postorder(root);
		
	//	System.out.println(sum.sumOfBinaryTree(root));
		
	//	System.out.println(diff.differenceBetweenOddEven(root));
	//	System.out.println(diff.nodesCount(root));
	//	System.out.println(fcl.Count(root) );
		
		
	//	System.out.println(height.height(root));
		
	//	height.printElemenetAtGivenLevel(root, 2);
	//	bfs.printLevelOrder(root);
		System.out.println(bfs.SearchNode(root, 5131));
	}

}
