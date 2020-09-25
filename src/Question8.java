import java.util.ArrayList;
import java.util.Collections;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(0);
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		Collections.reverse(aList);
		for(int n: aList) {
			System.out.println(n);
		}
	}

}
