package week9;

import java.util.Scanner;
import java.util.Random;
/*
크기가 10인 정수 타입 배열을 0이상 100미만 정수 난수로 채운 후
원소들 중 최소값, 최대값, 원소들의 평균값을 구하는 프로그램
*/

public class ArrayAdd {
	public static void main(String[] args){
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int i;
		System.out.print("난수발생기에 사용할 seed를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random random = new Random(seed);
		
		for(i = 0; i < 10; i++){
			a[i] = random.nextInt(10);
		}
		for(i = 0; i < 10; i++){
			b[i] = random.nextInt(10);
		}
		for(i = 0; i < 10; i++){
			c[i] = a[i] + b[i];
		}
		printArray(a);
		printArray(b);
		printArray(c);
		
	}
	public static void printArray(int[] array){
		for(int i = 0; i < 10; i++){
			System.out.print(array[i] + " ");
		}
	}
}