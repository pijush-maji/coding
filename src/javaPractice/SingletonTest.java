package javaPractice;

public class SingletonTest {

	public static void main(String[] args) {

		CustomSingleton a = CustomSingleton.getInstance();
		CustomSingleton b = CustomSingleton.getInstance();
		CustomSingleton c = CustomSingleton.getInstance();
		
		System.out.println("Hashcode of a-"+a.hashCode());
		System.out.println("Hashcode of b-"+b.hashCode());
		System.out.println("Hashcode of c-"+c.hashCode());
		
		if(a==b && b==c)
			System.out.println("a,b & c are pointing the same instance");
		else
			System.out.println("They are different instances");
	}

}
