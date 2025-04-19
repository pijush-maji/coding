package dspractice;

public class FindMiddleInLinkedListInOnePass {
	
	Node head;
	
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static FindMiddleInLinkedListInOnePass insert(
			FindMiddleInLinkedListInOnePass list,int data) {
		Node ptr = list.head;
		Node node = new Node(data);
		while(ptr.next!=null) {
			ptr=ptr.next;
		}
		ptr.next=node;
		return list;
	}
	
	public static int findMiddle(FindMiddleInLinkedListInOnePass list) {
		
		
		Node p = list.head;
		Node middle = list.head;
		int length =0;
		while(p.next!=null) {
			length++;
			if(length%2==0) {
				middle=middle.next;
			}
			p=p.next;
		}
		if(length%2==1) {
			middle=middle.next;
		}
		return middle.data;
	}
	
	public static void main(String[] args) {
		FindMiddleInLinkedListInOnePass list = new FindMiddleInLinkedListInOnePass();
		list.head=new Node(1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,40);
		list = insert(list,5);
//		list = insert(list,-9);
		
		System.out.println(findMiddle(list));
	}

}
