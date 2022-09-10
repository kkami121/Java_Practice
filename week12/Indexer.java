import java.util.Scanner;

public class Indexer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;

		str = input.nextLine();
		str = str.toLowerCase();
		
		int a = str.indexOf("a");
		int b = str.indexOf("b");
		int c = str.indexOf("c");
		System.out.println(a + b + c);
		
	}

}
