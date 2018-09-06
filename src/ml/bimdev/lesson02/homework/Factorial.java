package ml.bimdev.lesson02.homework;
import java.util.*;

public class Factorial
{
	public static void main(String[] args)	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = s.nextInt();
		int f = 1;
		
		for(int i = 1; i <= n; i++)
			f *= i;
		System.out.printf("%s! = %s\n", n, f);
	}
}
