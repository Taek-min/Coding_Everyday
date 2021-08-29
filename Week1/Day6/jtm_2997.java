//// '백준에 제출해서 맞은 코드'로 제출해줘 package문 때문에 런타임 에러남
package algorithm;
import java.util.Arrays;
import java.util.Scanner;

//// 전체적으로 줄바꿈이 아예 없는데 맥락이 달라질때마다 조금씩 줄바꿈 해주면 더 가독성 좋을 것 같음
public class Main {
	//// 경우를 조금 더 단순히 나누면 코드가 더 간단해질 수 있을 거 같아요! :33 지금은 읽기 너무 어려워요
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //// arr, tol 등의 변수 이름에서는 아무 정보도 얻을 수 없어 sequence(수열) 식으로 꼭 의미있는 이름을 지어줘
        int []arr = new int[3];
        //// 얘도 difference 등으로 지어주면 좋았겠고
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
