package threadtopic;
class Sys{
	synchronized public void appl1()
	{
		for(int i = 1; i<=10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
				try{
					
					Thread.sleep(1000);
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	synchronized public void appl2()
	{
		for(int i = 1; i<=10; i++)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
				try{
					
					Thread.sleep(2000);
				}
				catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
class Appli1 extends Thread{
	Sys s1;
	Appli1(Sys s1)
	{
		this.s1 =s1;
	}
	public void run()
	{
		s1.appl1();
	}
}
class Appli2 extends Thread{
	Sys s2;
	Appli2(Sys s2){
		this.s2 = s2;
	}
	public void run()
	{
		s2.appl2();
	}
}

public class SynThread {
	public static void main(String[] args) {
		Sys s = new Sys();
		Appli1 a = new Appli1(s);
		Thread t1 = new Thread(a);
		t1.start();
		Appli2 a1 = new Appli2(s);
		Thread t2 = new Thread(a1);
		t2.start();		
	}

}
