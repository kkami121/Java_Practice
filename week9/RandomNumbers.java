import java.util.Scanner;
import java.util.Random;
/*
크기가 20인 정수 타입 배열을 0이상 10미만 정수 난수로 채운 후 출력하는 프로그램
*/

public class RandomNumbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] number = new int[20];
		int i;
		System.out.print("난수발생기에 사용할 seed를 입력하세요: ");
		int seed = input.nextInt();
		Random random = new Random(seed);
		
		System.out.print("10보다 작은 정수 난수: ");
		for(i = 0; i < 20; i++){
			number[i] = random.nextInt(10);
			System.out.print(number[i] + " ");
		}	
	}
}