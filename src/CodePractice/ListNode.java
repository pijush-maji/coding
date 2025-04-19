package CodePractice;

public class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1,null);
		ListNode l1 = head;
		
		l1.next=new ListNode(2,null);
		l1=l1.next;
		l1.next=new ListNode(3,null);
//		l1=l1.next;
//		l1.next=new ListNode(3,null);
		l1=l1.next;
		l1.next=new ListNode(2,null);
		l1=l1.next;
		l1.next=new ListNode(4,null);

//		ListNode res = reverse(head);

//		while (res != null) {
//			System.out.println(res.val);
//			res = res.next;
//		}
		System.out.println(isPalindrome(head));
	}

	 public static ListNode deleteDuplicates(ListNode head) {
	        ListNode p = head;
	        ListNode q = p.next;	        
	        while(q!=null) {
	        	if(p.val==q.val) {
	        		p.next=q.next;  	        	
	        	}
	        	p=p.next;
	        	if(p==null) break;
	        	q=p.next;
	        }
	        return head;
	    }
	 public static ListNode reverse(ListNode head) {
		 ListNode temp = head;
		 ListNode q = temp.next;
		 
		 while(q!=null) {
			 ListNode t = q;
			 q=q.next;
			 t.next=temp;
			 temp=t;
			 
		 }
		 head.next=null;
		 return temp;
	 }
	 
	 public static boolean isPalindrome(ListNode head) {
	        ListNode fast=head;
	        ListNode slow=head;
	        while(fast.next!=null && fast.next.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	        }
	        ListNode h = reverse(slow.next);
	        ListNode t = h;
	        ListNode s = head;
	        while(t!=null){
	            if(s.val!=t.val)
	                return false;
	            s=s.next;
	            t=t.next;
	        }
	        return true;
	       
	    }

}
