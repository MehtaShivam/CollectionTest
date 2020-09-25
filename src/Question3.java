import java.util.ArrayList;
import java.util.Collections;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(0);
		aList.add(12);
		aList.add(1);
		aList.add(7);
		aList.add(11);
		
		for (int m : aList) {
			System.out.println(m);
		}
		
		System.out.println("After sorting");
		
		Collections.sort(aList, Collections.reverseOrder());
		for (int n : aList) {
			System.out.println(n);
		}
		
		
		int sum = 0;
		for (int i : aList) {
			sum += i;
		}
		
		System.out.println("The average is " + sum/aList.size());
	}

}
