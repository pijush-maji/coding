package striver.recursion;

public class MyPow {
	
	//x^n
	/*
	 * public static double pow(int x,int n) { double ans=1.0; long nn = n; //for
	 * x^-n if(n<0) nn = nn*(-1); while(nn>0) { if(nn%2==0) { x=x*x; nn=nn/2; }else
	 * { ans=ans*x; nn=nn-1; } } if(n<0) return (double)1.0/ans; return ans; }
	 */
	
	public static double pow(double x, long n) {
		if(n==1)
			return x;
		if(n%2==0) {
			return pow(x*x,n/2);
		}
		return x*pow(x,n-1);
	}

	public static void main(String[] args) {
		int x = 2;
		int n = -2147483648;
		
		
        long t=n;
        if(n<0) {
        	t = t*(-1);
        }
        double ans = pow(x,t);
		System.out.println(1.0/ans);
	}

}
