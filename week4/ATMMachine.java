package week4;
import java.util.Scanner;
/*
사용자에게 메뉴를 보여주고 사용자 입력에 따라 작동하는 ATM 기계 프로그램
@author 박귀열
*/
public class ATMMachine{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double money = 5000;
		
		System.out.println("ATM 프로그램입니다. 번호를 입력하세요.");
		System.out.println("잔액 확인: \t1");
		System.out.println("현금 인출: \t2");
		System.out.println("입금: \t\t3");
		System.out.println("종료: \t\t4");
		System.out.print("번호 선택: ");
		
		int number = input.nextInt();
		
		switch(number){
			case 1:
				System.out.printf("잔액은 %.1f원입니다. ", money);
				break;
				
			case 2:
				System.out.print("얼마를 인출하시겠습니까? ");
				int withdraw = input.nextInt();
				if(money < withdraw){
					System.out.println("돈이 모자랍니다.");
					System.out.printf("잔액은 %.1f원입니다. ", money);
				}
				else{
					System.out.println("돈을 받으세요.");
					System.out.printf("잔액은 %.1f원입니다. ", (money - withdraw));
				}
				break;
				
			case 3:
				System.out.print("금액은? ");
				int deposit = input.nextInt();
				System.out.printf("잔액은 %.1f원입니다. ", (money + deposit));
				break;
				
			case 4:
				System.out.print("감사합니다.");
				break;
				
			default : 
				System.out.println("올바르지 않은 번호입니다.");
		}
		
	}
}