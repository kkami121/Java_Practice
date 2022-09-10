import java.util.Random;
import java.util.Scanner;

public class MemoryGame{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Seed: ");
		long seed = input.nextLong();
		Random generator = new Random(seed);
		
		int[] list;
		int listLength;
		
		System.out.print("몇 개의 정수들을 보시겠습니까? ");
		listLength = input.nextInt();
		
		list = new int[listLength];
		fillRandomDistinct(list, 100, generator);
		
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i]);
		}
		
		System.out.print("1을 입력하면 숫자를 감춥니다. ");
		input.nextInt();
		for(int i = 0; i < 100; i++){
			System.out.println();
		}
		
		System.out.println("어떤 숫자들이 있었는지 맞춰보세요.");
		System.out.println("입력을 끝내려면 음수를 입력하세요.");
		
		int [] answer = new int [100];
		boolean end = true;
		int i = 0;
		while(end){
			int n = input.nextInt();
			answer[i] = n;
			i++;	
			if(n == -1){
				end = false;
			}
		}
		System.out.println(checkAnswers(list, answer, i+1) + "개 맞췄습니다.");
		
		
	}
	/*
	사용자가 입력한 정수들이 list에 몇 개나 들어 있는지 알아보는 메소드
	
	@param list 서로 다른 난수가 들어 있는 배열
	@param answer 사용자가 입력한 정수가 들어 있는 배열
	@param answerNumber answer에 들어 있는 정수 개수
	@return list == answer의 개수
	*/
	public static int checkAnswers(int[] list, int[] answer, int answerNumber){
		int count = 0;
		for(int i = 0; i < answerNumber; i++){
			if(linearSearch(list, list.length, answer[i]) == -1){
				
			}
			else{
				count++;
			}
		}
		return count;
		
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