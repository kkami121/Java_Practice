import java.util.Scanner;
import java.util.Random;
/*
크기가 10인 정수 타입 배열을 0이상 100미만 정수 난수로 채운 후
원소들 중 최소값, 최대값, 원소들의 평균값을 구하는 프로그램
*/

public class RandomNumbers2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] number = new int[10];
		int i;
		int count = 0;
		double sum = 0;
		int min;
		int max;
		System.out.print("난수발생기에 사용할 seed를 입력하세요: ");
		long seed = input.nextLong();
		Random random = new Random(seed);
		
		System.out.print("100보다 작은 정수 난수: ");
		for(i = 0; i < 10; i++){
			number[i] = random.nextInt(100);
			sum += number[i];
			count++;
			System.out.print(number[i] + " ");
		}
		min = number[0];
		max = number[0];
		for(i = 0; i < 10; i++){
			if(min > number[i]){
				min = number[i];
			}
			else if(max < number[i]){
				max = number[i];
			}
		}
		System.out.println();
		System.out.println("원소들 중 최소값: " + min);
		System.out.println("원소들 중 최대값: " + max);
		System.out.println("원소들의 평균값: " + (sum/count));
	}
}