package algorithms;
//Also called levelOrder binary tree search

import java.io.*;
import java.util.*;
import algorithms.BinaryTreeNode;


public class BreadthFirstSearch {
	
	static void levelOrder(BinaryTreeNode root){
	    
	     List<BinaryTreeNode> myList = new <BinaryTreeNode>LinkedList();
	     List<Integer> myDataList = new <Integer>LinkedList();	
	    
	       if(root!=null){
	            myList.add(root);
	        }
	    
	       for(int i=0;i<myList.size();i++){
	                 BinaryTreeNode node = myList.get(i);
	                 myDataList.add(node.data);
	                 if(node.left!=null){
	                    myList.add(node.left);
	                  }
	                 if(node.right!=null){
	                    myList.add(node.right);
	                  }
	        }
	           
	      //     System.out.println(node.data);
	      for(int i=0;i<myDataList.size();i++){
	            System.out.print(myDataList.get(i) + " ");
	      }
	                       
	}
	
	//Create a Binary Search Tree
	                       
	public static BinaryTreeNode insert(BinaryTreeNode root,int data){
        if(root==null){
            return new BinaryTreeNode(data);
        }
        else{
            BinaryTreeNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	// Verify the BreadthFirstSearch alogorithm
	
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            BinaryTreeNode root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

	

