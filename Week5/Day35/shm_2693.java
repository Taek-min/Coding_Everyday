import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// int loop = Integer.parseInt(sc.nextLine()); 요래도 됨
		int loop = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < loop; i++) {
			String numArray = sc.nextLine();
			String[] numSplit = numArray.split(" ");
			//// stream 활용 굳
			int[] num = Arrays.stream(numSplit).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(num);
			System.out.println(num[7]);
		}
	}
}
//// 깔끔 :2:33
//자바는 이렇게 하는거구나~? 잘하네~?
