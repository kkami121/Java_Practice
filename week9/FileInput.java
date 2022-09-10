import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
파일로부터 데이터를 읽어 배열에 저장한다.
*/
public class FileInput{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("data/integers.txt"));
		int[] number = new int[10];
		
		int i = 0;
		while(input.hasNext())
			number[i++] = input.nextInt();
		
		System.out.println("배열을 역순으로 출력: ");
		for(int j = i-1; j >= 0; j--){
			System.out.print(number[j] + " ");
		}
		System.out.println();
	}
}