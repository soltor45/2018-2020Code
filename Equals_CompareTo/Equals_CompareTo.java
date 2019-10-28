

public class Equals_CompareTo
{
	public static void main (String[] args)
	{
		equals_Trial();

		System.out.println("\n\n");

		compareTo_Trial();
	}

	public static void equals_Trial()
	{
	/*
		equals() method

		The Object class is the superclass of all Java classes.

		All Java classes inherit from the Object class.

		One method of the Object class is the equals() method
		which returns true only if the reference variables
		are pointing to the same memory location.
		(i.e., They are the same object.)

		The String class overrides equals() of Object.
		For the String class, the equals() method returns true
		if the CONTENT of two String objects are exactly same.;
	*/

		String name1 = "Rosie";

		// name1 and name2 are reference variables pointing to the same object
		String name2 = name1;

		// creates new object for name3
		String name3 = new String("Rosie");

		//	name4 below may or may not be same object that is referenced by name3
		//  Job of garbage collector to shift data as it sees fit.
		String name4 = "Rosie";

		System.out.println("\nname1, name2, name3 all store String \"Rosie\"");
		System.out.println("BUT, name3 is in different memory location");

		System.out.println();

		System.out.println("name1.equals(name2) is " + name1.equals(name2));
		System.out.println("name2.equals(name3) is " + name2.equals(name3));
		System.out.println("name3.equals(name1) is " + name3.equals(name1));

		System.out.println();

		System.out.println("name1 == name2 is " + (name1 == name2));
		System.out.println("name2 == name3 is " + (name2 == name3));
		System.out.println("name3 == name1 is " + (name3 == name1));
	}



	public static void compareTo_Trial()
	{
	/*
		2.  compareTo() method

			The compareTo method is an abstract method in the
			java.util.Comparable interface.

			The String class provides an implementation of the compareTo()
			method which compares two strings in ASCII order.

			The entire uppercase alphabet precedes the lowercase one.
			(Note: uppercase 'A' has a lower value than lowercase 'a')

			If two objects are the same, compareTo() returns 0.
			If the first object is less, compareTo() returns a negative integer.
			If the first object is greater, compareTo() returns a positive integer.

	  		int answer = "apple".compareTo("banana");   // returns a negative number
  			int answer = "apple".compareTo("Apple");    // returns a positive number

		*/


		int x1= "grapes".compareTo("apple");
		System.out.println("\"grapes\".compareTo(\"apple\")= " + x1);
		System.out.println("The positive number means that \"grapes\" comes after (is bigger) than \"apple\" in ASCII");

		int x2= "hello".compareTo("hello");
		System.out.println("\n\"hello\".compareTo(\"hello\")= " + x2);
		System.out.println("The 0 means that the two strings have the same content");

		int x3= "hello".compareTo("there");
		System.out.println("\n\"hello\".compareTo(\"there\")= " + x3);
		System.out.println("The negative number means that \"hello\" comes before (is smaller) than \"there\" in ASCII");

		int x4= "Hello".compareTo("hello");
		System.out.println("\n\"Hello\".compareTo(\"hello\")= " + x4);
		System.out.println("The negative number means that \"Hello\" comes before (is smaller) than \"hello\" in ASCII");
		System.out.println("This is because the entire uppercase alphabet comes before the lowercase alphabet in ASCII\n");
	}
}







