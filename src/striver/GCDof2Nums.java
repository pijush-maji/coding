package striver;

public class GCDof2Nums {
	
	static int gcd(int a,int b) {
		if(a==0) return b;
		else if(a<b) return gcd(b%a,a);
		else return gcd(a%b,b);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(16,24));
	}
}
