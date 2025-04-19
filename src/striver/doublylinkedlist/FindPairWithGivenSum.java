package striver.doublylinkedlist;

import java.util.ArrayList;
import java.util.List;

public class FindPairWithGivenSum {

	//In the given problem list is sorted so we'll use
	// two pointer approach
	public static List<List<Integer>> findPairs(Node head, int k) {
		Node left = head;
		Node right = head;
		List<List<Integer>> res = new ArrayList<>();
		while(right.next!=null)
			right = right.next;
		//now right is at the end of the list
		
		while(left.data<=right.data) {
			int sum = left.data+right.data;
			if(sum==k) {
				List<Integer> list = new ArrayList<>();
				list.add(left.data);
				list.add(right.data);
				res.add(list);
				right=right.prev;
				left=left.next;
			}else if(sum>k) {
				right=right.prev;
			}else {
				left=left.next;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Node head = Node.createNode(null, 1);
		Node temp = Node.createNode(head, 2);
		temp = Node.createNode(temp, 3);
		temp = Node.createNode(temp, 4);
		temp = Node.createNode(temp, 9);
		
		System.out.println(findPairs(head,5));
	}

}
