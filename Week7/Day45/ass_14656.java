import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int students = scan.nextInt();
		int order[] = new int [students];
		int smashing = 0;
		for(int i = 0; i<students; i++){
		    order[i] = scan.nextInt();
		    if(order[i] != i+1){
		        smashing++;
		    }
		}
		System.out.println(smashing);
	}
}