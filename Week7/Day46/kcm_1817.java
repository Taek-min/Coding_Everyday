import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bookAmount = in.nextInt();
		int box = in.nextInt();
		int count = 0;
		int books[] = new int[bookAmount];
		int sum = 0;

		for(int i = 0; i < bookAmount; i++) {
			books[i] = in.nextInt();
		}

		for(int j = 0; j < books.length; j++) {
			sum += books[j];
			if(sum > box) {
				count++;
				sum = books[j];
			}
			else if(sum == box) {
				count++;
				sum = 0;
			}
			if(sum <= box && sum != 0) {
				if(j == books.length -1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}//// 귣귣~