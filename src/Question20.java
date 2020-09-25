import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a roman numeral");
		
		String number = keyboard.nextLine();
		
		if(number.equalsIgnoreCase("I")) {
			System.out.println(1);
		}else if(number.equalsIgnoreCase("V")) {
			System.out.println(5);
		}else if(number.equalsIgnoreCase("X")) {
			System.out.println(10);
		}else if(number.equalsIgnoreCase("L")) {
			System.out.println(50);
		}else if(number.equalsIgnoreCase("C")) {
			System.out.println(100);
		}else if(number.equalsIgnoreCase("D")) {
			System.out.println(500);
		}else {
			System.out.println(1000);
		}
	}

}
