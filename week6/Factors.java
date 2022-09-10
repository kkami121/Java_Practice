package week6;
/*
주어진 자연수를 소인수분해 하여 출력하는 프로그램
@author 박귀열
*/import java.util.Scanner;
public class Factors{
	public static void main(String[] args){
	
		long number;
		long i;
		Scanner input = new Scanner(System.in);
		System.out.print("자연수를 하나 입력하세요: ");
		number = input.nextLong();
		System.out.printf("%d을 소인수분해하면 ", number);

		for(i = 2; number > 1;){
			if(number % i == 0){
				System.out.print(i + " ");
				number /= i;
			}
			else{
				i++;
			}
		}
	}
}
