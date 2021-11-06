import java.util.*;

public class Main{ //// 잘푸네 성수 :2 : 3 : 4
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int point[] = new int[8];
		int pointArray[] = new int[8];
		int maxIndex[] = new int [5];
		
		for (int i = 0; i < 8; i++){
			point[i] = sc.nextInt();
			pointArray[i] = point[i];
		}
		
		int num = 0;
		Arrays.sort(pointArray);
		for (int k = 3; k < 8; k++){
			for (int i = 0; i < 8; i++){
				if(pointArray[k]==point[i]){
					maxIndex[num] = i+1;
					num++;
					break;
				}
			}
			total+=pointArray[k];
		}
		
		System.out.println(total);
		Arrays.sort(maxIndex);
		for(int k = 0 ; k < 5 ; k++){
			System.out.println(maxIndex[k]);
		}
	}
}