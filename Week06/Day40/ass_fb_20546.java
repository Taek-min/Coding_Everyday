import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bMouey = scan.nextInt();
        	int tMouey = bMouey;
		int[] dayStockPrice = new int [14];		
		int bnpBuy = 0;
		int timingBuy= 0;
		
		for(int i = 0 ; i < 14 ; i++){
			dayStockPrice[i] = scan.nextInt();		    
            		if(bMouey>=dayStockPrice[i]){
               			bnpBuy=bnpBuy+(bMouey/dayStockPrice[i]);
                		bMouey=bMouey-((bMouey/dayStockPrice[i])*dayStockPrice[i]);           
			}	    
			if(i>=3){
				if(dayStockPrice[i-3]<dayStockPrice[i-2]){
		        		if(dayStockPrice[i-2]<dayStockPrice[i-1]){
		                		tMouey=tMouey+(timingBuy*dayStockPrice[i]);
		                		timingBuy=0;
		            		}
		        	}
		        
		        	if(dayStockPrice[i-3]>dayStockPrice[i-2]){
		        		if(dayStockPrice[i-2]>dayStockPrice[i-1]){
		                		if(tMouey>=dayStockPrice[i]){
                            				timingBuy=timingBuy+(tMouey/dayStockPrice[i]);
                            				tMouey=tMouey-((tMouey/dayStockPrice[i])*dayStockPrice[i]);
		                		}
		            		}
		        	}	        
			}	    
			if(i==13){
				tMouey=tMouey+(timingBuy*dayStockPrice[i]);
				bMouey=bMouey+(bnpBuy*dayStockPrice[i]);   
			}    
		}
		if(tMouey>bMouey){
			System.out.println("TIMING");
		}
		if(tMouey<bMouey){
			System.out.println("BNP");
		}
		if(tMouey==bMouey){
			System.out.println("SAMESAME");
		}
	}
}
