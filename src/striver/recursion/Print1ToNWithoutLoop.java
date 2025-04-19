package striver.recursion;

public class Print1ToNWithoutLoop {
	static void fun(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	
	public static void main(String[] args) {
		int n=15;
		fun(n);
		
	}

}
