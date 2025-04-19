package striver.linkedlist;

public class MergeSortLL {
	
	public static Node mergeSort(Node head) {
		if(head==null || head.next==null)
			return head;
		Node l = head;
		Node m = FindMiddleofLL.getMiddle(head);
		Node r = m.next;
		m.next=null;
		l = mergeSort(l);
		r=mergeSort(r);
		return MergeTwoSortedLL.merge(l, r);
	}

	public static void main(String[] args) {
		Node head = new Node(100);
		Node t = head;
		t.next=new Node(2);
		t=t.next;
		t.next=new Node(13);
		t=t.next;
		t.next=new Node(4);
		t=t.next;
		t.next=new Node(9);
//		t=t.next;
//		t.next=new Node(6);
		Node newHead = mergeSort(head);
		
		MergeTwoSortedLL.printLL(newHead);
	}

}
