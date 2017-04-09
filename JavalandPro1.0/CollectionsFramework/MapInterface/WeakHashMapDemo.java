package MapInterface;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		Map<User,String> map = new WeakHashMap<>();
		User u1 = new User();
		map.put(u1, "ramesh");
		System.out.println(map);
		
		u1 = null;
		
		// WeakHashMap calls garbage collector
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(map);
	}

}
