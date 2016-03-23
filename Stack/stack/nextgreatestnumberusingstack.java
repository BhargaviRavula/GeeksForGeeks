package stack;
import java.util.*;

public class nextgreatestnumberusingstack {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements :");
		for(int i =0; i < size; i++){
			array[i] = sc.nextInt();
		}
		sc.close();

		Stack<Integer> s = new Stack<>();
		s.push(array[0]);
		for(int j =1; j < array.length; j++){
			if(!s.isEmpty()){
				while(!s.isEmpty() && s.peek() < array[j]){
					System.out.println(s.peek() +"'s greater element is " + array[j]);
					s.pop();
				}

				s.push(array[j]);
			}else{
				s.push(array[j]);
			}

		}

		while(!s.empty()){
			System.out.println(s.pop() +"'s greater element is " + "-1");
		}

	}
}



