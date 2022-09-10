import java.util.Scanner;

public class Concatenator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StringBuilder str2 = new StringBuilder("");
		
		while(input.hasNext()) {
			
			String str1 = input.next();
			str2 = str2.append(str1 + " ");
			
		}
			System.out.print(str2);
	}
	
}