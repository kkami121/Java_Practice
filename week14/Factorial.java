import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("n: ");
		int number = input.nextInt();
		int result = factorial(number);
		
		System.out.printf("%d! = %d", number, result);
	}
	/*
	주어진 양의 정수의 팩토리얼을 구하는 메소드
	재귀함수를 이용한다
	@param n 주어진 양의 정수
	@return n!
	*/
	static int factorial(int n){
		if (n <= 1)
			return n;
		else
			return factorial(n-1) * n;
	}
	
}