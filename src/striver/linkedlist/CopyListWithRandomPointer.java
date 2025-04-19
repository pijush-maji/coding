package striver.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

	private class Node {
		int val;
		Node next;
		Node random;

		Node(int val) {
			this.val = val;
		}
	}

	public Node copyRandomList(Node head) {
		Node temp = head;
		Node nh = new Node(0);
		Node nt = nh;
		Map<Integer, Node> map = new HashMap<>();
		while (temp != null) {
			Node t = new Node(temp.val);
			t.next = temp.next;
			nt.next = t;
			if (temp.random == null) {
				map.put(nt.val, null);
			} else {
				map.put(nt.val, nt);
			}
			nt = nt.next;
			temp = temp.next;
		}
		temp = nh.next;

		while (temp != null) {
			temp.random = map.get(temp.val);
			temp = temp.next;
		}
		return nh.next;

	}

	public static void main(String[] args) {
//		Node head = new Node(7);
//		head.random=null;
//		Node t = new Node(13);
//		head.next =t;

	}

}
