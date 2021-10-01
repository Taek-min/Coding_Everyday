import java.util.Scanner;

public class Main
{ //// 줄바꿈좀 없애주세요 : 여기 제외한 전체적인 줄바꿈은 괜찮네여 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int BMouey = scan.nextInt();//준현이 돈
		
        int TMouey = BMouey;//성민이 돈
		int[] DayStockPrice = new int [14];//하루 주가
		
		int BNPBuy = 0;//준현이 보유 주
		int TIMINGBuy= 0;//성민이 보유 주

		
		for(int i = 0 ; i < 14 ; i++){
		    DayStockPrice[i] = scan.nextInt();//주가 설정
		    
            if(BMouey>=DayStockPrice[i]){//준현이 구매법
                BNPBuy=BNPBuy+(BMouey/DayStockPrice[i]);
                BMouey=BMouey-((BMouey/DayStockPrice[i])*DayStockPrice[i]);           
		    }
		    
		    if(i>=3){//성민이 구매법
		        if(DayStockPrice[i-3]<DayStockPrice[i-2]){//성민이 구매법 3일 연속 하락시 전량도
		            if(DayStockPrice[i-2]<DayStockPrice[i-1]){
		                TMouey=TMouey+(TIMINGBuy*DayStockPrice[i]);
		                TIMINGBuy=0;
		            }
		        }
		        
		        if(DayStockPrice[i-3]>DayStockPrice[i-2]){//성민이 구매법 3일 연속 하락시 전량매수
		            if(DayStockPrice[i-2]>DayStockPrice[i-1]){
		                if(TMouey>=DayStockPrice[i]){
                            TIMINGBuy=TIMINGBuy+(TMouey/DayStockPrice[i]);
                            TMouey=TMouey-((TMouey/DayStockPrice[i])*DayStockPrice[i]);
		                }
		            }
		        }
		        
		    }
		    
		    if(i==13){//정산
		       TMouey=TMouey+(TIMINGBuy*DayStockPrice[i]);
		       BMouey=BMouey+(BNPBuy*DayStockPrice[i]);   
		    }
		    
		}

		if(TMouey>BMouey){//결과값출력
		    System.out.println("TIMING");
		}

		if(TMouey<BMouey){
		    System.out.println("BNP");
		}

		if(TMouey==BMouey){
		    System.out.println("SAMESAME");
		}
	}
}
