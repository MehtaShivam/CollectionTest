import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question16pt2{
	public int id;
	public String name;
	public String department;
	
	public Question16pt2(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
		
	}
	
	
	

}

class iDCompare implements Comparator<Question16pt2>{
	@Override
	public int compare(Question16pt2 q1, Question16pt2 q2) {
		if(q1.id < q2.id) {
			return -1;
		}
		else if (q1.id > q2.id) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
class Question16ComparatorExample{
	public static void main(String[] args) {
		ArrayList<Question16pt2> list = new ArrayList<Question16pt2>(); 
		list.add(new Question16pt2(55, "Jane Doe", "Physics")); 
		list.add(new Question16pt2(22, "Adam Smith", "CS"));
		list.add(new Question16pt2(1, "John Johnson", "Humanities"));
		list.add(new Question16pt2(33, "David James", "Business"));
		list.add(new Question16pt2(12, "Ashley William", "Marketing"));

		Comparator c =  new iDCompare();
		
		Collections.sort(list, c);
		
		for (Question16pt2 q3: list) {
			System.out.println(q3.name);
		}
	}
}

