package ml.bimdev.lesson02.homework;
import java.util.*;

public class SumOfDigits
{
	public static void main(String[] args)	{
		Scanner s = new Scanner(System.in);
		System.out.print("n: ");
		int n = s.nextInt();
		if(n < 0) n = -n;
		int sum = 0;
		
		while(n > 0)	{
			sum += n % 10;
			n /= 10;
		}
		
		System.out.printf("Сумма цифр в данном числе: %s", sum);
	}
}
