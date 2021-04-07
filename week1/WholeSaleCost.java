package week1;
public class WholeSaleCost {

    public static void main(String args[]){
				
			
		double coverPrice = 24.95;
		double discountRate = 0.4;
		double initialShippingCost = 3;
		double addtionalShippingCost = 0.75;
		double quantity = 60;
		double initialquantity = 1;
		double addtionalquantity = 59;
	
		double discountPrice = coverPrice * discountRate;
		double actuallycoverPrice = coverPrice - discountPrice;
	
		double allPrice = (actuallycoverPrice * quantity) + (initialShippingCost * initialquantity) + (addtionalShippingCost * addtionalquantity);

        System.out.printf("총 구매 가격은 %.3f입니다.", allPrice);
        
    }
    
}
