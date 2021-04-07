package week6;

import java.util.Scanner;
/*
입력 받은 십진수를 이진수로 변환하는 프로그램
입력받은 십진수 보다 작거나 같은 2의 거듭제곱수들 중 최대값을 구하는 메소드를 이용
입력받은 십진수를 이진수로 변환하여 문자열로 반환하는 메소드를 이용
@author 박귀열
*/
public class Dec2Bin2{
	public static void main(String[] args) {
		
		System.out.print("자연수 하나를 십진수로 입력하시오: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.println(toBinary(number));
	}
	/*
	입력 받은 십진수보다 작거나 같은 2의 거듭제곱수들 중 최대 값을 구하는 메소드
	주어진 수는 1이상의 정수이어야 한다.
	ex) 주어진 수가 10이면 2^3 = 8.
			주어진 수가 22이면 2^4 = 16.
	@param n 입력 받은 십진수
	@return n보다 작거나 같은 2의 거듭제곱들 중 최대값
	*/
	public static int maxPower(int n){
		
		int power = 1;
		
		while (power <= n/2){
			power *= 2;
		}
		return power;
	}
	
	/*
	십진수를 이진수로 변환하여 이진수 문자열을 만드는 메소드.
	주어진 수는 1이상의 정수이어야 한다.
	이진수로 변환하는 과정에서의 power값은 maxPower메소드를 이용한다.
	ex) 십진수 10이 주어지면 이진수 문자열 1010이 반환된다.
	@param n 입력 받은 십진수
	@return s 이진수 문자열
	*/
	public static String toBinary(int n){
		
		int power = maxPower(n);
		String s = "";
		
		while(power > 0){
			if(n < power){
				s = s + 0;
			}
			else{
				s = s + 1;
				n -= power;
			}
			power /= 2;
		}
		return s;
	}
}