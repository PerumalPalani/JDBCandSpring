package objectclasstopic;

public class Mobile {
	double m_cost;
	String m_name;
	String m_colour;
	Mobile(double m_cost, String m_name, String m_colour){
		this.m_cost = m_cost;
		this.m_name = m_name;
		this.m_colour = m_colour;
	}
	public String toString(){
		return m_cost+" "+m_name+" "+m_colour;
	}
	public static void main(String args[]){
		Mobile m = new Mobile(10000, "Samsung", "Purple");
		System.out.println(m);
	}

}
