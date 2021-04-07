package week5;
import java.util.Scanner;
/*
두 개의 정수를 입력 받아 두 수 사이에 있는 모든 짝수들의 합을 구하는 프로그램
@ author 박귀열
*/
public class EvensSum{
	public static void main(String[] args){
		
		boolean done = false;
		int exchange = 0;
		int number;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
		
		while(!done){
			System.out.print("두 개의 정수를 입력하시오: ");
			number = input.nextInt();
			number2 = input.nextInt();
			if(number == number2){
				done = true;
			}
			else{
					if(number > number2){
						exchange = number;
						number = number2;
						number2 = exchange;
					}
				System.out.printf("%d부터 %d까지의 짝수의 합 = %d \n", number, number2, getEvensSum(number, number2));
				System.out.println(" ");
			}
		}
		System.out.printf("감사합니다. 프로그램을 마칩니다.");
	}
	/*
	입력 받은 두 수 사이의 짝수를 합하는 메소드
	@param from : 두 수 사이 중 합을 시작하는 수
	@return to : 두 수 사이 중 합을 끝내는 수
	*/
	public static int getEvensSum(int from, int to){
		int sumResult = 0;
		for(int i = from; i <= to; i++){
			if(i % 2 == 0){
				sumResult += i;
			}
		}
		return sumResult;
	}
}