import java.util.Scanner;

public class IsOdd{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		
		if(isOdd(number) == true){
			System.out.print("홀수");
		}
		else{
			System.out.print("홀수 아님");
		}
		
	}
	/*
	주어진 정수가 홀수인지 판단하는 메소드
	@param input 입력 받는 정수
	@return input이 홀수이면 true, 짝수이면 false
	*/
	public static boolean isOdd(int input){
		boolean result = true;
		
		if((input & 1) == 0){
			result = false;
		}
		else{
			result = true;
		}
		
		return result;
	}
}