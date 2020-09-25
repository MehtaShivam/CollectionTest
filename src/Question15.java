import java.util.Deque;
import java.util.LinkedList;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.add(0);
		dq.addLast(55);
		dq.addFirst(12);
		dq.add(19);
		
		for(int n: dq) {
			System.out.println(n);
		}
		
		System.out.println("After removing: ");
		
		dq.removeFirst();
		dq.removeLast();
		
		for(int m: dq) {
			System.out.println(m);
		}
		
	}

}
