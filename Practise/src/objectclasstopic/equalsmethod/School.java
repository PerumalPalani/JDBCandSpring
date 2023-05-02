package objectclasstopic.equalsmethod;

public class School {
	String name;
	int strength;
	char grade;
	String type;
	School(String name, int strength, char grade, String type)
	{
		this.name = name;
		this.strength = strength;
		this.grade = grade;
		this.type = type;
	}
	public boolean equals(Object obj)
	{
		School s3 = (School)obj;
		return this.grade < s3.grade;
	}
	public static void main(String[] args) {
		School s1 = new School("St.josephs", 1500, 'B', "State board");
		School s2 = new School("Anthonys", 1600, 'A', "CBSI");
		if(s1.equals(s2))
		{
			System.out.println("Anthony school is best");
		}
		else {
			System.out.println("St.josephs school is best");
		}
	}

}
