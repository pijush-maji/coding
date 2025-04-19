package striver.greedy;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
public class NMeetinInOneRoom {
    @lombok.Data
    @AllArgsConstructor
    class Data {
        int start;
        int end;
        int position;
    }
    List<Integer> fun(int[] start, int[] end){
        List<Data> datas = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            datas.add(new Data(start[i],end[i],i));
        }
        datas.sort(Comparator.comparing(Data::getEnd));
        List<Integer> res = new ArrayList<>();
        res.add(datas.get(0).getPosition());
        int inx = datas.get(0).getEnd();//to store last end index
        for(int i=1;i<datas.size();i++){
            if(datas.get(i).getStart()>inx){
                res.add(datas.get(i).getPosition());
                inx= datas.get(i).getEnd();
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        NMeetinInOneRoom obj = new NMeetinInOneRoom();
        obj.fun(new int[]{1, 2},new int[]{100, 99})
                .forEach(System.out::println);
    }
}
