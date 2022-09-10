package week1;
public class SphereVolume {

    public static void main(String args[]){
			
        double r = 5.0;
        double volume = 4.0 / 3.0 * Math.PI * r * r * r;

        System.out.println("구의 부피는 " + volume +"입니다.");
        System.out.printf("구의 부피는 %.2f입니다.", volume);
        
    }
    
}
