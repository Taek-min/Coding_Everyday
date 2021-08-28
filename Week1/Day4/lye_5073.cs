using System;
using System.Linq;
using System.Text;

//// C# 코딩컨벤션 참고(영문): https://docs.microsoft.com/ko-kr/dotnet/csharp/fundamentals/coding-style/coding-conventions
public class Test
{
	public static void Main()
	{
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			int[] numArr = ReadInt();
			
			//// 코딩컨벤션에서 if와 ( 사이에 띄어쓰기를 권장함. if ( 이렇게
			if (numArr.Sum() == 0) break;
			
			if (!isTriangle(numArr))
			{
				sb.Append("Invalid\n");
				continue;
			}
			
            //중복을 제거한 개수 count
			int distinctCnt = numArr.Distinct().Count();
			
			switch(distinctCnt)
			{
				case 1:
					sb.Append("Equilateral\n");
					break;
				case 2:
					sb.Append("Isosceles\n");
					break;
				default:
					sb.Append("Scalene\n");
					break;
			}
		}
		Console.Write(sb);
	}
	
	static int[] ReadInt()
	{
		string[] inputs = Console.ReadLine().Split(' ');
		int len = inputs.Length;
		int[] numArr = new int[len];
		
		//// for (int i = 0; i < len; i++) 코딩컨벤션에서 요렇게 하기를 권장함
		for (int i = 0; i < len; i++)
		{
			numArr[i] = Convert.ToInt32(inputs[i]);
		}
		
		return numArr;
	}
	static bool isTriangle(int[] legs)
	{
		int maxNum = 0;
		int sum = 0;
		
		for (int i = 0; i < legs.Length; i++)
		{
            sum += legs[i];
            
			if (legs[i] > maxNum)
            {
                maxNum = legs[i];
            }
		}
        
		//// sum의 의미가 좀 퇴색되는듯? 조건식에서 뺄셈하는 편이 읽는 데 오해가 적을 것 같음
		//// 그냥 sum > maxNum 그대로 반환해도 똑같음
		return sum - maxNum > maxNum;
	}
}