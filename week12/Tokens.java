import java.util.Scanner;

public class Tokens {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String [] token = str.split("/");
		for(int i = 0; i < token.length; i++){
			System.out.println("[" + i + "] " + token[i]);
		}
		
	}
}