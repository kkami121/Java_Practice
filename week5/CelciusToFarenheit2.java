package week5;
/*
섭씨 온도를 화씨 온도로 바꿔주는 프로그램
섭씨 온도는 -40 ~ 100까지
@author 박귀열
*/
public class CelciusToFarenheit2{
	public static void main(String[] args){
		
		double farenheit;
		for(int i = -40; i <= 100; i+=5){
			farenheit = conver(i);
			System.out.printf("C = %d --> %.1f \n", i, farenheit);
			
		}
	}
	/*
	섭씨 온도를 화씨 온도로 변환하는 메소드
	@param c : 섭씨 온도
	*/
	public static double conver(double c){
		double f = c * 9.0 / 5.0 + 32.0;
		return f;
	}
}