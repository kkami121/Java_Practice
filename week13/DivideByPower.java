import java.util.Scanner;

public class DivideByPower{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		System.out.print("k: ");
		int k = input.nextInt();
		
		int q = getQuotient(number, k);
		int r = getRemainder(number, k);
		
		System.out.printf("%d / 2의%d승 = %d\n", number, k, q);
		System.out.printf("%d %% 2의%d승 = %d\n", number, k, r);
		
	}
	/*
	음이 아닌 정수를 입력 받아 2의 거듭제곱으로 나눈 몫을 구하는 메소드
	@param input 입력 받는 정수(0 이상)
	@param k 2의 몇 승을 의미(0 이상)
	@return input을 2의 k승으로 나눈 몫
	*/
	public static int getQuotient(int input, int k){
		int result = input >> k;
		return result;
	}
	/*
	음이 아닌 정수를 입력 받아 2의 거듭제곱으로 나눈 나머지를 구하는 메소드
	@param input 입력 받는 정수(0 이상)
	@param k 2의 몇 승을 의미(0 이상)
	@return input을 2의 k승으로 나눈 나머지
	*/
	public static int getRemainder(int input, int k){
		int result = input & ((1 << k) - 1);
		return result;
	}
}