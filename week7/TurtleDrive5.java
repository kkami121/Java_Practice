package week7;

public class TurtleDrive5 {
    /*
    정다각형을 구현하는 메소드
    ex) n = 4 : 정사각형, n = 3 : 정삼각형
    @param t 다각형을 그리는데 이용하는 거북이
    @param n 몇각형을 그릴 것인가?
    @param step 다각형의 한 변의 길이
    */
    public static void drawNgon(Turtle t, int n, double step){
        for(int i = 0; i < n; i++){
            t.forward(step);
            t.left(360 / n);
        }
    }
}
