import java.util.Random;
import java.util.Scanner;


public class DiceGraph {
	/*
	주사위를 한 개 혹은 여러 개 던져 나온 수를 더하고 더한 수의 분포가 몇개가 존재하는지 알아보는 프로그램
	*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Seed: ");
		long seed = input.nextLong();
		Random generator = new Random(seed);
		
		System.out.print("한 번에 던질 주사위 갯수: ");
		int num_dice = input.nextInt();
		
		System.out.print("몇 번 던질 것인가: ");
		int trials = input.nextInt();
		
		int [] occurence = new int [6 * num_dice];
		
		int result = 0;
		
		for(int j = 0; j < trials; j++){
			result = castDice(num_dice, generator);
				int count = 0;
			for(int i = 0; i <= occurence.length; i++){
				if(i == result){
					count++;
					occurence[i] += count;
				}
			}
		}
		for(int i = num_dice; i <= occurence.length; i++){
			System.out.println(i + "이 나온 횟수: " + occurence[i-num_dice]); 

		}
		System.out.println();
		
		graph(occurence,num_dice);
		
	}
	
	/*
	랜덤으로 나온 주사위 숫자를 더하는 메소드
	@param n  던질 주사위의 갯수.
	@param generator 난수를 만드는 데 사용할 난수발생기.
	*/
	public static int castDice(int n, Random generator){
		int result = 0;
		for(int i = 0; i < n; i++){ 
				result += generator.nextInt(6);
		}
		return result;
	}
	/*
	위 main 함수의 결과를 그래프로 보여주는 메소드
	@param a 그래프를 그릴 *의 갯수를 결정하는 배열
	@param b 그래프를 그릴 배열의 인덱스
	*/
	public static void graph(int [] a, int b){
		for(int i = b; i <= a.length; i++){
			System.out.print(i + ":" + a[i-b] + "\t");
			for(int j = 0; j < a[i-b]; j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}