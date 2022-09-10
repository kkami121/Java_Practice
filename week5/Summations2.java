package week5;
import java.util.Scanner;
/*
십 단위의 수 사이의 자연수 합을 구하는 프로그램
@ author 박귀열
*/
public class Summations2{
	public static void main(String[] args){
		
		int numberSum;
		
		System.out.print("10부터  20까지의 자연수의 합 = ");
		numberSum = sum(10, 20);
		System.out.println(numberSum);
		
		System.out.print("20부터  30까지의 자연수의 합 = ");
		numberSum = sum(20, 30);
		System.out.println(numberSum);
		
		System.out.print("30부터  40까지의 자연수의 합 = ");
		numberSum = sum(30, 40);
		System.out.println(numberSum);
		
		System.out.print("40부터  50까지의 자연수의 합 = ");
		numberSum = sum(40, 50);
		System.out.println(numberSum);
		
		System.out.print("50부터  60까지의 자연수의 합 = ");
		numberSum = sum(50, 60);
		System.out.println(numberSum);
		
		System.out.print("60부터  70까지의 자연수의 합 = ");
		numberSum = sum(60, 70);
		System.out.println(numberSum);
		
		System.out.print("70부터  80까지의 자연수의 합 = ");
		numberSum = sum(70, 80);
		System.out.println(numberSum);
		
		System.out.print("80부터  90까지의 자연수의 합 = ");
		numberSum = sum(80, 90);
		System.out.println(numberSum);
		
		System.out.print("90부터  100까지의 자연수의 합 = ");
		numberSum = sum(90, 100);
		System.out.println(numberSum);
	}
	/*
	입력 받은 두 수 사이의 자연수를 합하는 메소드
	@param from : 두 수 사이 중 합을 시작하는 수
	@return to : 두 수 사이 중 합을 끝내는 수
	*/
	public static int sum(int from, int to){
		int sumResult = 0;
		for(int i = from; i <= to; i++){
			sumResult += i;
		}
		return sumResult;
	}
}