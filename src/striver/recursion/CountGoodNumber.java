package striver.recursion;

public class CountGoodNumber {
	
	static int mod = 1000000007;
	public static long pow(long x, long n){
        if(n==1)
            return x;
        if(n%2==0){
            return pow((x*x)%mod,n/2)%mod;
        }else{
            return x*pow(x,n-1)%mod;
        }
    }
    public static long count(long n){
    	if(n==1)
    		return 5;
    	long odd = n/2;
        long even = n/2 + n%2;
        
        return (int)(pow(5,even)*pow(4,odd)%mod);
    }

	public static void main(String[] args) {
		System.out.println(count(70)%mod);
	}

}
