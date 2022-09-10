package week7;

public class TurtleDrive6 {
    public static void main(String[] args) {
    	
    	// 캔버스 크기 
    	final int CANVAS_WIDTH = 500; // 픽셀 단위
    	final int CANVAS_HEIGHT = 500; // 픽셀 단위
    	
    	// 이동 거리는 픽셀 단위로 표시한다.
        final double STEP = 100.0;	// 한 번 움직일 때의 이동 거리
        // 회전하는 정도는  각도 단위로 표시한다.
        final double ANGLE = 360.0 / 5;	// 한 번 회전할 때의 회전 각도
        
        // 캔버스 크기 설정
        Turtle.setCanvasSize(CANVAS_WIDTH,  CANVAS_HEIGHT);
        
        // 구성자를 실행하여 거북이 인스턴스를 하나 구성한다.
        // (0, 0) 위치에 있는 Turtle 인스턴스 하나를 구성한다.
        // 캔버스 한 가운데 좌표가 (0, 0)이다. 
        // 오른쪽으로 갈 수록 x좌표가 증가하고, 아래로 내려올수록 y좌표가 증가한다.
        // Turtle 인스턴스는 처음 만들어지면 오른쪽을 바라보고 있는 상태로 만들어진다.
        Turtle turtle  = new Turtle(0, 0);	
        
        // 아래에서 Turtle 타입 객체인 turtle에게 여러 가지 메소드를 호출한다(일을 시킨다).
        
        turtle.speed(500.0);	// 거북이가 움직이는 속력을 지정한다. (miliseconds 단위)
        
        for(int i = 0; i < 3; i++){
            drawNgon(turtle, 4, STEP);
            turtle.right(360 / 3);
        }
    }
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
