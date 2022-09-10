import java.util.Scanner;
import java.util.Random;
/*
메소드를 이용한 배열의 덧셈
크기가 10인 배열 3개를 만든 후 
2개 배열은 정수 난수로 채운 후 두 배열의 합을 세 번째 배열에 저장한다.
배열의 출력은 printArray 메소드를 이용한다.
*/

public class ArrayAdd {
	public static void main(String[] args){
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		System.out.print("난수발생기에 사용할 seed를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random random = new Random(seed);
		
		for(int i = 0; i < 10; i++){
			a[i] = random.nextInt(10);
		}
		for(int i = 0; i < 10; i++){
			b[i] = random.nextInt(10);
		}
		for(int i = 0; i < 10; i++){
			c[i] = a[i] + b[i];
		}
		printArray(a);
		printArray(b);
		printArray(c);
		
	}
	/*
	주어진 배열의 원소를 차례로 출력한다.
	@param array 출력할 배열을 가리키는 참조변수.
	*/
	public static void printArray(int[] array){
		for(int i = 0; i < 10; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}