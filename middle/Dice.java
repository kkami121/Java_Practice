package middle;


import java.util.Scanner;

public class Dice{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		System.out.print("k: ");
		int k = input.nextInt();
		
		int q = getQuotient(number, k);
		int r = getRemainder(number, k);
		
		System.out.printf("%d / 2의%d승 = %d\n", number, k, q);
		System.out.printf("%d %% 2의%d승 = %d", number, k, r);
		
	}
	public static int getQuotient(int input, int k){
		int k_power = 2;
		int result = 0;
		if(k == 0){
			k_power = 1;
			result = (input * k_power);
		}
		else{
			for(int i = 1; i < k; i++){
			k_power *= 2;
			result = (input * k_power);
			}
		}
		return (input / result);
	}
	public static int getRemainder(int input, int k){
		int k_power = 2;
		int result = 0;
		if(k == 0){
			k_power = 1;
			result = (input * k_power);
		}
		else{
			for(int i = 1; i < k; i++){
			k_power *= 2;
			result = (input * k_power);
			}
		}
		return (input % result);
	}
}