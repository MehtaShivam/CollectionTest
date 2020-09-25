import java.util.ArrayList;
import java.util.Collections;


//Comparable compares an objects attribute with the this keyword with one compareTo method
//Comparator can compare two objects attributes against each other with multiple comparing algorithms

public class Question16 implements Comparable<ArrayList<Integer>> {
	int number;
	
	@Override
	public int compareTo(ArrayList<Integer> aList) {
		// TODO Auto-generated method stub
		return this.number - aList.get(0);
	}
}

class MainQuestion16ComparableExample{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(12); 
		list.add(31); 
		list.add(0); 
		list.add(22); 
		list.add(55);

		Collections.sort(list); 
		
		System.out.println(list);
		
		for(int n: list) {
			System.out.println(n);
		}
	}
}
