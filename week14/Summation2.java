import java.util.Scanner;
public class Summation2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("정수 두 개 입력: ");
		int number = input.nextInt();
		int number2 = input.nextInt();
		int result = sum(number, number2);
		
		System.out.printf("sum = %d",result);
	}
	/*
	주어진 두 양의 정수의 합을 구하는 메소드
	첫 정수가 두 번째 정수보다 같거나 작아야 한다
	재귀함수를 이용한다
	@param n 주어진 양의 정수 (n <= m)
	@param m 주어진 양의 정수 (n <= m)
	@return 1부터 n까지의 합
	*/
	public static int sum(int n, int m){
		if(n <= m)
			return m + sum(n, m-1);
		else
			return 0;
	}
	
}
