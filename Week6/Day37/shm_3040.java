import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = -100;
		int dwarf[] = new int[9];
		int fake1 = 0;
		int fake2 = 0;
		
		for(int i = 0; i < dwarf.length; i++) {
			dwarf[i] = sc.nextInt();
			total += dwarf[i];
		}
		for(int i = 0; i < dwarf.length; i++) {
			for(int j = 1; j < dwarf.length; j++) {
				if(total == dwarf[i] + dwarf[j]) {
					fake1 = i;
					fake2 = j;
				}
			}
		}
		for(int i = 0; i < dwarf.length; i++) {
			if(i == fake1 || i == fake2) {
				continue;
			}
			else {
				System.out.println(dwarf[i]);
			}
		}
	}
}