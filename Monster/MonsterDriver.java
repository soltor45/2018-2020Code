
public class MonsterDriver
{
	public static void main (String[] args)
	{
		Monster m1 = new Monster();
		System.out.println("First Monster Name: " + m1.getName());
		System.out.println("First Monster is scary?: " + m1.isScary());
		System.out.println("First Monster weight: " + m1.getWeight());

		Monster m2 = new Monster("Gloria", true, 92.5);
		System.out.println("\nSecond Monster Name: " + m2.getName());
		System.out.println("Second Monster is scary?: " + m2.isScary());
		System.out.println("Second Monster weight: " + m2.getWeight());

		m1.setName("Wilbur");
		System.out.println("\nFirst Monster Name: " + m1.getName());

		m2.setScary(false);
		System.out.println("\nSecond Monster is scary?: " + m2.isScary());

		System.out.println(m1.sayHello());

		m2.grow(10.5);
		System.out.println("\nSecond Monster weight: " + m2.getWeight());

		System.out.println("\nMonster 2 is Heavy: " +  m2.isHeavy());
	}
}




