import java.util.Random;
import java.util.Scanner;

public class InsertionSort{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Seed: ");
		long seed = input.nextLong();
		Random generator = new Random(seed);
		
		System.out.print("최대 난수는? ");
		int max = input.nextInt();
		
		int [] numbers = new int[1000];
		fillRandom(numbers, max, generator);
		
		System.out.print("데이터 개수는? ");
		int size = input.nextInt();
		
		System.out.print("원 배열: ");
		printArray(numbers, size);
		sort(numbers, size);
		System.out.print("정렬된 배열: ");
		printArray(numbers, size);
		
		System.out.println();
	}
	/*
	x[0], x[1], .... x[i-1]가 이미 오름차순으로 정렬되어 있는 상태에서 x[i]를 올바른 위치에 삽입하는 삽입정렬 메소드
	@param x 배열
	@param i 올바른 위치를 찾아줄 원소의 인텍스
	*/
	public static void insert(int[] x, int i){
		for(int n = 1; n <= i; n++) {
			int target = x[n];
			int j = n - 1;
			while(j >= 0 && target < x[j]) {
				x[j + 1] = x[j];
				j--;
			}
			
			x[j + 1] = target;	
		}
	}
	/*
	x[0], x[1], .... x[i-1]을 정렬된 상태로 만드는 메소드
	@param x 배열
	@param n 정렬할 원소의 개수
	*/
	public static void sort(int[] x, int n){
		for(int i = 1; i < n; i++){
			insert(x, i);
		}
	}
	
	/*
	n > a.length 인 경우에는 a,length개의 원소를 출력.
	n < 0 인 경우에는 아무 것도 출력하지 않는다.
	
	@param a 배열
	@param n 출력할 원소의 개수
	*/
	public static void printArray(int[] a, int n){
		if(n > a.length){
			for(int i = 0; i < a.length; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println();	
		}
		else{
			for(int i = 0; i < n; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println();	
		}
	}
	/*
	배열 list에 0이상 uBound 미만 정수 난수를 채워준다.
	@param list 난수를 채울 배열
	@param uBound 난수의 최대값 + 1
	@generator 난수 발생기
	*/
	public static void fillRandom(int [] list, int uBound, Random generator){
		for(int i = 0; i < list.length; i++){
			list[i] = generator.nextInt(uBound);
			
		}
	
	}
}