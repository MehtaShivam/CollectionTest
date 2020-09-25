import java.util.HashMap;
import java.util.TreeMap;

public class Question2 {
	public static void main(String[] args) {
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	hmap.put("Test1", 0);
	hmap.put("Test2", 1);
	hmap.put("Test3", 2);
	hmap.put("Test4", 2);
	hmap.put("Test5", 3);
	hmap.put("Test6", 4);
	
	hmap.forEach((key, value) -> System.out.println(key + ": " + value));
	
	System.out.println("Convert to treemap and sort by keys");
	
	TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
	tmap.putAll(hmap);
	
	tmap.forEach((key, value) -> System.out.println(key + ": " + value));
	
	}
	
}
