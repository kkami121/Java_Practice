import java.util.Scanner;
import java.util.Arrays;

public class ToBinaryString {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("32-bit integer: ");
		int number = input.nextInt();
		
		String binaryString1 = toBinaryString(number);
		String binaryString2 = Integer.toBinaryString(number);
			
		System.out.println("toBinaryString: "+ binaryString1);
		System.out.println("Integers.toBinaryString: " + binaryString2);
		System.out.println("Same: " + binaryString1.equals(binaryString2));
		
	}
	/*
	입력 받은 정수를 String 비트열 표현으로 나타내는 메소드
	@param input 입력 받은 정수
	@return input의 2진수 표현에 해당하는 문자열
	*/
	public static String toBinaryString(int input){
		int temp = 0;
		int [] array = new int[32];
		String str = "";
		String str2 = "";
		String [] str_array = new String[32];
		if(input == 0){
			str2 = "0";
		}
		else{
			for(int i=31; i>=0; i--){
				temp = input >> i;
				array[31-i] = temp & 1;
			}

			str = Arrays.toString(array).replaceAll("[^0-9 ]","");
			str_array = str.split(" ");

			boolean start = false;

			for(int i = 0; i < str_array.length; i++) {
				if(str_array[i].equals("1")){
					start = true;
				}
				if(start){
					str2 = str2.concat(str_array[i]);
				}
			}
		}
		return str2;
	}
}