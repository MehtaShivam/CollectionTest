import java.util.HashMap;

public class Question1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Test1", 0);
		hmap.put("Test2", 1);
		hmap.put("Test3", 2);
		hmap.put("Test4", 2);
		hmap.put("Test5", 3);
		hmap.put("Test6", 4);
				
		hmap.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
