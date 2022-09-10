import java.util.Scanner;

/*
 배열을 이용하여 q 혹은 Q를 입력하기 전까지 정수를 입력받아 역으로 출력하고 그 값들의 평균을 구하는 프로그램
 String을 통해 입력받고 숫자는 정수 형변환을 이용한다.
 @author 박귀열
 */
public class ReverseQ {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] num = new int[100];
		String string;
		int i = 0;
		double sum = 0;
		String a = "q";
		boolean end = false;
		
		System.out.println("정수를 차례로 입력하시오:");
		System.out.println("입력을 마치려면 'q', 혹은 'Q'를 입력하시오:");
		while(!end){
			string = input.next();
			if(string.equalsIgnoreCase(a)){
				end = true;
			}
			else{
				num[i] = Integer.parseInt(string);
				sum += num[i];
				i++;
			}	
		}
		System.out.println("배열을 역순으로 출력: ");
		for(int j = i-1; j >= 0; j--){
			System.out.print(num[j] + "\t");
		}
		System.out.println(" ");
		System.out.printf("평균값: " + (sum/i) + "\n");
	}
}
