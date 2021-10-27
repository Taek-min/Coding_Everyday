import java.util.Scanner;

//// 1. 자바에서는 보통 변수명을 카멜 표기법으로 짓습니다. 첫 글자는 소문자로, 그 후 단어 첫글자마다 대문자
//// 예: bMoney, tMoney, bnpBuy, timingBuy, dayStockPrice

//// 2. 코드를 설명한건 좋은데 주석말고 변수명으로 설명해주세요
//// 변수 이름, 함수 이름만으로 충분히 코드의 의도를 가독성있게 전달할 수 있어요
//// 주석은 이름 짓기만으로 정말 표현하기 힘든 부분일 때 (뭐 수학적 지식을 요구한다던가 할때) 그럴때만 사용하는게 좋습니다

public class Main
{ //// 줄바꿈좀 없애주세요 : 여기 제외한 전체적인 줄바꿈은 괜찮네여  : 22
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int BMouey = scan.nextInt();//준현이 돈
		
        int TMouey = BMouey;//성민이 돈
		int[] DayStockPrice = new int [14];//하루 주가
		
		int BNPBuy = 0;//준현이 보유 주
		int TIMINGBuy= 0;//성민이 보유 주
		//// 줄 지우기
		
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
				//// 줄 지우기
		    }
		    
		    if(i==13){//정산
		       TMouey=TMouey+(TIMINGBuy*DayStockPrice[i]);
		       BMouey=BMouey+(BNPBuy*DayStockPrice[i]);   
		    }
			//// 줄 지우기
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
//// 멋져요 고생했아융:2
