import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String scale1[] = {"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};
		String scale2[] = {" ","Bb","Cb","B#","Db"," ","Eb","Fb","E#","Gb"," ","Ab"};
		
		while(true) {
			String testScale = in.nextLine();
			if(testScale.equals("***")) {
				break;
			}
			String scales[] = testScale.split(" ");
			int[] scaleIndex = new int[scales.length];
			int upDown = in.nextInt();
			in.nextLine();
			for(int i = 0; i < scales.length; i++) {
				if(Arrays.asList(scale1).indexOf(scales[i]) >= 0) {
					scaleIndex[i] = Arrays.asList(scale1).indexOf(scales[i]) + upDown;
				}
				else {
					scaleIndex[i] = Arrays.asList(scale2).indexOf(scales[i]) + upDown;
				}
			}
			
			for(int j = 0; j < scaleIndex.length; j++) {
				if(scaleIndex[j] < 0) {
					scaleIndex[j] = 12 + scaleIndex[j];
				}
				else if(scaleIndex[j] > 11) {
					scaleIndex[j] = scaleIndex[j] - 12;
				}
				System.out.print(scale1[scaleIndex[j]] + " ");
			}
			System.out.println();
		}
	}
}
