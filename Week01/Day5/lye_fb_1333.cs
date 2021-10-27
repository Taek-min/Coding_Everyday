using System;

public class Test
{
	public static void Main()
	{
		int[] inputs = ReadInt();
		//// 변수 작명 굳
		int songCnt = inputs[0];
		int songLen = inputs[1];
		int ringTerm = inputs[2];
		int nowTime = 0;
		int nextRing = ringTerm;
		
		//// 로직 이해하기 쉬웠어요
		for(int i=0; i<songCnt; i++)
		{
			nowTime += songLen;
			while(nextRing < nowTime)
			{
				nextRing += ringTerm;
			}
			if(nextRing >= nowTime && nextRing < nowTime + 5)
			{
				break;
			}
			nowTime += 5;
		}
		Console.Write(nextRing);        ////씨샾 눈에 익혀갑니다... //// 우리도 이해하기 쉽게 해주신거같아요 감사합니다. :2
	}
	
	//// ReadInts가 맞는 것 같슴다
	static int[] ReadInts()
	{
		string[] inputs = Console.ReadLine().Split(' ');
		int len = inputs.Length;
		int[] numArr = new int[len];
		
		for(int i=0; i<len; i++)
		{
			numArr[i] = Convert.ToInt32(inputs[i]);
		}
		
		return numArr;
	}
}