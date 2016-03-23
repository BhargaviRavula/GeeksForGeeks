package stack;

import java.util.Stack;

public class postfix {
	public static void main(String args[]){	
		String postfix = "231*+9-";
		Stack<Integer> s = new Stack<>(); 
		for(int i=0; i < postfix.length(); i++){
			switch(postfix.charAt(i)){
			case '+': evaluate(s, postfix.charAt(i));break;
			case '-': evaluate(s, postfix.charAt(i));break;
			case '*': evaluate(s, postfix.charAt(i));break;
			case '/': evaluate(s, postfix.charAt(i));break;
			case '%': evaluate(s, postfix.charAt(i));break;
			default: s.push(Integer.parseInt(postfix.charAt(i)+""));
			}
		}
		System.out.println("The evaluated expression is "+ s.pop());
	}

	private static void evaluate(Stack<Integer> s, char c) {
		if(!s.empty()){
			int r = 0;
			int x = s.pop();
			if(!s.empty()){
				int y = s.pop();
				switch(c){
				case '+': r = x+y; break;
				case '-': r = -x+y; break;
				case '*': r = x*y; break;
				case '/' : r = x/y; break;
				case '%': r = x%y; break;
				default: break;
				}
				s.push(r);
			}else{
				System.out.println("The stack doesn't have sufficient operands ");	
			}
		}else{
			System.out.println("The stack is empty");
		}
	}
}
