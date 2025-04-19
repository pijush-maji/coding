package striver.linkedlist;

public class ReverseSinglyLL {
	
	static Node reverse(Node head) {
		Node t=head;
		Node p=t.next;
		while(p!=null) {
			Node temp=p;
			p=p.next;
			temp.next=t;
			t=temp;
		}
		head.next=null;
		return t;
	}

	public static void main(String[] args) {
		Node head=new Node(1);
		Node p =head;
		Node temp=new Node(2);
		p.next=temp;
		p=p.next;
		temp=new Node(3);
		p.next=temp;
		p=p.next;
		temp=new Node(4);
		p.next=temp;
		
		Node t=head;
		while(t!=null) {
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
		Node newHead=reverse(head);
		while(newHead!=null) {
			System.out.print(newHead.data+" ");
			newHead=newHead.next;
		}
		
	}

}
