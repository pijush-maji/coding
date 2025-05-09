package striver.stackQueue.monotonicStack;

public class TrappingRainWater {
//It's similar to monotonic stack but stack is not required at all
    //find most greater at left and most greater at right
    //subtract height[i] from min of left[i] and right[i]
    public static int trap(int[] height) {
        int n = height.length;
        int pmg[] = new int[n];
        int nmg[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            nmg[i]=i==n-1? -1:max;
        }
        max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,height[i]);
            pmg[i] = i==0?-1:max;
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(nmg[i]!=-1 && pmg[i]!=-1){
                cnt+=Math.min(nmg[i],pmg[i])-height[i];
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(arr);
    }
}
