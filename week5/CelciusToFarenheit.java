package week5;
/*
섭씨 온도를 화씨 온도로 바꿔주는 프로그램
섭씨 온도는 -40 ~ 100까지
@author 박귀열
*/
public class CelciusToFarenheit{
	public static void main(String[] args){
		for(int i = -40; i <= 100; i+=5){
			System.out.printf("C = %d --> ", i);
			converAndPrint(i);
		}
	}
	/*
	섭씨 온도를 화씨 온도로 변환하고 결과를 출력하는 메소드
	@param c : 섭씨 온도
	*/
	public static void converAndPrint(double c){
		double f = c * 9.0 / 5.0 + 32.0;
		System.out.println(f);
	}
}