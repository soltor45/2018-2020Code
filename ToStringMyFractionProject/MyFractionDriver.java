
public class MyFractionDriver
{
	public static void main (String[] args)
	{
		MyFraction freddy = new MyFraction(3,7);
		


		/*
			The System.out.println method uses the
			toString method for displaying an object.

			So, either of the 2 methods below will call
			the toString() method for object freddy.
		*/


		System.out.println(freddy.toString()); // CODE GOES HERE

		System.out.println(freddy); // just object name^^ these do the exact same thing
	}
}
