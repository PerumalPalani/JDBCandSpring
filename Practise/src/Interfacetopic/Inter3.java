package Interfacetopic;
interface Nike
{
	void shoes();
}
interface Puma extends Nike
{
	void bags();
}

public class Inter3 implements Puma 
{

	@Override
	public void shoes() {
		// TODO Auto-generated method stub
		System.out.println("Jingilala Shoes");
	}

	@Override
	public void bags() {
		// TODO Auto-generated method stub
		System.out.println("Jingilala bags");
	}
	public static void main(String args[]){
		Inter3 n = new Inter3();
		n.shoes();
		n.bags();
	}

}
