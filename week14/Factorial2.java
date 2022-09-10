import java.util.Scanner;
public class Factorial2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("n: ");
		int count = 0;
		int number = input.nextInt();
		int result = factorial(number, count);
		
		System.out.printf("%d! = %d", number, result);
	}
	/*
	주어진 양의 정수의 팩토리얼을 구하는 메소드
	재귀함수를 이용한다
	재귀함수가 끝나면 재귀 호출의 깊이(count)을 출력한다
	@param n 주어진 양의 정수
	@param count 재귀 호출의 깊이
	@return n!
	*/
	static int factorial(int n, int count){
		if (n <= 1){
			System.out.println("재귀호출의 깊이 = " + count);
			return 1;
		}
		else{
			count++;
			return factorial(n-1, count) * n;
		}
	}
	
}