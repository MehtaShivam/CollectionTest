import java.util.ArrayList;
import java.util.LinkedList;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(0);
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(5);
		
		ArrayList<Integer> aList =new ArrayList<Integer>(llist);
		
		System.out.println(aList);
		
	}

}
