package nagarroPractice;

import java.util.ArrayList;
import java.util.List;

public class StudentReport {
    static int[] fun(int n,int m, int[][] score){
        int minSum=Integer.MAX_VALUE,inx=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=score[j][i];
            }
            if(minSum>sum){
                minSum=sum;
                inx=i;
            }
        }
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(j==inx)
                    continue;
                sum+=score[i][j];
            }
            res[i]=sum;
        }
        return res;
    }
    public static void main(String[] args) {
        fun(3,5,new int[][]{
                {75,76,65,87,87},
                {78,76,68,56,89},
                {67,87,78,77,65}
        });
    }
}
