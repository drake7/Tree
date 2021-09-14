package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	void printLevelOrder(Node root)
	{
		//create one queue1
		Queue<Node> queue1=new LinkedList<Node>();
		//enqueue root in the queue1
		queue1.add(root);
		//unless queue1 is empty
		while(!queue1.isEmpty())
		{
			//keep the head of the queue in temporary node 
			Node tempHead=queue1.poll();
			//print head
			System.out.println(tempHead.data + " ");
			
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
	
	
	 boolean SearchNode(Node root,int value)
	{
		if (root==null)
		{
			return false;
		}
		
		Queue<Node> queue1=new LinkedList<Node>();
		//enqueue root in the queue1
		queue1.add(root);
		//unless queue1 is empty
		while(!queue1.isEmpty())
		{
			//keep the head of the queue in temporary node 
			Node tempHead=queue1.poll();
			//print head
			if(tempHead.data==value)
				return true;
			
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
		return false;
	}
	 

}
