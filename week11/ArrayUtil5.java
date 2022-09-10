public class ArrayUtil5{
	public static void main(String[] args) {
		
		System.out.println("printArray 테스트 ===");
		
		int [] a = new int[10];
		for(int i = 0; i < a.length; i++){
			a[i] = i;
		}
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
}