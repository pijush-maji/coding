package striver.recursion;

public class PrintNTimes {
	
	static void fun(int n) {
		if(n==1) {
			System.out.print("Pijush ");
			return;
		}
		System.out.print("Pijush ");
		fun(n-1);
	}

	public static void main(String[] args) {
		fun(15);
	}
}
