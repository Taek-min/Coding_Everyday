package Day6;
import java.util.Scanner;
public class kcm_fb_2997 {
	
	static int[] sort(int arr[]) {
		for(int i =0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] >= arr[i]) {	
					int max = arr[j];
					arr[j] = arr[i];
					arr[i] = max;			
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[3]; 
		for(int i =0; i < num.length; i++) {
			num[i] = in.nextInt();
		}
		//// 이부분을 함수로 만들어주면 어떨까요?? :22 sort 함수로 따로 뺐으면 깔꼼했을듯
		//// 정렬 직접 구현한 점 리스펙
		sort(num);
		
		if(num[0] - num[1] == num[1] - num[2]) {
			System.out.println(num[0] + (num[0] - num[1]));
		}
		else if(num[0] - num[1] > num[1] - num[2]) {
			//if(num[1] + 2 * (num[1] - num[2]) == num[0]) { //// 이건 어떤걸 판단해주기 위한 if문이에요?? :22 이거는 등차수열인지 확인하려고 넣엇는데 안넣어도 되네요 ?
			System.out.println(num[1] + num[1] - num[2]);
			//}
		}
		else if(num[0] - num[1] < num[1] - num[2]) {
			//if(num[1] - 2*(num[0] - num[1]) == num[2]) {
			System.out.println(num[1] -(num[0] - num[1]));
			//}
		}	
	}
}
