
import java.util.*;

public class nextgreatestnumber {

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
		int max[] = new int[size];
		
		for(int j =0; j < size; j++){
			int temp = array[j];
			for(int k= j; k < size; k++){
				if(temp < array[k]){
					temp = array[k];
					break;
				}
			}
			if(temp == array[j]){
				max[j] = -1;
			}else{
				max[j] = temp;
			}
		}
		System.out.println("The next greatest elements are: ");
		for(int l=0; l < size; l++){
			System.out.println(array[l] + " --> " + max[l]);
		}
	}

}
