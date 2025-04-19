package CodePractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OddEvenSortedList {
	
	static List<Integer> fun(List<Integer> list){
		
		Comparator<Integer> cmp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer a, Integer b) {
				if(a%2==1 && b%2==0)
					return 1;
				else if(a%2==0 && b%2==0 && a>b)
					return 1;
				else if(a%2==1 && b%2==1 && a<b)
					return 1;
				return -1;
			}
		};
		
		Collections.sort(list,cmp);
		list.forEach(System.out::println);
		
		return null;
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,5,2,10,9,6,11,8);
		fun(list);
	}

}
