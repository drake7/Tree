package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class DeletionOfNode {
	
	public void deleteDeepest(Node root,int data)
	{
		Queue<Node> queue=new LinkedList<Node>();
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node tempHead=queue.poll();
			
			if(tempHead.data==data)
			{
				tempHead=null;
				return;
			}
			
			if(tempHead.right!=null)
			{
				if(tempHead.right.data==data)
				{
					tempHead.right=null;
					return;
				}
				else
				{
					queue.add(tempHead.right);
					
				}
			}
			 if (tempHead.left != null)
			    {
			        if (tempHead.left.data == data)
			        {
			            tempHead.left = null;
			            return;
			        }
			        else
			            queue.add(tempHead.left);
			    }
		}
		
	}
	
	
	public void Delete(Node root,int data)
	{
		if (root==null)
		{
			return;
		}
			if (root.left == null && root.right == null)
				    {
				        if (root.data == data)
				        {
				              root=null;
				              return;
				        }
				        else
				            return;
				   
				    }
		

	Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    Node temp = null, keyNode = null;
     
    // Do level order traversal until
    // we find key and last node.
    while (!q.isEmpty())
    {
        temp = q.peek();
        q.remove();
         
        if (temp.data == data)
            keyNode = temp;
 
        if (temp.left != null)
            q.add(temp.left);
 
        if (temp.right != null)
            q.add(temp.right);
    }
 
    if (keyNode != null)
    {
        int x = temp.data;
        deleteDeepest(root, temp.data);
        keyNode.data = x;
    }
	}
}
