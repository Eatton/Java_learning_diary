import java.util.*;
public class SquLen {
	public static void main(String[] args) {
		Scanner square = new Scanner(System.in);
		System.out.println("Please enter the length of the square");
		int length = square.nextInt();
		int area = length *length;
		int perimeter = 4 * length;
		System.out.println("The length of the square is "+length);
		System.out.println("The area of the square is "+area);
		System.out.println("The perimeter of the square is "+ perimeter);
		square.close();
	}

}
