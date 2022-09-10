import java.util.Scanner;

public class Sorter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1;
		String str2;

		str1 = input.next();
		str2 = input.next();

		int res = str1.compareTo(str2);

		if(res == 0)
			System.out.println(str1 + " " + str2);
		else if(res <0)
			System.out.println(str1 + " " + str2);
		else
			System.out.println(str2 + " " + str1);
	}

}
