package stack;

import java.util.Scanner;
import java.util.Stack;

public class reversestring {

	public static void main(String args[]) {
		System.out.println("Enter the string you want to reverse");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		sc.close();
		Stack <Character> reverse = new Stack<>();
		
		for(int i=0; i< s.length(); i++){
			reverse.push(s.charAt(i));
		}
		
		while(!reverse.isEmpty()){
			System.out.print(reverse.pop());
		}

	}
}
