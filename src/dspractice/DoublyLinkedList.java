package dspractice;

import java.util.Scanner;

public class DoublyLinkedList {
	
	Node head;
	
	public static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		Scanner in = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("\n 1.Insert data\n 2.Delete data\n 3.Display data \n 4.Exit");
			int ch = in.nextInt();
			
			if(ch==1) {
				System.out.println("Enter data to insert: ");
				int data = in.nextInt();
				list = insertNode(list, data);
			}
			else if(ch == 2) {
				System.out.println("Enter data to delete");
				int data = in.nextInt();
				list = delete(list, data);
			}
			else if(ch==3) {
				display(list);
			}
			else if(ch==4) {
				break;
			}
		}
		
	}

	private static void display(DoublyLinkedList list) {
		// TODO Auto-generated method stub
		
		if(list.head==null) {
			System.out.println("List is empty");
		}
		else {
			Node p = list.head;
			System.out.println("List items are: ");
			while(p!=null) {
				System.out.print(p.data +" ");
				p=p.right;
			}
		}
		
	}

	private static DoublyLinkedList delete(DoublyLinkedList list, int data) {
		if(list.head==null) {
			System.out.println("List is empty");
		}
		else if(data == list.head.data) {
			if(list.head.right==null) {
				//if list is having only one item
				list.head=null;
			}else {
				list.head=list.head.right;
				list.head.left=null;
			}
			
		}
		else {
			Node p = list.head;
			Node q = p.right;
			while(q!=null) {
				if(q.data==data) {
					if(q.right==null) {
						//for deleting the last item
						p.right=null;
					}
					else {
						p.right=q.right;
						q.right.left=p;	
					}
					
				}
				p=q;
				q=q.right;
			}
		}
		return list;
	}

	private static DoublyLinkedList insertNode(DoublyLinkedList list, int data) {
		
		Node new_node = new Node(data);
		if(list.head==null) {
			list.head=new_node;
		}
		else {
			Node p = list.head;
			while(p.right!=null) {
				p=p.right;
			}
			p.right=new_node;
			new_node.left=p;
		}
		return list;
	}

}
