package stack;

import java.util.Stack;

public class infixtopostfix {

	public static void main(String[] args) {


		String infix = "a+b*(c^d-e)^(f+g*h)-i";
		Stack<Character> s = new Stack<>();

		for(int i=0; i < infix.length(); i++){
			char c=infix.charAt(i);
			switch(infix.charAt(i)){
			case '+': perform(infix, s, i, c);
			break;

			case '*': perform(infix, s, i, c);
			break;
			case '-': perform(infix, s, i, c);
			break;
			case '/': perform(infix, s, i, c);
			break;
			case '(': s.push(infix.charAt(i));
			break;
			case ')': while(!s.empty() && (s.peek() != '(')){
				System.out.print(s.pop());
			}
			break;
			case '%': perform(infix, s, i, c);
			break;
			case '^': perform(infix, s, i,c);
			break;
			default:
				System.out.print(infix.charAt(i));
			}
		}


		while(!s.isEmpty())
		{
			if(s.peek()!= '(' && s.peek() != ')'){
				System.out.print(s.pop());	
			}else{
				s.pop();
			}
			
		}




	}

	private static void perform(String infix, Stack<Character> s, int i, char c) {
		if(s.isEmpty()){
			s.push(infix.charAt(i));
		}
		else{
			if(s.peek()>c){
				while(!s.empty() && (s.peek()>c )){
					System.out.print(s.pop());
				}
				s.push(c);
			}else{
				s.push(infix.charAt(i));
			}
		}
	}

}
