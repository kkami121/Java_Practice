import java.util.Scanner;
import java.util.Arrays;

public class Frequency {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.print(getMostFreqChar(str));
		
	}
	
	static char getMostFreqChar(String str){
		char [] alphabet = new char[52];
		int [] count = new int [alphabet.length];
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MAX_VALUE;
		char result = ' ';
		
		for (int i = 0 ; i < alphabet.length ; i++){
			if (i < 26){
				alphabet[i] = (char)(i + 65);
			}
			else{
				alphabet[i] = (char)(i + 71);
			}
		}
		for (int i = 0 ; i < str.length() ; i++){
			for (int j = 0 ; j < alphabet.length ; j++){
				if (str.charAt(i) == alphabet[j]){
					count[j]++;
					break;
				}
			}
		}
		for (int i = 0 ; i < alphabet.length ; i++){
			if(max < count[i]){
				max = count[i];
				result = alphabet[i];
			}
		}
		
		return result;
	}
}