package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {

	public void insert(Node root,int data)
	{
		if (root==null)
			{root=new Node();
			root.data=data;
			
			return;
			}
		
		Queue<Node> queue1=new LinkedList<Node>();
		queue1.add(root);
		
		while(!queue1.isEmpty())
		{
			
			//keep the head of the queue in temporary node 
			Node tempHead=queue1.poll();
			//print head
			if(tempHead.left==null)
			{
				tempHead.left=new Node();
				tempHead.left.data=data;
				return;
			}
			if(tempHead.right==null)
			{
				tempHead.right=new Node();
				tempHead.right.data=data;
				return;
			}
			 //equeue the child of the temphead 
			 if(tempHead.left != null)
			 {
				 queue1.add(tempHead.left);
			 }
			 if(tempHead.right!=null)
			 {
				 queue1.add(tempHead.right);
			 }
		
		}
			
			
		
	}
}
