package algorithms;

import java.util.Scanner;
import algorithms.LinkedListNode;

public class LinkedListDuplicates {

	//Remove duplicates from list
	
	public static LinkedListNode removeDuplicates(LinkedListNode head) {
	      //Write your code here
	        
	 	LinkedListNode start = head;
	        
	        while(start!=null){
	            
	         if(start.next!=null){
	             //System.out.println(start.data);
	             //System.out.println(start.next.data);
	             while(start.data==start.next.data){
	                // System.out.println("Duplicates!");
	                 if(start.next.next!=null){
	                 start.next = start.next.next;
	                // System.out.println(start.next.data);
	                 }else{
	                 start.next = null;
	                // System.out.println(start.next);
	                 break;
	                 }
	             }
	             }
	             start = start.next;
	             //System.out.println(start);
	            
	          }
	        return head;
	       }
	  
	//Create linkedlist     
	public static  LinkedListNode insert(LinkedListNode head,int data)
	    {
		LinkedListNode p=new LinkedListNode(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	        	LinkedListNode start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	  
	//display linkedlist  
    public static void display(LinkedListNode head)
	        {
            	LinkedListNode start=head;
	              while(start!=null)
	              {
	                  System.out.print(start.data+" ");
	                  start=start.next;
	              }
	        }
	    
	  //main method 
	 public static void main(String args[])
	        {
	              Scanner sc=new Scanner(System.in);
	              LinkedListNode head=null;
	              int T=sc.nextInt();
	              while(T-->0){
	                  int ele=sc.nextInt();
	                  head=insert(head,ele);
	              }
	              head=removeDuplicates(head);
	              display(head);

	       }
	    }      
	    
