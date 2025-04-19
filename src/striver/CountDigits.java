package striver;

public class CountDigits {
	
	static void digitsCount(int n) {
		if(n<10) System.out.println(1);
		else {
			int cnt=1;
			int p = n/10;
			while(p>0) {
				p=p/10;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	public static void main(String[] args) {
		digitsCount(12234452);
	}

}
