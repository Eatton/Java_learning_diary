import java.util.*;
public class calculation {
	public static void main(String[] args)
	{
		Scanner cal = new Scanner(System.in);
		System.out.println("Please enter a numerator:");
		int numerator = cal.nextInt();
		System.out.println("Please enter a denominator:");
		int denominator = cal.nextInt();
		int result = numerator/denominator;
		System.out.print("The outcome of numerator divide denomineator is ");
		System.out.println(result);
		cal.close();
	}
}
