package striver.recursion;

public class ReverseAnArrayRecursion {
	
	static int[] reverse(int[] arr, int i,int j) {
		if(i>=j) {
			return arr;
		}
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return reverse(arr,i+1,j-1);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int[] reverse = reverse(arr,0,arr.length-1);
		for (int i : reverse) {
			System.out.println(i);
		}
	}

}
