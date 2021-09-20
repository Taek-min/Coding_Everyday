package Day29;

import java.util.Scanner;

public class shm_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			if(num == -1)
				break;
			
			int[] arr = new int[num]; 
			int sum = 0;		
			int index = 0;		
			for(int i=1; i<num; i++) {
				if(num%i == 0) {		
					arr[index++] = i;	
					sum += i;			
				}
			}
			
			if(sum != num) {
				System.out.println(n + " is NOT perfect.");
				continue;
			}
			
			System.out.print(num + " = ");
			for(int i=0; i<index; i++) {
				if(i == index-1)
					System.out.print(arr[i]);
				else
					System.out.print(arr[i] + " + ");
			}
			System.out.println();
		}
	}
}