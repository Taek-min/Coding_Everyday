import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		int students = sc.nextInt();
		int testPaper[][] = new int[students][10];
		boolean reTest[] = new boolean[students];
		Arrays.fill(reTest,true);
		for(int i = 0 ; i < students ; i++){
			for(int k = 0 ; k < 10; k++){
				testPaper[i][k] = sc.nextInt();
				if(((k)%5)+1!=testPaper[i][k])
					reTest[i]=false;
			}
			if(reTest[i]){
				System.out.println(i+1);				
			}
		}
	}
}