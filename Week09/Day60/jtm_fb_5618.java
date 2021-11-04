import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int min = 0;
		int[] arr= new int[3];
		int n = sc.nextInt();
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(min < arr[i]) {
				min = arr[i]; //max보다 min이 맞는거 같아요 : 럴수있지. 2
			}
		}
		
		for (i = 1; i <= min; i++) {
	        int cnt = 0;
	        for (j = 0; j < n; j++) {
	            if (arr[j] % i == 0) { cnt++;}
	        }
	        if (cnt == n)
	            System.out.println(i);
	    }
	}
}