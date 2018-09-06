package ml.bimdev.lesson02.homework;
import java.util.*;

public class MaxAbsNumber
{
	private static int Abs(int num)	{
		if(num < 0)
			return -num;
		return num;
	}
	
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		int n, maxAbs = 0;
		System.out.print("Введите количество чисел: ");
		n = sc.nextInt();
		System.out.println("Теперь сами числа");
		
		for(int i = 0, p; i < n; i++)	{
			p = sc.nextInt();
			if(Abs(p) > Abs(maxAbs))
				maxAbs = p;
		}
		
		System.out.printf("Максимальное по модулю число %s", maxAbs);
	}
}
