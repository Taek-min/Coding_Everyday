import java.util.Scanner; //// import 다음 줄바꿈 하나는 국룰
public class Main { ////긋긋:22
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstPhoneNum = sc.nextLine(); // 스트링으로 안받고 인트형으로 받으면 더 편할거 같아요 //// 인트가 훨씬 어렵습니다.
		String secondPhoneNum = sc.nextLine();
		String mixNum = ""; //// mix가 동사처럼 읽혀요. mixed 추천
		int result = 0;
		for(int i = 0; i < firstPhoneNum.length(); i++) {
			mixNum += firstPhoneNum.charAt(i) - '0';
			mixNum += secondPhoneNum.charAt(i) - '0';
		} //// 줄바꿈이 전혀 없어서 조금 답답한 감이 있는데 코드 맥락이 바뀔때마다 줄바꿈 한번씩 해주면 좀 더 읽기 좋을거 같아요
		while(mixNum.length() != 2) {
			String combine = "";
			for(int i = 0; i < mixNum.length() - 1; i++) {
				combine += (mixNum.charAt(i) + mixNum.charAt(i + 1) - '0' * 2) % 10;
			}
			mixNum = combine;
		}
		System.out.println(mixNum);
	}
}
