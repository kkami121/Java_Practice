package week7;
import java.util.Scanner;
public class Digits{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int i;
		
		System.out.print("숫자를 입력하시오: ");
		String s = input.nextLine();
		System.out.printf("%d개의 글자로 이루어진 문자열입니다.\n", s.length());
		
		for(i = 0; i < s.length(); i++){
			System.out.print(s.charAt(i) + " ");
		}
	}
}