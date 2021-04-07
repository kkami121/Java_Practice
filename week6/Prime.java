package week6;
/*
주어진 정수가 소수인지 여부를 판별하는 프로그램
방법이 다른 isPrime1과 isPrime2 메소드를 호출하여 구현
@author 박귀열
*/
public class Prime{
	public static void main(String[] args){
		
		for(int i = 2; i <= 20; i++){
			System.out.printf("첫 번째 방법: %d은(는) 소수이다: " + isPrime1(i), i);
			System.out.println(" ");
			System.out.printf("두 번째 방법: %d은(는) 소수이다: " + isPrime2(i), i);
			System.out.println(" ");
		}
		
	}
	/*
	첫 번째 방법
	주어진 n이 소수인지 판별하는 메소드
	n이 2..3..4....n-1로 나누어 떨어지는 살펴보며 만약 어느 하나라도 나누어 떨어지는 수가 존재하면 n은 소수가 아니다.
	@param n 주어진 수
	@return 소수이면 true, 소수가 아니면 false
	*/
	public static boolean isPrime1(long n){
		boolean isPrime = true;
		for (long i = 2; i < n; i++){
			if(n % i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	/*
	두 번째 방법
	주어진 n이 소수인지 판별하는 메소드
	n이 √n까지의 정수로 나누어 떨어지는지 살펴보며 떨어지는 수가 존재하면 n은 소수가 아니다.
	@param n 주어진 수
	@return 소수이면 true, 소수가 아니면 false
	*/
	public static boolean isPrime2(long n){
		boolean isPrime = true;
		for (long i = 2; i * i <= n; i++){
			if(n % i == 0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}