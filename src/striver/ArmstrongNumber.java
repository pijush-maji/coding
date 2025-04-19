package striver;

public class ArmstrongNumber {
	
	static void check(int n) {
		if(n<10) System.out.println(true);
		else {
			int d=n,r,cnt=0;
			while(d>0) {
				cnt++;
				d/=10;
			}
			int num=0;
			d=n;
			while(d>0) {
				r=d%10;
				num+=(int) Math.pow(r, cnt);
				d/=10;
			}
			if(num==n) System.out.println(true);
			else System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		check(155);
	}

}
