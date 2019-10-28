public class Cat
{
	private String name;
	private boolean scary;
	private int weight;

	public Cat() // no args so default 
	{
		type = "American Shorthair";
		age = 0;
	}

	public Cat(String t, int a)
	{
		type = t;
		age = a;
	}

	// accessor methods (getters)

	public String getType()
	{
		return type;
	}
	public int getAge()
	{
		return age;
	}

	// modifier methods (setters)

	public void setType(String t)
	{
		type = t;
	}

	public void setAge(int a)
	{
		age = a;
	}

	// other methods

	public int calcPeopleYears()
	{
		if (a >=2)
		{
		    
		  }
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