import java.util.*;
public class Practice
{
	public static void main(String[] args)		
	{
		Random generator = new Random();
		int num1;
		double num2;
		num1 = generator.nextInt();
		System.out.println("A random number is: "+num1);
		num1 = generator.nextInt(9)+1;
		System.out.println("From 0 to 9: "+num1);
		num2 = generator.nextFloat()*2.4+1.1;
		System.out.println("A random float(between 0 and 1)"+ num2);
		num1 = (int)num2 + 1;
		System.out.println(num1);
		
	}
}
//In this source code, I learned how to use Random class to get a random integer or a random float number, and limit them in a specific range.

