import java.util.Random;
import java.util.Scanner;


public class Dice {
	/*
	주사위를 한 개 혹은 여러 개 던져 나온 수를 더하고 더한 수의 분포가 몇개가 존재하는지 알아보는 프로그램
	*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seed: ");
		long seed = input.nextLong();
		Random generator = new Random(seed);
		
		System.out.println("한 번에 던질 주사위 갯수: ");
		int num_dice = input.nextInt();
		
		System.out.println("몇 번 던질 것인가: ");
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
			System.out.println(i + " 횟수:\t" + occurence[i-num_dice]); 
		}
	}
	/*
	랜덤으로 나온 주사위 숫자를 더하는 메소드
	@param n = 던질 주사위의 갯수.
	@param generator 난수를 만드는 데 사용할 난수발생기.
	*/
	public static int castDice(int n, Random generator){
		int result = 0;
		for(int i = 0; i < n; i++){ 
				result += generator.nextInt(6);
		}
		return result;
	}
}