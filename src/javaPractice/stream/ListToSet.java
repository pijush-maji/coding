package javaPractice.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {
		 List < Product > productsList = new ArrayList < Product > ();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 29000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        
        Set<String> products = productsList.stream()
        		.filter(p-> p.getPrice()>=29000f)
        		.map(p->p.getName())
        		.collect(Collectors.toSet());
        products.forEach(System.out::println);
        
	}

}
