import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int max = 0;
		int[] arr= new int[3];
		int n = sc.nextInt();
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		for (i = 1; i <= max; i++) {
	        int cnt = 0;
	        for (j = 0; j < n; j++) {
	            if (arr[j] % i == 0) { cnt++;}
	        }
	        if (cnt == n)
	            System.out.println(i);
	    }
	}
}


