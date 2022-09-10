package week2;
import java.util.Scanner;

public class Adder{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 두개 입력하시오 : ");
		
		int i = input.nextInt();
		int j = input.nextInt();
		
		System.out.println(i + " + " + j + " = " + (i+j));
		
	}
}