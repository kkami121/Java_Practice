package week6;
import java.util.Scanner;
/*
입력 받은 수보다 작거나 같은 최대 정수의 제곱수를 찾는 프로그램
입력 받는 수는 양의 정수, 음수를 입력할 경우 프로그램 종료
최대 정수의 제곱수를 찾는 알고리즘은 maxSquare함수를 사용하여 구현
@author 박귀열
*/
public class MaxSquareTest{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int n;
		boolean end = false;

		System.out.println("어떤 수보다 작거나 같은 최대 \"정수의 제곱수\"를 찾을까요? ");
		System.out.println("음이 아닌 정수를 입력하시오.");
		System.out.println("음수를 입력하면 프로그램이 종료됩니다.\n");


		while(!end){
			System.out.print("입력: ");
			n = input.nextInt();
			if(n >= 0){
				System.out.printf("%d보다 작거나 같은 최대 \"정수의 제곱수\"는 " + maxSquare(n) + "입니다. \n\n", n);
			} else
					end = true;
		}
		System.out.println("프로그램이 끝났습니다.");
	}
	/*
	입력 받은 양의 정수보다 작거나 같은 정수의 제곱수들 중 최대값을 구하는 함수
	@param bound 입력 받은 양의 정수
	@return 정수 제곱근의 최대값
	*/
	public static int maxSquare(int bound){
		int result = 0;
		int i;
		for(i = 0; i * i <= bound; i++){
				result = i * i;
		}
		return result;
	}
}