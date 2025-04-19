package striver.linkedlist;

public class FindMiddleofLL {
	
	public static Node getMiddle(Node head) {
		if(head==null || head.next==null || head.next.next==null)
				return head;
		Node p = head;
		Node q = head;
		
		while(p!=null && p.next!=null) {
			p=p.next.next;
			q=q.next;
		}
		return q;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node t = head;
		t.next=new Node(2);
		t=t.next;
		t.next=new Node(3);
		t=t.next;
		t.next=new Node(4);
		t=t.next;
		t.next=new Node(5);
		t=t.next;
		t.next=new Node(6);
		//t=t.next;
		
		System.out.println(getMiddle(head).data);
	}
}
