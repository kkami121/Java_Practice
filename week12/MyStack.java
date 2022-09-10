import java.util.*;

public class MyStack {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line;
		String[] mystack = new String[1000];
		int top = -1;


		while (input.hasNextLine()) {

			line = input.nextLine();
			String[] lineToken = line.split(" ");
			for (int i=0; i<lineToken.length; i++) {
				mystack[++top] = lineToken[i];
				if(mystack[0].equals("*") == true){
					mystack[top] = mystack[top];
					--top;
				}
				else if(mystack[top].equals("*") == true){
					mystack[top] = mystack[top];
					--top;
					--top;
				}
			}
			while(top >= 0){
				System.out.print(mystack[top--] + " ");
			}
				System.out.println();
		}

		input.close();
	}
}
