package week3;
public class ThreeMultiples{
	
	public static void main(String[] args){
		
		int i;
		int sum = 0;
		int sum2 = 0;
		
		for(i = 0; i <= 100; i++){
			if(i % 3 == 0){
				sum = i + sum;
			}
			
		}
		
		for(i = 0; i <= 100; i+=3){	
			sum2 = i + sum2;
		}

		System.out.println("i를 1씩 증가시키면서 i가 3의 배수일 때만 더하는 방식으로 계산");
		System.out.printf("1 이상 100 이하 3의 배수들의 합 = %d \n", sum);
		
		System.out.print("\n");
		
		System.out.println("i를 3씩 증가시키면서 i를 더하는 방식으로 계산");
		System.out.printf("1 이상 100 이하 3의 배수들의 합 = %d", sum2);
			
		
	}
}