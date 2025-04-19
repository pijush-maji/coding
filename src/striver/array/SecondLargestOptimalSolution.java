package striver.array;

public class SecondLargestOptimalSolution {
	
	static int secondLargest(int[] arr) {
		
		int largest=Integer.MIN_VALUE,secLargest=Integer.MIN_VALUE;
		for(Integer i:arr) {
			if(i>largest) {
				secLargest=largest;
				largest=i;				
			}
			else if(i>secLargest && i!=largest) {
				secLargest=i;
			}
		}
		return secLargest;
	}

	public static void main(String[] args) {
		int[] arr = {10,2,5,2};
		System.out.println(secondLargest(arr));
	}
	
}
