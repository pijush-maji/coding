package javaPractice;

public class CustomSingleton {
	
	private static CustomSingleton singleton_instance=null;
	
	int a;
	
	private CustomSingleton() {
		this.a=5;
	}
	
	public static synchronized CustomSingleton getInstance() {
		if(singleton_instance==null)
				singleton_instance=new CustomSingleton();
		return singleton_instance;
	}

}
