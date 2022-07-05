package test;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int to = Integer.parseInt(bf.readLine());
	
		StringTokenizer st;
		int a, b;
		int sum;
		
		for(int i = 0; i< to; i++) {
			st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = a+b;
			bw.write(sum+"\n");
		}
		
		bw.close();
		
	}
}
