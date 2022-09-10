import java.util.Random;
import java.util.Scanner;

public class UnionIntersection{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Seed: ");
		long seed = input.nextLong();
		Random generator = new Random(seed);
		
		System.out.print("배열 1 크기: ");
		int n1 = input.nextInt();
		int [] a1 = new int[n1]; 
		
		System.out.print("배열 2 크기: ");
		int n2 = input.nextInt();
		int [] a2 = new int[n2]; 
		
		System.out.print("최대난수: ");
		int ubound = input.nextInt();
		
		int [] union = new int[n1 + n2];
		int unionSize;
		
		int [] intersection = new int[n1];
		int intersectionSize;
		
		
		fillRandomDistinct(a1, ubound, generator);
		System.out.print("배열1: ");
		printArray(a1, a1.length);
		if(!distinct(a1, a1.length)){
			System.out.println("중복 발견");
		}
		
		fillRandomDistinct(a2, ubound, generator);
		System.out.print("배열2: ");
		printArray(a2, a2.length);
		if(!distinct(a2, a2.length)){
			System.out.println("중복 발견");
		}
		
		unionSize = unionArrays(a1, a2, union);
		System.out.print("Union: ");
		printArray(union, unionSize);
		if(!distinct(union, unionSize)){
			System.out.println("중복 발견");
		}
		
		intersectionSize = intersectionArrays(a1, a2, intersection);
		System.out.print("Intersection: ");
		printArray(intersection, intersectionSize);
		if(!distinct(intersection, intersectionSize)){
			System.out.println("중복 발견");
		}
	}
	/*
	배열 a1과 a2의 합집합을 구하는 메소드
	@param a1 배열
	@param a2 배열
	@return 합집합 원소의 개수
	*/
	public static int unionArrays(int[] a1, int[] a2, int[] union){
		int i = 0;
		for(i = 0; i < a1.length; i++){
			union[i] = a1[i];
		}

		for(int k = 0; k < a2.length; k++){
			if(linearSearch(a1, a1.length, a2[k]) == -1){
				union[i] = a2[k];
				i++;
			}
		}
		return i;
	}
	/*배열 a1과 a2의 교집합을 구하는 메소드
	@param a1 배열
	@param a2 배열
	@return 교집합 원소의 개수
	*/
	public static int intersectionArrays(int[] a1, int[] a2, int[] intersection){
		int j = 0;
		for(int i = 0; i < a1.length; i++){
			if(linearSearch(a2, a2.length, a1[i]) == -1){
				
			}
			else{
				intersection[j] = a1[i];
				j++;
			}
		}
		return j;
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
}