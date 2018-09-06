package ml.bimdev.lesson02.homework;
import java.util.*;

public class OddsEndEvens
{
	public static void main(String[] args)	{
		Scanner s = new Scanner(System.in);
		System.out.print("Количество чисел: ");
		int n = s.nextInt();
		int substraction = 0;
		
		for(int i = 1; i <= n; i++)	{
			System.out.printf("n[%s] = ", i);
			int a = s.nextInt();
			substraction += a % 2 == 0 ? a : -a;
		}
		if(substraction < 0)
			substraction = -substraction;
		System.out.printf("Разница - %s", substraction);
	}
}
