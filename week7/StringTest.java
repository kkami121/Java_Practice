package week7;
import java.util.Scanner;
public class StringTest{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String s3, s4, s5;
		
		System.out.println("문장을 한 줄에 하나씩 두 개 입력하시오.");
		System.out.println("첫 문장 길이: " + s1.length());
		System.out.println("두 번째 문장 길이: " + s2.length());
		
		s3 = s1.concat(s2);
		s4 = s3.substring(s3.length() - 2);
		s5 = s3.replace(s4, "###");
		System.out.println("연결된 새 문자열: " + s3);
		System.out.println("마지막 두 글자: " + s4);
		System.out.println("첫 글자: " + s3.charAt(0));
		System.out.printf("\""+"%s"+ "\"" + "의 위치: %d \n", s4, s3.indexOf(s4));
		System.out.println(s5);
		
	}
}