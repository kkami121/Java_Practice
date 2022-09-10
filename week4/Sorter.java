package week4;
import java.util.Scanner;
/*
3개의 정수를 입력 받아 오름차순으로 정렬 후 출력하는 프로그램
@author 박귀열
*/
public class Sorter{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("세 개의 정수를 입력하세요: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
	if(n1 < n2 && n1 < n3){
		if(n2 < n3){
			System.out.printf("%d %d %d", n1, n2, n3);
		}	
		else{
			System.out.printf("%d %d %d", n1, n3, n2);
		}
	}
	else if(n2 < n1 && n2 < n3)
		if(n1 < n3){
			System.out.printf("%d %d %d", n2, n1, n3);
		}
		else{
			System.out.printf("%d %d %d", n2, n3, n1);
		}
	else{
		if(n1 < n2){
			System.out.printf("%d %d %d", n3, n1, n2);
		}
		else{
			System.out.printf("%d %d %d", n3, n2, n1);
		}
		}
	}
}