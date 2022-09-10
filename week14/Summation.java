import java.util.Scanner;
public class Summation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("n: ");
		int number = input.nextInt();
		int result = sum(number);
		
		System.out.printf("sum = %d",result);
	}
	/*
	1부터 주어진 양의 정수의 합을 구하는 메소드
	재귀함수를 이용한다
	@param n 주어진 양의 정수
	@return 1부터 n까지의 합
	*/
	public static int sum(int n){
		if(n > 1)
			return n + sum(n-1);
		else
			return 1;
	}
	
}
