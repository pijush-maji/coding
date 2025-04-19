package javaPractice.stream;

import java.util.ArrayList;
import java.util.List;

public class TerminalStreamMethods {

	public static void main(String[] args) {
		
		List < Product > productsList = new ArrayList < Product > ();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 29000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        
        boolean anyMatch = productsList.stream()
        		.anyMatch(p->p.getName().contains("e"));
        System.out.println(anyMatch);
        
        System.out.println(productsList.stream()
        		.filter(p->p.getPrice()<30000)
        		.count());
        
        Product minProduct = productsList.stream()
        	.min((p1,p2)-> p1.getPrice()>p2.getPrice()? 1:-1).get();
        System.out.println(minProduct.toString());
        
        Float totalPrice = productsList.stream()
        		.map(p->p.getPrice())
        		.reduce((s,e)->s+e).get();
        
        System.out.println(totalPrice);
        
	}

}
