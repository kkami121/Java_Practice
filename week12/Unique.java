import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Unique {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] b = new String[100];
		
		String str2 = "";
		int count = 0;
		while(input.hasNext()){
			
			String str1 = input.next();
			b[count] = str1;
			count++;
			
		}
		List<String> list = new ArrayList<String>();
		for(int i=0; i< count; i++){
			if(!list.contains(b[i])){
				list.add(b[i]);
			}	
		}
		for(String i : list)
			System.out.println(i + " ");
	}
}
