import java.util.*;
public class PeopleInformation
{
	String name;
	int age;
	String college;
	String petname;
	public static int num;
	public PeopleInformation()
	{
		Scanner m = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = m.nextLine();
		this.name = name;
		System.out.println("Please enter your age:");
		int age = m.nextInt();
		m.nextLine();
		System.out.println("Please enter your collage:");
		String college = m.nextLine();
		System.out.println("Please enter your pet's name:");
		String petname = m.nextLine();
		this.age = age;
		this.college = college;
		this.petname = petname;
		System.out.println("Hello, my name is " +this.name+" and I am " +this.age+
				" years old. I'm enjoying my time at " +this.college+",though I miss"+
				" my pet "+this.petname+" very much!");
		num++;
		m.close();
	}

}
