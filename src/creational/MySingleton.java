package creational;

public class MySingleton {
	private static volatile MySingleton instance;
	
	private MySingleton() {}

	public static synchronized MySingleton getInstance() {
		if(instance == null) {
			synchronized(MySingleton.class) {
				if(instance == null) {
					instance = new MySingleton();
				}
			}
		}
		return instance;
	}
}
//how could we fix problems around double-checked locking