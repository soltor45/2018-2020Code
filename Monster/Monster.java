public class Monster
{
	private String name;
	private boolean scary;
	private double weight;

	public Monster() // no args so default 
	{
		name = "Olive";
		scary = false;
		weight = 100.0;
	}

	public Monster(String n, boolean s, double w)
	{
		name = n;
		scary = s;
		weight = w;
	}

	// accessor methods (getters)

	public String getName()
	{
		return name;
	}

	public boolean isScary()
	{
		return scary;
	}

	public double getWeight()
	{
		return weight;
	}

	// modifier methods (setters)

	public void setName(String n)
	{
		name = n;
	}

	public void setScary(boolean s)
	{
		scary = s;
	}

	public void setWeight(double w)
	{
		weight = w;
	}

	// other methods

	public String sayHello()
	{
		return "Roar";
	}

	public boolean isHeavy()
	{
		if(weight > 100)
			return true;
		else
			return false;
	}

	public void grow(double w)
	{
		weight = weight + w;
	}
}