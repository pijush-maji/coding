package striver.linkedlist;

public class Node {
	
	public int data;
	public Node next;
	
	public Node() {
		this.data=0;
		this.next=null;
	}
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	//Returns the last node so that no need to run a loop to 
	// add a node at the end
	public static Node createNode(Node prvNode,int data) {
		if(prvNode==null) {
			Node head = new Node(data);
			return head;
		}else {
			Node temp = new Node(data);
			prvNode.next = temp;
			return temp;
		}
	}
	public static void printLL(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
