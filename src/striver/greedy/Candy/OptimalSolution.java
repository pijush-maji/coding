package striver.greedy.Candy;


//Solved using slope concept
public class OptimalSolution {
    public static int findMinCandy(int[] ratings){
        int sum=1;
        int i=1,n=ratings.length;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum+=1;
                i++;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak++;
                sum+=peak;
                i++;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum+=down;
                down++;
                i++;
            }
            if(down>peak)
                sum+=(down-peak);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(findMinCandy(new int[]{0,2,4,3,2,1,1,3,5,6,4,0,0}));
    }
}
