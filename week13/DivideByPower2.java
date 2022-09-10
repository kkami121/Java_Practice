import java.util.Scanner;

public class DivideByPower2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		System.out.print("k: ");
		int k = input.nextInt();
		
		int [] array = getQuotientAndRemainder(number, k);
		
		System.out.printf("%d / 2의%d승 = %d\n", number, k, array[0]);
		System.out.printf("%d %% 2의%d승 = %d\n", number, k, array[1]);
		
	}
	/*
	음이 아닌 정수를 입력 받아 2의 거듭제곡 승으로 나눈 몫과 나머지를 구하는 메소드
	@param input 주어진 정수(0이상)
	@param k 2의 몇 승을 의미(0이상)
	@return input을 2의 k승으로 나눈 몫과 나머지가 들어있는 크기가 2인 배열
	*/
	public static int[] getQuotientAndRemainder(int input, int k){
		int quotient = input >> k;
		int remainder = input & ((1 << k) - 1);
		int [] array = new int[2];
		
		array[0] = quotient;
		array[1] = remainder;
		
		return array;
	}
}