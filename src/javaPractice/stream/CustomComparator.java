package javaPractice.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomComparator {

	public static void main(String[] args) {
		
		List < Product > productsList = new ArrayList < Product > ();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 29000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        
        Comparator<Product> cmp = Comparator.comparing(
        		Product::getPrice,(p1,p2)-> p1>p2 ? 1 : -1
        		);
        
        Comparator<Product> cm1=Comparator.comparing(
        		Product::getName,(p1,p2)-> p2.compareTo(p1)
        		);
		
//		List<Product> prd = productsList.stream()
//    	.sorted((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
//		.collect(Collectors.toList());
        
        
		List<Product> prd = productsList.stream()
				.sorted(cm1)
				.collect(Collectors.toList());
		
		
    	prd.forEach(p->System.out.println(p.getName()+"-"+p.getPrice()));
	}

}
