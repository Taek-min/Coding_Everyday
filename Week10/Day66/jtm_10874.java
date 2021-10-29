import java.util.Scanner;

//// (x%5+1) 사실 1234512345인걸 깨달았다면 더 간단하게 풀었을듯요 
//// 다음 링크처럼 맥락 바뀔때마다 줄바꿈 해주면 가독성이 좀 더 좋아져요 https://pastebin.com/SxcbfZm7
public class Main
{
	public static void main(String[] args) {////굳굳  :2
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int[] answer= new int[11];
		for(int i = 1; i <= students; i++){
			boolean retest = true;
			for (int j = 1; j <= 10; j++){
				answer[j] = sc.nextInt();
				if (answer[j] != (j-1) % 5 + 1) {
					retest = false;
				}
		    }
		    if (retest == true) {
		        System.out.println(i);
		    } 
		}
	}
}


