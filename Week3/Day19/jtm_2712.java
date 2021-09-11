import java.util.Scanner;
//// 깜짝이야 현민이꺼랑 둘이 너무 똑같아서 놀랬어,,, : 2
//// 깔꼬옴
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0 ; i < testCase; i++){
			double num = sc.nextDouble();
			String unit = sc.nextLine();
			
			switch(unit){
			case " kg":
				System.out.println(String.format("%.4f",num * 2.2046) + " lb");
				break;
			case " g":
				System.out.println(String.format("%.4f", num * 3.7854) + " l");
				break;
			case " lb":
				System.out.println(String.format("%.4f", num * 0.4536) + " kg");
				break;
			case " l":
				System.out.println(String.format("%.4f", num * 0.2642) + " g");
				break;
			//// default 안써도돼유
			default:
				break;
			}
		}
	}
}
