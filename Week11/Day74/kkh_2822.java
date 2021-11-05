import java.util.*;

public class Main {
	public static void main(String[] args) {////엄청 깔꼼해~ : 2 : 3
		Scanner in = new Scanner(System.in);

		Integer[] point = new Integer[8];
		int[] sortPoint = new int[8];
		int[] topPoint = new int[5];
		
		for(int i = 0; i < 8; i++) {
			point[i] = in.nextInt();
			sortPoint[i] = point[i];
		}

		Arrays.sort(sortPoint);

		for(int i = 0; i < 5; i++) {
			topPoint[i] = Arrays.asList(point).indexOf(sortPoint[i + 3]) + 1;
		}

		Arrays.sort(topPoint);
		
		System.out.println(Arrays.stream(sortPoint).sum() - sortPoint[0] - sortPoint[1] - sortPoint[2]);
		for(int i = 0; i < topPoint.length; i++) {
			System.out.print(topPoint[i] + " ");
		}
	}
}