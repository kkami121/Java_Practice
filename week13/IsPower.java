import java.util.Scanner;

public class IsPower{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		
		System.out.print(isPower(number));
		
	}
	/*
	주어진 정수가 2의 거듭제곱인지 판단하는 메소드
	@param input 입력 받는 정수(0 이상)
	@return input이 2의 거듭제곱승이면 true, 아니면 false
	*/
	public static boolean isPower(int input){
		int count = 0;
		boolean result = false;
		while (input != 0) {
			count += (input & 1);
			input = input >>> 1;
		}
		if(count == 1){
			result = true;
		}
		else{
			result = false;
		}
		return result;
	}
}