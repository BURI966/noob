
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int to = sc.nextInt();
		
		
		ArrayList<String> str = new ArrayList<>();
		
		String temp;
		
		StringBuffer out = new StringBuffer();
		
		for(int i=0; i<to; i++) {
			str.add(sc.next());
		}
		
		
		
		String first = str.get(0);
		
		boolean all_same = true;
		
		for(int a = 0; a<first.length(); a++) {
		
			
			
			
			for(int i=1; i<str.size(); i++) {
				
				temp = str.get(i);
					
				if(first.charAt(a) != temp.charAt(a)) {
					all_same = false;
				}
			}
			
			
			
			
			if(all_same) {
				out.append(first.charAt(a));
			}
			else{
				out.append("?");
			}
			
			all_same = true;
		}
		
		sc.close();
		
		System.out.println(out.toString());
		
	}
}
