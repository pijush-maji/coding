package javaPractice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreams {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,2,9,13,5);
		
		//map
		//1.Returns a stream
		list.stream()
			.map(n->n*n)
			.forEach(n->System.out.println(n));
		
		//2.Stream is collected as List
		List<Integer> data = list.stream()
			.map(n->n*n)
			.collect(Collectors.toList());
		data.forEach(n->System.out.println(n));
		
		//Filter
		list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		
	}

}
