import java.util.Random;
import java.util.Scanner;

class Search6{
	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 2, 5};
		System.out.println("배열 a: ");
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
}