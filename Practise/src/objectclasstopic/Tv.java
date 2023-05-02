package objectclasstopic;

public class Tv {
	double tv_cost;
	String tv_name;
	String tv_type;
	Tv(double tv_cost, String tv_name, String tv_type)
	{
		this.tv_cost = tv_cost;
		this.tv_name = tv_name;
		this.tv_type = tv_type;
		
	}
	public String toString()
	{
		return tv_cost+" "+tv_name+" "+tv_type;
	}
	public static void main(String[] args) {
		Tv t = new Tv(15000, "One_Plus", "Android");
		System.out.println(t);
	}

}
