import java.util.Random;
import java.util.Scanner;

class Search{
	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 2, 5};
		System.out.print("배열 a: ");
		printArray(a, a.length);
		
		System.out.println("linearSearch 테스트 ===");
		System.out.println("linearSearch(a, a.length, 5): " + linearSearch(a, a.length, 5));
		System.out.println("linearSearch(a, 1, 1): " + linearSearch(a, 1, 1));
		System.out.println("linearSearch(a, 4, 5): " +	linearSearch(a, 4, 5));
		System.out.println("linearSearch(a, 1, 2): " + linearSearch(a, 1, 2));
		System.out.println("linearSearch(a, a.length, 2): " + linearSearch(a, a.length, 2));
		System.out.println("linearSearch(a, 0, 5): " + linearSearch(a, 0, 5));
		System.out.println("linearSearch(a, a.length, 4): " + linearSearch(a, a.length, 4));
		System.out.println();
		
		System.out.println("binarySearch 테스트 ===");
		System.out.print("InsertionSort.sort(a, a.length): ");
		sort(a, a.length);
		printArray(a, a.length);
		System.out.println();
		
		System.out.println("binarySearch(a, a.length, 5): " + binarySearch(a, a.length, 5));
		System.out.println("binarySearch(a, 1, 1): " + binarySearch(a, 1, 1));
		System.out.println("binarySearch(a, 4, 5): " +	binarySearch(a, 4, 5));
		System.out.println("binarySearch(a, 1, 2): " + binarySearch(a, 1, 2));
		System.out.println("binarySearch(a, a.length, 2): " + binarySearch(a, a.length, 2));
		System.out.println("binarySearch(a, 0, 5): " + binarySearch(a, 0, 5));
		System.out.println("binarySearch(a, a.length, 4): " + binarySearch(a, a.length, 4));
		System.out.println();
	}
	/*
	이진 탐색 메소드
	전제조건 : 배열 x가 이미 오름차순으로 정렬되어 있어야 한다.
	@param x 정렬된 정수 배열
	@param n 배열 x에 들어 있는 데이터 개수
	@param key 찾을 데이터
	
	@return x베열 안에서 key가 들어 있는 인덱스 번호 반환
					key가 없다면 -1 반환
	*/
	public static int binarySearch(int[] x, int n, int key){
		int first = 0;
		int last = n - 1;
		int mid;
		
		while(first <= last){
			mid = (first + last) / 2;
			if(key == x[mid]){
				return mid;
			}
			else{
				if(key < x[mid]){
					last = mid - 1;
				}
				else{
					first = mid + 1;
				}
			}
		}
		return -1;
	}
	
	
	/*
	n > a.length 인 경우에는 a,length개의 원소를 출력.
	n < 0 인 경우에는 아무 것도 출력하지 않는다.
	
	@param a 배열
	@param n 출력할 원소의 개수
	*/
	public static void printArray(int[] a, int n){
		if(n > a.length){
			for(int i = 0; i < n; i++){
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
	선형탐색 = 배열 x의 앞 n개의 index에 key값이 들어있는가
	@param x 주어진 배열
	@param n 배열 index의 길이
	@param key 찾고 싶은 값
	@return key가 x에 있는 경우, key의 인덱스를 반환(key가 x내에 여러 개 있는 경우 그 중 가장 작은 index를 반환)
					key가 x에 없는 경우, -1을 반환
	*/
	public static int linearSearch(int[] x, int n, int key){
		for (int i = 0; i < n; i++) {
			if (key == x[i]) {
				return i;
			}
		}
		return -1;
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
}