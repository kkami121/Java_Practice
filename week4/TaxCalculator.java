package week4;
import java.util.Scanner;
/*
소득을 입력하고 그에 맞는 소득세를 구하는 프로그램
@author 박귀열
*/
public class TaxCalculator{
	
	public static void main(String[] args){
		
		final double TAX_RATE_LOW = 15.0 / 100.0;
		final double TAX_RATE_MID = 24.0 / 100.0;
		final double TAX_RATE_HIGH = 35.0 / 100.0;
		double result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("소득은? 만원 단위로 입력하세요. ");
		double n1 = input.nextDouble();
	
		if(n1 <= 4600){
			result = n1 * TAX_RATE_LOW;
			System.out.printf("소득세 = %.1f만원", result);
		}
		else if(4600 < n1 && n1 <= 8800){
			result = (4600 * TAX_RATE_LOW) + ((n1 - 4600) * TAX_RATE_MID);
			System.out.printf("소득세 = %.1f만원", result);
		}
		else{
			result = (4600 * TAX_RATE_LOW) + ((8800 - 4600) * TAX_RATE_MID) + ((n1 - 8800) * TAX_RATE_HIGH);
			System.out.printf("소득세 = %.1f만원", result);
		}
	}
}