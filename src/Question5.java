import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(0);
		aList.add(12);
		aList.add(1);
		aList.add(7);
		aList.add(11);
		
		for (int m: aList) {
			System.out.println(m);
		}
		
		System.out.println("Removing 12 from the list");
		
		aList.remove(1);
		
		for (int n: aList) {
			System.out.println(n);
		}
	}

}
