package striver.greedy;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> res = new ArrayList<>();
        int s = newInterval[0];
        int e = newInterval[1];
        int i = 0, n = intervals.length;
        while (i < n && s > intervals[i][1]) {
            List<Integer> list = new ArrayList<>();
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
            res.add(list);
            i++;
        }

        while (i < n && e >= intervals[i][0]) {
            s = Math.min(s, intervals[i][0]);
            e = Math.max(e, intervals[i][1]);
            i++;
        }
        List<Integer> list = new ArrayList<>();
        list.add(s);
        list.add(e);
        res.add(list);
        while (i < n) {
            list = new ArrayList<>();
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
            res.add(list);
            i++;
        }
        return res.stream().map(u -> u.stream().mapToInt(t -> t).toArray()).toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        };
        int[][] insert = insert(intervals, new int[]{4, 8});
        int i=0;
    }
}
