package threadtopic;

class Resource1 {
	public void res1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void res2() {
		for (int i = 101; i <= 110; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Demo1 extends Thread{
	public void run(){
		Resource1 r1 = new Resource1();
		r1.res1();
	}
}
class Sample1 extends Thread{
	public void run(){
		Resource1 r2 = new Resource1();
		r2.res2();
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		Thread t1 = new Thread(d);
		t1.start();
		Sample1 s = new Sample1();
		Thread t2 = new Thread(s);
		t2.start();	
	}
}
