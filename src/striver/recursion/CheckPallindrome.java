package striver.recursion;

public class CheckPallindrome {
	
	static boolean check(String st,int s,int e) {
		
		if(s==e) return true;
		
		if(st.charAt(s)!=st.charAt(e)) return false;
		if(s<e) {
			return check(st,s+1,e-1);
		}
		return true;
		
	}

	public static void main(String[] args) {
		String st="abeba";
		System.out.println(check(st,0,st.length()-1));
	}

}
