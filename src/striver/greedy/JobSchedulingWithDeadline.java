package striver.greedy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSchedulingWithDeadline {
    @Data
    @AllArgsConstructor
    class Job{
        int id;
        int deadline;
        int profit;
    }

    public List<Integer> findProfit(int id[], int deadline[], int profit[]){
        List<Job> jobs = new ArrayList<>();
        int maxDeadline = 0;
        for(int i=0;i<id.length;i++){
            jobs.add(new Job(id[i],deadline[i],profit[i]));
            maxDeadline = Math.max(maxDeadline,deadline[i]);
        }
        int deadlines[] = new int[maxDeadline];
        //putting -1 initially for all the elements
        for(int i=0;i<maxDeadline;i++)
            deadlines[i]=-1;
        jobs.sort(Comparator.comparing(Job::getProfit));
        Collections.reverse(jobs);
        int cnt = 0, maxProfit = 0;
        for(Job j:jobs){
            for(int i=j.getDeadline()-1;i>=0;i--){
                if(deadlines[i]==-1){
                    deadlines[i]=j.getId();
                    cnt++;
                    maxProfit+=j.getProfit();
                    break;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(cnt);
        res.add(maxProfit);
        return res;
    }

    public static void main(String[] args) {
        JobSchedulingWithDeadline obj = new JobSchedulingWithDeadline();
        System.out.println(obj.findProfit(new int[]{1,2,3,4},new int[]{4,1,1,1},new int[]{20,1,40,30}));
    }
}
