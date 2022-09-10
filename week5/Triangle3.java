package week5;
import java.util.Scanner;
/*
크기를 입력받아 역삼각형을 출력하는 프로그램
호출 메소드를 이용
ex) 5
*****
 ****
  ***
   **
    *
@ author 박귀열
*/
public class Triangle3{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");
		int num = input.nextInt();
		trianle(num);
		
	}
	/*
	입력 파라미터를 이용하여 역삼각형을 출력하는 메소드
	@param 원하는 층 수
	*/
	public static void trianle(int n){
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}