package striver.recursion;

public class FibonacciNumber {
	
	static int fun(int n) {
		int res=0;
		if(n==0) {
			return 0;
		}
		if(n==1) return 1;
		
		res +=fun(n-1)+fun(n-2);
		return res;
	}

	public static void main(String[] args) {
		System.out.println(fun(7));
	}

}
