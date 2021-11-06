import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int classX = sc.nextInt();
		
		for(int i = 1 ; i <= classX ; i++){
			int students = sc.nextInt();
			int point[] = new int[students];

			for(int k = 0 ; k < students ; k++){
				point[k] = sc.nextInt();
			}
			Arrays.sort(point);
            int gap = 0;
      
			for(int j = 1; j < point.length; j++) {
				if(gap < point[j] - point[j-1]) {
					gap = point[j] - point[j-1];
				}
			}
			System.out.println("Class " + i);
			System.out.println("Max " + point[students-1] + ", Min " + point[0] + ", Largest gap " + gap);
		}
	}
}