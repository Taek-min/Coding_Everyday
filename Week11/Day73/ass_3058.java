import java.util.*;

//// for과 ( 사이에 띄어쓰기를 하나 한다던지,
//// 맥락이 바뀔때마다 줄바꿈을 한다던지 하는 국룰(자바 코딩 컨벤션 가이드)이 있습니다. 깔끔한 코드를 위해 되도록 준수하는걸 권장해요 : ㅎㅎ 
//// 국룰대로 바꾼 코드 예 => https://pastebin.com/AXYjLGEY
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int nums[] = new int [7];
		for(int i = 0 ; i < loop ; i++){
			int min = 100;
			int add = 0;
			for(int k = 0 ; k < 7 ; k++){ //// i, j, k 순으로 쓰는게 국룰
				nums[k] = sc.nextInt();
				if(nums[k]%2==0){
					if(min > nums[k]) min = nums[k];
					add += nums[k];
				}
				////이거 for문 끝나고 출력해줘도 되는거 아닌교? :2 :3
				if(k==6) System.out.printf("%d %d\n",add, min);
			}
		}
	}
}
