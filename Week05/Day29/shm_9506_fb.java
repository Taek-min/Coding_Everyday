import java.util.Scanner;
public class shm_9506 { //// 깔끔. : 22 누룽이보다 코딩 잘하네 ㅋ : 33
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			if(num == -1)
				break;
			
			int[] arr = new int[num]; 
			int sum = 0;		
			int index = 0;		
			for(int i=1; i<num; i++) { //// 이런 방법 배워갑니다.
				if(num%i == 0) {		
					arr[index++] = i;	
					sum += i;			
				}
			}
			
			if(sum != num) {
				System.out.println(n + " is NOT perfect.");
				continue;
			}
			
			System.out.printf("%d = ", num);
			for(int i=0; i<index; i++) {
				if(i == index-1)
					System.out.printf("%d", arr[i]);
				else
					System.out.printf("%d + ", arr[i]);
			}
			System.out.println();
		}
	}
}