import java.util.Scanner;

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


        int junStockCount = 0;
        for (int i = 0; i < stock.length ; i++) {
            if(junMoney >= stock[i]){
            	junStockCount += junMoney / stock[i];
                junMoney = junMoney % stock[i];
            }
        }

        int bStockCount = 0;
        for (int i = 3; i < stock.length ; i++) {

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