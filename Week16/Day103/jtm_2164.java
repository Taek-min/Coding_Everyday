import java.util.*;
import java.io.*;

public class Main{
   public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       List<Integer> linkedlist = new LinkedList<>();
       int num = Integer.parseInt(br.readLine());
       
       for(int i = 1; i <= num; i++){
           linkedlist.add(i);
       }
       
       int i = 0;
       while(linkedlist.size() != 1){
           linkedlist.remove(i);
           int tmp = linkedlist.get(i);
           linkedlist.remove(i);
           linkedlist.add(linkedlist.size(), tmp);
       }
       System.out.println(linkedlist.get(0));
   }
}
// 굳굳 나도 첨에 이렇게 풀다가 못했는데 배워갑니다