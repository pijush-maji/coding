package javaPractice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapUsingStream {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Pijush","BTech");
		Employee e2 = new Employee(2,"Anu","MSC");
		Employee e3 = new Employee(3,"Subhadip","BSC");
		Employee e4 = new Employee(4,"Samadrita","BTech");
		Employee e5 = new Employee(5,"Suraj","HS");
		
		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
//		emps.stream().filter(e->e.getName().startsWith("S"))
//			.forEach(e->System.out.println(e.getName()));
		
		Map<Integer, Employee> map = emps.stream().collect(Collectors.toMap(e->e.getId(), e->e));
		map.forEach((t, u) ->System.out.println(t+"-"+u.getName()) );
	}

}
