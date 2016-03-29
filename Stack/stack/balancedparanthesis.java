package stack;

import java.util.Stack;

public class balancedparanthesis {

	public static void main(String[] args) {

		Stack<Character> s = new Stack<>();
		String input = ")[]()()";
		
		for(int i=0; i < input.length(); i++){
				
				if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '['){
					s.push(input.charAt(i));
				}else{
					if(!s.isEmpty()){
						s.pop();
					}
				}

			}	
		
		if(s.empty() && (input.charAt(0) != ')' && input.charAt(0) != '}' && input.charAt(0) != ']')){
			System.out.println("Balanced expression ");
		}else{
			System.out.println("Not balanced");
		}

	}

}
