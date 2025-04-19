package striver.array;

public class RotateArrayBruteForce {
    //[1,2,3,4,5,6,7], k = 3
    //[5,6,7,1,2,3,4]
    static int[] rotateArray(int[] arr,int k){
        if(k==0)
            return arr;
        int[] temp = new int[k];
        int n = arr.length;
        for(int i=n-k;i<n;i++){
            temp[i-n+k] = arr[i];
        }
        int j =0;
        for(int i=n-k-1;i>=0;i--){
            arr[n-1-j] = arr[i];
            j++;
        }
        for(int i=0;i< temp.length;i++){
            arr[i]=temp[i];
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println(rotateArray(new int[]{1,2,3,4,5,6,7},3).toString());
    }
}
