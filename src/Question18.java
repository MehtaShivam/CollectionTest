import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a string of characters");
		
		String input = keyboard.nextLine();
		
		if(input.length() <= 1) {
			System.out.println(input);
		}
		
		int count = 1;
		String output = "";
		for(int i = 1; i < input.length(); i++) {
			 if (i == input.length()-1) {
				 count++;
				 output+="" + input.charAt(i) + count;
			 } else if (input.charAt(i - 1) == input.charAt(i)) {
				 count++;
				 continue;
			 }else if (input.charAt(i - 1) != input.charAt(i)) {
				 output += "" + input.charAt(i-1) + count;
				 count = 1;
			 }else {
				 count = 1;
			 }
			
		}
		
		if (input.length() < output.length()) {
			System.out.println(input);
		}else {
			System.out.println(output);
		}
	}
}
