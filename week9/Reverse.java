import java.util.Scanner;

/**
 * 키보드로부터 10개의 정수를 차례로 읽어 배열에 저장한 후 나중 것부터 처음 것까지 차례로 출력한다.
 *
 */
public class Reverse {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		int i;
		System.out.println("정수 10개를 차례로 입력하시오: ");
		
		for(i = 0; i < 10; i++){
			arr[i] = input.nextInt();
		}
		
		System.out.println("배열을 역순으로 출력: ");
		for(i = 9; i >= 0; i--){
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
