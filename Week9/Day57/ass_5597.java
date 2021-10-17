import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int students[] = new int [31];
		int check;
		for(int i = 0 ; i < 28 ; i++){
			check = sc.nextInt();
			students[check] = 1;
		}
		for(int k = 1 ; k < 31 ; k++){
			if(students[k] == 0){
				System.out.println(k);
			}
		}
	}
}