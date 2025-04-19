package striver.linkedlist;

public class MergeTwoSortedLL {

	public static Node merge(Node headA, Node headB) {
		if (headA == null)
			return headB;
		if (headB == null)
			return headA;
		Node head = null;
		Node p = headA;
		Node q = headB;
		if (p.data < q.data) {
			head = p;
			p = p.next;
		} else {
			head = q;
			q = q.next;
		}
		Node t = head;
		while (p != null && q != null) {
			if (p.data < q.data) {
				t.next = p;
				p = p.next;
			} else {
				t.next = q;
				q = q.next;
			}
			t = t.next;
		}
		if (p != null)
			t.next = p;
		if (q != null)
			t.next = q;
		return head;
	}

	public static void printLL(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		
		Node headA = new Node(1);
		Node t = headA;
		t.next=new Node(3);
		
		Node headB=new Node(2);
		t=headB;
		t.next=new Node(8);
		t=t.next;
		t.next=new Node(100);
//		t=t.next;
//		t.next=new Node(6);
//		t=t.next;
		
		Node head = merge(headA,headB);
		printLL(head);
	}

}
