import java.util.Scanner;

public class MultiplyByPower{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		System.out.print("k: ");
		int k = input.nextInt();
		int result = multiplyByPower(number, k);
		System.out.printf("%d * 2의%d승 = %d", number, k, result);
		
	}
	/*
	정수를 입력 받아 정수와 2의 거듭제곱을 곱하는 값을 구하는 메소드
	@param input 입력 받는 정수
	@param k 2의 몇 승을 의미
	@return input * (2의 k승)
	*/
	public static int multiplyByPower(int input, int k){
		int result = input << k;
		return result;
	}
}