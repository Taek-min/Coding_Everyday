package algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//// 경우를 조금 더 단순히 나누면 코드가 더 간단해질 수 있을 거 같아요!
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int []arr = new int[3];
        int tol = 0;
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[1] - arr[0] > arr[2] - arr[1]) {
        	tol = arr[2] - arr[1];
        }
        else {
        	tol = arr[1] - arr[0];
        }
        for(int k = 0; k < 2; k++) {
        	int result = 0;
        	if(arr[k] + tol == arr[k+1]) {
        		if(arr[2] - arr[0] == 2*tol) {
        			result = arr[2] + tol;
        			System.out.println(result);
        			break;
        		}
        	}
        	else if(arr[2] - arr[0] != 2*tol ){
        		result = arr[k] + tol;
        		System.out.println(result);
        	}
        }
	}
}
