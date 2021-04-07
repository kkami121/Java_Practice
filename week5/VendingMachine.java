package week5;
import java.util.Scanner;
/*
커피, 아스이크림, 자판기 프로그램.
사용자에게 메뉴를 보여주고 사용자 입력에 따라 작동하는 프로그램
돈 계산 기능은 아직 없음.
main 매소드 하나로 구현
@author 박귀열
*/
public class VendingMachine{
	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		System.out.println("아이스크림, 커피, 음료를 파는 자판기입니다.");
		while(true){
	
			System.out.println(" ");
			System.out.println("어떤 종류를 원하십니까?.");
			System.out.println("아이스크림:        1");
			System.out.println("커피:            2");
			System.out.println("음료:            3");
			System.out.println("종료:            4");
			System.out.print("번호 선택:  ");
			
			int number = input.nextInt();
			
			switch(number){
				case 1:
					System.out.println(" ");
					System.out.println("무엇을 드시겠습니까?.");
					System.out.println("바닐라 아이스크림(1000원):     1");
					System.out.println("아몬드 아이스크림(1400원):     2");
					System.out.println("딸기 아이스크림(1400원):      3");
					System.out.println("호두 아이스크림(1400원):      4");
					System.out.print("번호 선택:  ");
					
					int number2 = input.nextInt();
					switch(number2){
						case 1:
							System.out.printf("%d 선택, 감사합니다. \n", number2);
							break;
						case 2:
							System.out.printf("%d 선택, 감사합니다. \n", number2);
							break;
						case 3:
							System.out.printf("%d 선택, 감사합니다. \n", number2);
							break;
						case 4:
							System.out.printf("%d 선택, 감사합니다. \n", number2);
							break;
					}
					break;

				case 2:
					System.out.println(" ");
					System.out.println("무엇을 드시겠습니까?.");
					System.out.println("아메리칸(1000원):       1");
					System.out.println("카페라떼(1400원):       2");
					System.out.println("에스프레소(1400원):      3");
					System.out.print("번호 선택:  ");
					
					int number3 = input.nextInt();
					switch(number3){
						case 1:
							System.out.printf("%d 선택, 감사합니다. \n", number3);
							break;
						case 2:
							System.out.printf("%d 선택, 감사합니다. \n", number3);
							break;
						case 3:
							System.out.printf("%d 선택, 감사합니다. \n", number3);
							break;
					}
					break;

				case 3:
					System.out.println(" ");
					System.out.println("무엇을 드시겠습니까?.");
					System.out.println("생수(1000원):           1");
					System.out.println("오렌지쥬스(1400원):       2");
					System.out.println("망고쥬스(1400원):        3");
					System.out.println("우유(1400원):           4");
					System.out.print("번호 선택:  ");
					
					int number4 = input.nextInt();
					switch(number4){
						case 1:
							System.out.printf("%d 선택, 감사합니다. \n", number4);
							break;
						case 2:
							System.out.printf("%d 선택, 감사합니다. \n", number4);
							break;
						case 3:
							System.out.printf("%d 선택, 감사합니다. \n", number4);
							break;
						case 4:
							System.out.printf("%d 선택, 감사합니다. \n", number4);
							break;
					}
					break;

				case 4:
					System.out.println("감사합니다. 거래를 종료합니다.");
					System.exit(0);
					break;

				default : 
					System.out.println("올바르지 않은 번호입니다.");
			}
		}
	}
}