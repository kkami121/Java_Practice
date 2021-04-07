package week4;
import java.util.Scanner;
/*
switch문을 이용하여 숫자와 연산을 입력받고 그에 맞는 연산결과를 출력하는 프로그램
@author 박귀열
*/
public class Calculator{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
	
		double n1;
		double n2;
		double result = 0.0;
		
		System.out.println("사칙 연산을 하는 프로그램입니다.");
		System.out.print("두 수를 차례로 입력하시오: ");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		System.out.println("두 수에 어떤 연산을 하시겠습니까?");
		System.out.print("+ - * / 중 하나를 입력하시오: ");
		String operator = input.next();
		
		switch(operator){
			case"+": 
				result = n1 + n2;
				System.out.printf("%.1f %s %.1f = %.2f", n1, operator, n2, result);
			break;
				
			case"-":
				result = n1 - n2;
				System.out.printf("%.1f %s %.1f = %.2f", n1, operator, n2, result);
			break;
				
			case"*":
				result = n1 * n2;
				System.out.printf("%.1f %s %.1f = %.2f", n1, operator, n2, result);
			break;
				
			case"/":
				result = n1 / n2;
				System.out.printf("%.1f %s %.1f = %.2f", n1, operator, n2, result);
			break;
			
			default:
			System.out.println("지원하지 않는 연산입니다.");
			System.exit(-1);
		}
		
	}
}