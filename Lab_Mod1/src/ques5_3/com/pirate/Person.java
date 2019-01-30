package ques5_3.com.pirate;

public class Person extends Account {
	
	private String name;
	private float age;
	
	public Person(long accNo, double balance, String name, float age) {
		super(accNo, balance);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
	

}
