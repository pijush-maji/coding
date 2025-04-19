package striver.linkedlist;

public class Sort012 {

	public static Node sortList(Node head) {
		// Write your code here
		Node zh = null, oh = null, th = null;
		Node z = null, o = null, t = null;
		while (head != null) {
			if (head.data == 0) {
				if (zh == null) {
					zh = head;
					z = head;
				} else {
					z.next = head;
					z=z.next;
				}
			} else if (head.data == 1) {
				if (oh == null) {
					oh = head;
					o = head;
				} else {
					o.next = head;
					o=o.next;
				}
			} else {
				if (th == null) {
					th = head;
					t = head;
				} else {
					t.next = head;
					t=t.next;
				}
			}
			head = head.next;
		}
		z.next = oh;
		o.next = th;
		t.next = null;
		return zh;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node t = head;
		t.next=new Node(0);
		t=t.next;
		t.next=new Node(2);
		t=t.next;
		t.next=new Node(1);
		t=t.next;
		t.next=new Node(0);
		t=t.next;
		t.next=new Node(2);
		t=t.next;
		t.next = new Node(1);
		
		MergeTwoSortedLL.printLL(sortList(head));
	

	}

}
