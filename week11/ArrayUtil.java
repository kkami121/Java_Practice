import java.util.Random;
import java.util.Scanner;

public class ArrayUtil{
	public static void main(String[] args) {
	
		int [] a = new int[10];
		for(int i = 0; i < a.length; i++){
			a[i] = i;
		}
		int [] a6 = new int[1];
		int [] a7 = new int[0];
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Seed: ");
		long seed = input.nextLong();
		input.close();
		
		Random generator = new Random(seed);
		
		//printArray 테스트
		System.out.println("printArray 테스트 ===");
		
		System.out.print("printArray(a, 0): ");
		printArray(a, 0);
		System.out.print("printArray(a, 1): ");
		printArray(a, 1);
		System.out.print("printArray(a, a.length): ");
		printArray(a, a.length);
		System.out.print("printArray(a, a.length+1): ");
		printArray(a, a.length+1);
		System.out.print("printArray(a, -1): ");
		printArray(a, -1);
		System.out.println();
		
		//fillRandom 테스트
		System.out.println("fillRandom 테스트 ===");
		
		System.out.print("fillRandom(a, 10, generator): ");
		fillRandom(a, 10, generator);
		System.out.print("fillRandom(a, 100, generator): ");
		fillRandom(a, 100, generator);
		System.out.print("fillRandom(a, 2, generator): ");
		fillRandom(a, 2, generator);
		System.out.print("fillRandom(a, 1, generator): ");
		fillRandom(a, 1, generator);
		System.out.println();
		
		//distinct 테스트
		System.out.println("distinct 테스트 ===");
		
		int [] a2 = {1, 1, 2};
		System.out.println("a2 = {1, 1, 2}");
		System.out.println("distinct(a2, 1): " + distinct(a2, 1));
		System.out.println("distinct(a2, 2): " + distinct(a2, 2));
		System.out.println("distinct(a2, a2.length): " + distinct(a2, a2.length));
		System.out.println("distinct(a2, a2.length + 1): " + distinct(a2, a2.length + 1));
		System.out.println("distinct(a2, 0): " + distinct(a2, 0));
		System.out.println("distinct(a2, -1): " + distinct(a2, -1));
		
		int [] a3 = {1, 2, 3};
		System.out.println("a3 = {1, 2, 3}");
		System.out.println("distinct(a3, a3.length): " + distinct(a3, a3.length));
		System.out.println("distinct(a3, a3.length + 1): " + distinct(a3, a3.length + 1));
		
		int [] a4 = {1};
		System.out.println("a4 = {1}");
		System.out.println("distinct(a4, a4.length): " + distinct(a4, a4.length));
		System.out.println("distinct(a4, a4.length + 1): " + distinct(a4, a4.length + 1));
		
		int [] a5 = {};
		System.out.println("a5 = {}");
		System.out.println("distinct(a5, a5.length): " + distinct(a5, a5.length));
		System.out.println("distinct(a5, a5.length + 1): " + distinct(a5, a5.length + 1));
		System.out.println();
		
		//fillRandomDistinct 테스트
		System.out.println("fillRandomDistinct 테스트 ===");
		System.out.println("크기가 10인 배열 a");
		
		System.out.print("fillRandomDistinct(a, 10, generator): ");
		fillRandomDistinct(a, 10, generator);
		printArray(a, a.length);
		System.out.println("distinct?: " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, 100, generator): ");
		fillRandomDistinct(a, 100, generator);
		printArray(a, a.length);
		System.out.println("distinct?: " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, 1, generator): ");
		fillRandomDistinct(a, 1, generator);
		printArray(a, a.length);
		System.out.println("distinct?: " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, 0, generator): ");
		fillRandomDistinct(a, 0, generator);
		printArray(a, a.length);
		System.out.println("distinct?: " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, -1, generator): ");
		fillRandomDistinct(a, -1, generator);
		printArray(a, a.length);
		System.out.println("distinct?: " + distinct(a, a.length));
		
		System.out.println("크기가 1인 배열 a6");
		System.out.print("fillRandomDistinct(a6, 1, generator): ");
		fillRandomDistinct(a6, 1, generator);
		printArray(a6, a6.length);
		System.out.println("distinct?: " + distinct(a6, a6.length));
		
		System.out.println("크기가 0인 배열 a7");
		System.out.print("fillRandomDistinct(a7, 0, generator): ");
		fillRandomDistinct(a7, 0, generator);
		printArray(a7, a7.length);
		System.out.println("distinct?: " + distinct(a7, a7.length));
		System.out.println();
		
		//makeRandomArray 테스트
		System.out.println("makeRandomArray 테스트 ===");
		
		System.out.print("makeRandomArray(10, 10, generator): ");
		printArray(makeRandomArray(10, 10, generator), 10);
		
		System.out.print("makeRandomArray(10, 1, generator): ");
		printArray(makeRandomArray(10, 1, generator), 10);
		
		System.out.print("makeRandomArray(1, 10, generator): ");
		printArray(makeRandomArray(1, 10, generator), 1);
		
		System.out.print("makeRandomArray(1, 1, generator): ");
		printArray(makeRandomArray(1, 1, generator), 1);
		
		System.out.print("makeRandomArray(0, 1, generator): ");
		printArray(makeRandomArray(0, 1, generator), 0);
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
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	/*
	선형탐색 = 배열 x의 앞 n개의 index에 key값이 들어있는가
	@param x 주어진 배열
	@param n 배열 index의 길이
	@param key 찾고 싶은 값
	@return key가 x에 있는 경우, key의 인덱스를 반환(key가 x내에 여러 개 있는 경우 그 중 가장 작은 index를 반환)
					key가 x에 없는 경우, -1을 반환
	*/
	public static int linearSearch(int[] x, int n, int key){
		for (int i = 0; i <= n; i++) {
			if (key == x[i]) {
				return i;
			}
		}
		return -1;
	}
	/*
	배열의 앞 n개 방의 원소들이 서로 다른지를 검사하는 메소드
	@param a 배열
	@param n 배열에 앞 몇 개 방에서 중복 여부를 검사할 것인가
	@return true: 배열의 앞 n개 원소들이 모두 다른 경우
					false: 배열의 앞 n개 방에 중복된 원소가 있는 경우
	*/
	public static boolean distinct(int [] a, int n){
		boolean distinct = true;
		if(n > a.length){
			for(int i = 1; i < a.length; i++){
				if(linearSearch(a, i-1, a[i]) == -1){
				}
				else{
					distinct = false;
				}
			}
		}
		else{
			for(int i = 1; i < n; i++){
				if(linearSearch(a, i-1, a[i]) == -1){
				}
				else{
					distinct = false;
				}
			}
		}
		return distinct;
	}
	
	/*
	배열 list에 0이상 uBound 미만 서로 다른 정수 난수를 채워주는 메소드
	@param list 난수를 채울 배열
	@param uBound 난수의 최대값 + 1
	@generator 난수 발생기
	*/
	public static void fillRandomDistinct(int [] list, int uBound, Random generator){
		if(uBound < list.length){
			System.out.println("uBound >= list.length이어야 합니다. 배열의 내용이 변하지 않았습니다.");
		}
		else{
			for(int i = 0; i < list.length; i++){
				list[i] = generator.nextInt(uBound);
				for(int j = 0; j < i; j++){
					if(list[i] == list[j]){
						i--;
						break;
					}
				}
			}
		}
	}
	/*
	0이상 uBound 미만 정수 난수를 n번 발생시켜 이들을 배열에 저장한 후 배열을 가리키는 참조변수를 반환하는 메소드
	(중복가능)
	@param n 난수 갯수
	@param ubound 난수의 최대값 + 1
	@nenerator 난수 발생기
	*/
	public static int[] makeRandomArray(int n, int uBound, Random generator){
		int [] a = new int[n];
		if(n < 0){
			System.out.println("n >= 0이어야 합니다.");
		}
		else{
			for(int i = 0; i < a.length; i++){
			a[i] = generator.nextInt(uBound);
			}
		}
		return a;
	}
}