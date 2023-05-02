package practise02;
class Googlepay
{
	void pay()
	{
		System.out.println("Make a payment");
	}
}
class E_bill extends Googlepay
{
	void pay()
	{
		System.out.println("Electric bill payment");
	}
}
class B_transfer extends Googlepay
{
	void pay()
	{
		System.out.println("Bank to Bank tranfer");
	}
}
class P_recharge extends Googlepay
{
	void pay()
	{
		System.out.println("Phone recharge payment");
	}
	
}
class G_pay
{
	static void m_pay(Googlepay g)
	{
		g.pay();
	}
}

public class Payment {
	public static void main(String args[])
	{
		E_bill e = new E_bill();
		B_transfer b = new B_transfer();
		P_recharge p = new P_recharge();
		G_pay.m_pay(e);
		G_pay.m_pay(b);
		G_pay.m_pay(p);
	}

}
