import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
파일로부터 데이터를 읽어 배열에 저장한 후 아래와 같은 순서로 배열의 앞에 있는 원소들의 합을 차례로 구하는 프로그램
ex) a[0]
		a[0] + a[1]
		a[0] + a[1] + a[2]
		....
*/
public class ListSum{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("/Users/kkami121/Downloads/Coding/Java_Practice/week9/integers2.txt"));
		int[] number = new int[100];
		int sum = 0;
		int i = 0;
	
		while(input.hasNext())
			number[i++] = input.nextInt();
		
		for(int j = 0; j < i; j++){
			sum += number[j];
			System.out.printf("배열의 첫 %d개 원소의 합: %d \n", j+1, sum);
		}
	}
}