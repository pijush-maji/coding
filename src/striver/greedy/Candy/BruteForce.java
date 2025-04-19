package striver.greedy.Candy;

public class BruteForce {

    //Better solution will be instead of using two array, we can use one single array to
    //reduce the space complexity and in the second iteration we'll compare and take the max value
    // and store in the left array itself like below
    // left[n-1]=Math.max(left[i],1];
    // if(ratings[i]>ratings[i+1])
    //      temp =left[i+1]+1
    // else
    //      temp=1;
    // left[i] = Math.max(left[i],temp);
    public static int findMinCandy(int[] ratings){
        int n = ratings.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1])
                left[i]=left[i-1]+1;
            else
                left[i]=1;
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                right[i]=right[i+1]+1;
            else
                right[i]=1;
        }
        int ans=0;
        for(int i=0;i<n;i++)
            ans+=Math.max(left[i],right[i]);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findMinCandy(new int[]{0,2,4,3,2,1,1,3,5,6,4,0,0}));
    }
}
