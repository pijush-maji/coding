package CodePractice;

import striver.linkedlist.Node;

public class NodeTest {
	
	
	public static Node addFirst(Node head, int data) {
		Node temp = new Node(data);
		if(head==null) {
			head=temp;
		}else{
			temp.next=head;
			head=temp;
		}
		return head;
	}
	
	public static void displayNode(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		
		Node head=null;
		head=addFirst(null,3);
		head=addFirst(head,2);
		head=addFirst(head,1);
		displayNode(head);

	}

}
