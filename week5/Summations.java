package week5;
import java.util.Scanner;
/*
입력 받은 수 이하의 자연수의 합을 구하는 프로그램
@ author 박귀열
*/
public class Summations{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("얼마 이하의 자연수를 더하시겠습니까? ");
		int number = input.nextInt();
		int numberSum = sum(number);
		System.out.printf("%d 이하 자연수의 합 = %d", number, numberSum);
		
	}
	/*
	입력 받은 수 이하의 자연수를 합하는 메소드
	@param upto : 입력 받는 수
	@return uptoSum : 자연수의 합을 반환
	*/
	public static int sum(int upto){
		int uptoSum = 0;
		for(int i = 1; i <= upto; i++){
			uptoSum += i;
		}
		return uptoSum;
	}
}