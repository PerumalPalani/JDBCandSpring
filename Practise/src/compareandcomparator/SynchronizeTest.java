package compareandcomparator;
class SourceLoc{
	synchronized public void res1(){
		for(int i = 0; i<=10; i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	synchronized public void res2(){
		for(int j = 50; j<=60; j++){
			System.out.println(j);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class Test1 extends Thread{
	SourceLoc s1;
	Test1(SourceLoc s1){
		this.s1 = s1;
	}
	public void run(){
		s1.res1();
	}
}
class Test2 extends Thread{
	SourceLoc s2;
	Test2(SourceLoc s2){
		this.s2 = s2;
	}
	public void run(){
		s2.res2();
	}
}


public class SynchronizeTest {
	public static void main(String[] args) {
		SourceLoc sl= new SourceLoc();
		Test1 t1 = new Test1(sl);
		Thread th1 = new Thread(t1);
		th1.start();
		Test2 t2 = new Test2(sl);
		Thread  th2 = new Thread(t2);
		th2.start();
	}

}
