package stack;

import java.util.Arrays;

public class twostacksinanarray{
	
	static int[] twostacks = new int[20];
	static int stack1Pointer=-1;
	static int stack2Pointer=twostacks.length;
	
	
	static void push1(int x){
		if((stack1Pointer >= -1) && (stack1Pointer < stack2Pointer)){
			stack1Pointer++;
			twostacks[stack1Pointer] = x; 
		}
	}
	
	static void pop1(){
		if(stack1Pointer != -1){
			twostacks[stack1Pointer] = 0; 
			stack1Pointer--;
		}else{
			System.out.println("No elements in the stack1 ");
		}
	}
	
	static void push2(int x){
		if((stack2Pointer <= 20) && (stack2Pointer > stack1Pointer)){
			stack2Pointer--;
			twostacks[stack2Pointer] = x; 
		}
	}
	
	static void pop2(){
		if(stack2Pointer != 20){
			twostacks[stack2Pointer] = 0; 
			stack2Pointer++;
		}else{
			System.out.println("No elements in the stack2 ");
		}
	}
	
	public static void main(String args[]){
		push1(1);
		push2(2);
		pop1();
		push1(3);
		push2(4);
		pop1();
		pop1();
		push1(5);
		push1(6);
		pop2();
		push2(7);
		System.out.println(Arrays.toString(twostacks));
	}
}
