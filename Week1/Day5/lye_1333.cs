using System;

public class Test
{
	public static void Main()
	{
		int[] inputs = ReadInt();
		int songCnt = inputs[0];
		int songLen = inputs[1];
		int ringTerm = inputs[2];
		int nowTime = 0;
		int nextRing = ringTerm;
		
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
		Console.Write(nextRing);
	}
	static int[] ReadInt()
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