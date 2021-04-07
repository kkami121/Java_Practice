package week6;
import java.util.Scanner;
/*
입력 받은 정수의 자리 수를 알려주는 프로그램
int 타입 정수 n은 10의 i거듭제곱부터 i = i - 1을 반복 수행하여 구해진 거듭제곱으로 n을 나누어 몫이 0인지 아닌지를 판단하여 자리 수를 확인할 수 있는 알고리즘을 구상 
ex) n = 123, i = 9 
		123 / 10^9 = 0
		123 / 10^2 = 1
		=> 123은 i + 1 자리수
@author 박귀열
*/
public class NumberOfDigitsTest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수의 자리 수를 알려줍니다.");
		System.out.println("정수를 입력하시오,");
		System.out.println("int 타입 수이어야 하고 0이 아니어야 합니다.");		
		
		int number = input.nextInt();
		
		System.out.println(numberOfDigits(number) + "자리 수입니다.");
	}
	/*
	10의 거듭제곡을 만드는 메소드
	10^0 = 1
	@param n 몇 거듭제곱을 할 것인지 지정한다. n은 0이상의 정수
	@return 10의 n거듭제곱수
	*/
	public static int powersOfTen(int n){
		int power = 1;
		if(n == 0){
			power = 1;
		}
		else{
			for(int i = 1; i <= n; i++){
				power *= 10;
			}
		}
		return power;
	}
	/*
	주어진 정수가 몇자리 수인지 판단하는 메소드
	@param n 입력 받은 정수. n은 0이상의 정수
	@return n의 자리수 
	*/
	public static int numberOfDigits(int n){
		int i;
		for (i = 9; (n / powersOfTen(i)) == 0; i--);
			
		return i + 1;
	}
}