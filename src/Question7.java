import java.lang.reflect.Array;
import java.util.HashSet;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(0);
		hset.add(1);
		hset.add(2);
		hset.add(10);
		hset.add(4);
		hset.add(5);
		
		System.out.println(hset);
		
		System.out.println("Converting to array");
		
		Object[] array = hset.toArray();
		
		for (Object s: array) {
			System.out.println(s);
		}
	}

}
