import java.util.Scanner;

public class Main {
	public static void main(String[] args) { //// 반성합니다 :잘해썽요~
		Scanner in = new Scanner(System.in);
		int old = 2011;
		int oldIndex = 0;
		int young = 1989;
		int youngIndex = 0;
		int humans = in.nextInt();
		in.nextLine();
		String privacy[][] = new String[humans][4];
		
		for(int i = 0; i < privacy.length; i++) {
			privacy[i] = in.nextLine().split(" ");
			if(Integer.parseInt(privacy[i][3]) < old) {
				old = Integer.parseInt(privacy[i][3]);
				oldIndex = i;
			}
			else if(Integer.parseInt(privacy[i][3]) == old) {
				if(Integer.parseInt(privacy[i][2]) < Integer.parseInt(privacy[oldIndex][2])) {
					oldIndex = i;
				}
				else if(Integer.parseInt(privacy[i][2]) == Integer.parseInt(privacy[oldIndex][2])) {
					if(Integer.parseInt(privacy[i][1]) == Integer.parseInt(privacy[oldIndex][1])) {
						oldIndex = i;
					}
				}
			}
			
			if(Integer.parseInt(privacy[i][3]) > young) {
				young = Integer.parseInt(privacy[i][3]);
				youngIndex = i;
			}
			else if(Integer.parseInt(privacy[i][3]) == young) {
				if(Integer.parseInt(privacy[i][2]) < Integer.parseInt(privacy[youngIndex][2])) {
					youngIndex = i;
				}
				else if(Integer.parseInt(privacy[i][2]) == Integer.parseInt(privacy[youngIndex][2])) {
					if(Integer.parseInt(privacy[i][1]) == Integer.parseInt(privacy[youngIndex][1])) {
						youngIndex = i;
					}
				}
			}
		}

		System.out.println(privacy[youngIndex][0]);
		System.out.println(privacy[oldIndex][0]);
	}
}
