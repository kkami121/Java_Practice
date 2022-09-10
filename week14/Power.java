import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("밑수: ");
		int number = input.nextInt();
		System.out.print("지수: ");
		int number2 = input.nextInt();
		int result = raise(number, number2);
		
		System.out.printf("%d의 %d승 = %d",number, number2, result);
	}
	/*
	거듭제곱을 계산하는 메소드
	재귀함수를 이용한다
	@param base 밑수(0이 아닌 정수)
	@param expo 지수(음이 아닌 정수)
	@return base의 expo승
	*/
	public static int raise(int base, int expo){
		if(expo == 0)
			return 1;
		else
			return base * raise(base, expo-1);
	}
	
}
