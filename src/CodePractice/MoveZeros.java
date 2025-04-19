package CodePractice;

public class MoveZeros {
	
	public static int[] moveZeros(int[] arr) {
		int i=0;
		
		for(Integer a:arr) {
			if(a!=0) {
				arr[i]=a;
				i++;
			}
		}
		while(i<arr.length) {
			arr[i]=0;
			i++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,34};
		int [] res = moveZeros(arr);
		
		for(Integer i: res) {
			System.out.println(i);
		}
	}

}
