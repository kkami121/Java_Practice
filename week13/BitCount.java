import java.util.Scanner;

public class BitCount{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		int count = bitCount(number);
		System.out.printf("%d has %d '1's", number, count);
	}
	
	/*
	주어진 정수를 2진수로 표현하고 2진수의 들어있는 1의 개수를 반환하는 메소드
	@param input 입력 받는 정수
	@return count input을 2진수로 표현할 때 나타나는 1의 개수
	*/
	public static int bitCount(int input){
		int count = 0;
		while (input != 0) {
			count += (input & 1);
			input = input >>> 1;
		}
		return count;
	}
}