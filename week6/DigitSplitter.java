package week6;
/*
int 타입의 정수를 입력받고 자리수와 각 자리수의 숫자를 차례대로 출력하는 프로그램
p6에서 만들었던 powersOfTen와 numberOfDigits 함수를 사용
ex) 입력 : 1234 => 4자리수(10의 3제곱근)
		1234 / 1000 = 1
		1234 % 1000 = 234
		
		234 / 100 = 2
		234 % 100 = 34
		
		34 / 10 = 3
		34 % 10 = 4
		
		4 / 1 = 4
*/
import java.util.Scanner;
public class DigitSplitter{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number;
		int mok = 0;
		int namulge = 0;
		
		System.out.print("정수를 입력하시오, int 타입 수이어야 하고 0이 아니어야 합니다: ");
		number = input.nextInt();
		int n = numberOfDigits(number);
		int power;
		System.out.println(n + "자리수 입니다.");
		
		for(int i = n; i >0; i--){
			power = powersOfTen(i - 1);
			mok = number / power; // 2
			namulge = number % power; //345
			number = namulge;
			if(mok < 0){
				mok *= -1;
			}
			System.out.print(mok + " ");
		}
	}
	/*
	10의 거듭제곡을 만드는 메소드
	10^0 = 1
	@param n 몇 거듭제곱을 할 것인지 지정한다. n은 0이상의 정수
	@return 10의 n거듭제곱수
	*/
	public static int powersOfTen(int n){
		int power = 1;
		if(n == 0){
			power = 1;
		}
		else{
			for(int i = 1; i <= n; i++){
				power *= 10;
			}
		}
		return power;
	}
	/*
	주어진 정수가 몇자리 수인지 판단하는 메소드
	@param n 입력 받은 정수. n은 0이상의 정수
	@return n의 자리수 
	*/
	public static int numberOfDigits(int n){
		int i;
		for (i = 9; (n / powersOfTen(i)) == 0; i--);
			
		return i + 1;
	}
}