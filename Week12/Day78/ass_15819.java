import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int handle = sc.nextInt();
		int handleIndex = sc.nextInt();      
		String handlename[] = new String[handle];
		sc.nextLine();
		for (int i = 0; i < handle; i++) {
			handlename[i] = sc.nextLine();
		}
		
		Arrays.sort(handlename);
		System.out.println(handlename[handleIndex -1]);
	}
}