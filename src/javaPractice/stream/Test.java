package javaPractice.stream;

import java.util.HashSet;
import java.util.List;

public class Test {
	
	public static String destCity(List<List<String>> paths) {
		HashSet<String> dest = new HashSet<>();
		paths.forEach(n->dest.add(n.get(0)));
		for(List<String> path:paths) {
			if(!dest.contains(path.get(1)))
				return path.get(1);
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
