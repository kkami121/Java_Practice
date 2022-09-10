package week2;
import java.util.Scanner;

public class StringAdder{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		String s1 = input.next();
		String s2 = input.next();
		System.out.print("단어를 두 개 입력하시오: ");
		
		System.out.println(s1 + s2);
		
		input.close();
	}
}