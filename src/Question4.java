import java.util.ArrayList;

public class Question4 {

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
		
		System.out.println("Adding 15 at index 3");
		
		aList.add(2, 15);
		
		for (int n: aList) {
			System.out.println(n);
		}
	}

}
