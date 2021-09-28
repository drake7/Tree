package binarySearchTree;


class Node
{
int key;
Node left,right;

public Node(int item)
{
	
key=item;

left=right=null;
}

}
public class BinarySearchTree {
	
	static Node root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root=null;
		
	}
	
	void insert(int key)
	{
		
		root=insertRec(root,key);
	}

	
	Node insertRec(Node root,int key)
	{
		
		if (root==null)
		{
			root=new Node(key);
			return root;
		}
		
		
		if (key<=root.key)
		{
			root.left=insertRec(root.left,key);
		}
		else if (key>root.key)
		{
			root.right=insertRec(root.right,key);
		}
		
		return root;
	}
	 // This method mainly calls InorderRec()
    void inorder()
    {
         inorderRec(root);
    }
 
    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
	
	public static void main(String...s)
	{
	 BinarySearchTree tree = new BinarySearchTree();
	 
     /* Let us create following BST
           50
        /     \
       30      70
      /  \    /  \
    20   40  60   80 */
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(1);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);

     // print inorder traversal of the BST
  //   tree.inorder();
	
//	Insertion ins=new Insertion();
//	System.out.println("////");
//	ins.insertNode(tree.root, 110);
	
//	tree.inorder();
     
     NodeWithMinValue min=new NodeWithMinValue();
     System.out.println(min.minNode(root));
     System.out.println(min.isBST(root));
     
	}	
}
