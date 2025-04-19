package dspractice;

import java.util.Scanner;

public class LinkedListTest {
	
	Node head;
	
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static LinkedListTest insertNode(LinkedListTest list, int data) {
		Node new_node = new Node(data);
		
		if(list.head==null) {
			list.head=new_node;
		}
		else {
			Node ptr = list.head;
			
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			ptr.next=new_node;
		}
		return list;
	}
	
	public static LinkedListTest delete(LinkedListTest list, int data) {
		if(list.head==null) {
			System.out.println("List is empty");
		}
		else if(list.head.data==data) {
			list.head=list.head.next;
		}
		else {
			Node ptr = list.head;
			Node q = ptr.next;
			while(q!=null) {
				if(q.data==data) {
					ptr.next=q.next;
					break;
				}
				ptr=q;
				q=q.next;
			}
		}
		return list;
	}
	
	public static void display(LinkedListTest list) {
		if(list.head==null) {
			System.out.println("List is empty!!");
		}
		else {
			Node ptr = list.head;
			System.out.println("List items are - ");
			while(ptr!=null) {
				System.out.print(ptr.data +" ");
				ptr=ptr.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListTest list = new LinkedListTest();
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
	
}
