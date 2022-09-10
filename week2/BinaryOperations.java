package week2;
import java.util.Scanner;

public class BinaryOperations{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("실수를 두 개 입력하시오: ");
		Double i = input.nextDouble();
		Double j = input.nextDouble();
		
		System.out.println(i + " + " + j + " = "+ (i+j));
		System.out.println(i + " - " + j + " = "+ (i-j));
		System.out.println(i + " * " + j + " = "+ (i*j));
		System.out.println(i + " / " + j + " = "+ (i/j));
		
		input.close();
	}
}