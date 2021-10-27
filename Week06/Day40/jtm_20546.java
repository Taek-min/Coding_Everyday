import java.util.Scanner;

//// 승빈 코드: https://github.com/Eighteeen/BOJ_Algorithm_Study/blob/main/Study4%20-%20Bitmask/Week22/Day151/boj20546_wsb.java
//// 진홍 코드: https://github.com/Eighteeen/BOJ_Algorithm_Study/blob/main/Study4%20-%20Bitmask/Week22/Day151/boj20546_kjh.java
//// 복잡한 구현 문제인만큼 main의 길이가 꽤 길게 나왔는데, 다음에는 위처럼 함수나 클래스로 뽑아내보려고 궁리해보면 좋을 것 같습니다
//// Good
public class Main { ////패키지 없애드렷습니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int junMoney = money;
        int sungMoney = money;

        int stock[] = new int[14];
        for (int i = 0; i < stock.length; i++) {
            stock[i] = sc.nextInt();
        }
		//// 줄 지우기

        int junStockCount = 0;
        for (int i = 0; i < stock.length ; i++) {
            if(junMoney >= stock[i]){
                junStockCount += junMoney / stock[i];
                junMoney = junMoney % stock[i];
            }
        }

        int bStockCount = 0;
        for (int i = 3; i < stock.length ; i++) {
            //// 줄 지우기(아마?)
            if(stock[i-3] > stock[i-2] && stock[i-2] > stock[i-1] && stock[i-1] > stock[i]){
                if(sungMoney >= stock[i]){
                    bStockCount += sungMoney / stock[i];
                    sungMoney = sungMoney % stock[i];
                }
            }
            else if(stock[i-3] < stock[i-2] && stock[i-2] < stock[i-1] && stock[i-1] < stock[i]){
                if(bStockCount > 0){
                	sungMoney += bStockCount * stock[i];
                    bStockCount = 0;
                }
            }
        }

        int junTotal = junMoney + stock[13] * junStockCount;
        int sungTotal = sungMoney + stock[13] * bStockCount;

        if(junTotal > sungTotal){
            System.out.println("BNP");
        }else if(junTotal < sungTotal){
            System.out.println("TIMING");
        }else{
            System.out.println("SAMESAME");
        }
    }
}
//// 고생했네웅~~:22