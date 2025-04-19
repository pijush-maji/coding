package striver.linkedlist;

public class ReverseInGroupOfK {
	
	public static Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
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
    public static Node reverseKGroup(Node head, int k) {
        if(head==null || head.next==null || k==1){
            return head;
        }
        Node h = null;
        int cnt=0;
        Node l = head;
        Node r = head;
        Node ph = null;
        while(r!=null){
            if(cnt==k-1){
                if(h==null){
                    h=r;
                }
                Node temp=r.next;
                r.next=null;
                Node tt=reverse(l);
                if(ph==null)
                    ph=l;
                else{
                    ph.next=tt;
                    ph=l;
                }
                cnt=0;
                l=temp;
                r=l;
            }else{
                r=r.next;
                cnt++;
            }
        }
        Node temp = ph;
        while(l!=r) {
        	temp.next=l;
        	temp=temp.next;
        	l=l.next;
        }
        return h;
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
		p=p.next;
		p.next = new Node(5);
		
		Node hh = reverseKGroup(head,3);
		Node.printLL(hh);
	}

}
