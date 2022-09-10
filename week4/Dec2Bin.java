package week4;
import java.util.Scanner;
/*
입력 받은 십진수를 이진수로 변환하는 프로그램
@author 박귀열
*/
public class Dec2Bin{
	public static void main(String[] args) {
		
		System.out.print("자연수 하나를 입력하시오. ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int result = 1;
		int power = 0;
		
		while(number >= result){
		result = result *= 2;
		power = (result / 2);
		}	
		
		while(power > 0){
			if(number < power){
				System.out.print("0");
			}
			else{
				System.out.print("1");
				number = number - power;
			}
			power /= 2; 	
		}
	}
}