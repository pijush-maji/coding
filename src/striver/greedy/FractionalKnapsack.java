package striver.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack implements Comparator<Item> {


    @Override
    public int compare(Item o1, Item o2) {
        return Double.compare(o2.getUnitValue(),o1.getUnitValue());
    }

    public static void main(String[] args) {

        List<Integer> w = List.of(20,10,50,50);
        List<Integer> val = List.of(100,60,100,200);
        int capacity = 90;
        double res = getMaxValuedItems(w,val,capacity);
        System.out.println(res);
    }

    private static double getMaxValuedItems(List<Integer> w, List<Integer> val, int capacity) {
        int n = w.size();
        List<Item> items = new ArrayList<>();
        for(int i=0;i<n;i++)
            items.add(new Item(w.get(i),val.get(i)));
        Collections.sort(items,new FractionalKnapsack());
        double totalVal=0;
        for(Item it:items){
            if(capacity==0)
                break;
            else if(capacity<it.getWeight()){
                totalVal+=capacity*it.getUnitValue();
                break;
            } else{
                totalVal+=it.getValue();
                capacity-=it.getWeight();
            }
        }
        return totalVal;
    }


}
