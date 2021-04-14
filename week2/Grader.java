package week2;
import java.util.Scanner;

public class Grader{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int number = input.nextInt();
		
		if(number >= 90){
			System.out.println("등급 = A");
		}
		else if(number >= 80){
			System.out.println("등급 = B");
		}
		else if(number >= 70){
			System.out.println("등급 = C");
		}
		else if(number >= 60){
			System.out.println("등급 = D");
		}
		else{
			System.out.println("등급 = F");
		}
			
		input.close();
	}
}