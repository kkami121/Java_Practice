

public class StringBuilderTest {
    public static void main(String[] args){

        StringBuilder builder = new StringBuilder();
        String string = "여름 ";
        String r = "";
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append("여름 ");
        }
        String result = builder.toString();
        endTime = System.currentTimeMillis();

        System.out.println("StringBuilder 시간: " + (endTime - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            r = string + string;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 시간: " + (endTime - startTime) + "ms");
    }
}
