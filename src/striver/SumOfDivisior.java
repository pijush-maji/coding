package striver;

public class SumOfDivisior {

	static void sum(int n) {
		int sum1 = 1;
		for (int k = 2; k <= n; k++) {
			int i = 1, j = k,sum=0;
			while (i < j) {
				if (k % i == 0) {
					if(i!=k/i) {
						sum += i;
						sum += k / i;
					}
					else {
						sum+=i;
					}
					
					j = k / i;
				}
				i++;
			}
			//System.out.println(sum);
			sum1+=sum;
		}

		System.out.println(sum1);
	}

	public static void main(String[] args) {
		sum(5);
	}

}
