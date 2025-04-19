package striver.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int p = intervals[0][0];//start
        int q = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= p) {
                q = Math.max(q, intervals[i][1]);
            } else {
                list.add(new int[]{p,q});
                p = intervals[i][0];
                q = intervals[i][1];
            }
        }
        list.add(new int[]{p,q});
        int[][] res = new int[list.size()][2];
        return list.toArray(res);
    }

    public static void main(String[] args) {
        merge(new int[][]{
                {1,4},
                {4,5}
        });
    }
}
