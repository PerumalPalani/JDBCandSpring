package objectclasstopic;

public class School {
	String sname;
	char sgrade;
	int sstrength;
	School(String sname, char sgrade, int sstrength)
	{
		this.sname = sname;
		this.sgrade = sgrade;
		this.sstrength = sstrength;
	}
	public String toString()
	{
		return sname+ " " + sgrade+ " " + sstrength;
		
	}
	public static void main(String[] args) {
		School s = new School("ST.josephs", 'A', 1500);
		System.out.println(s);
	}

}
