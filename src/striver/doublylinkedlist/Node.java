package striver.doublylinkedlist;

public class Node {

	int data;
	Node prev;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	//Returns the last node so that no need to run a loop to 
	// add a node at the end
	public static Node createNode(Node prvNode, int data) {
		if(prvNode==null) {
			Node head = new Node(data);
			return head;
		}else {
			Node temp = new Node(data);
			prvNode.next = temp;
			temp.prev = prvNode;
			return temp;
		}
	}
}
