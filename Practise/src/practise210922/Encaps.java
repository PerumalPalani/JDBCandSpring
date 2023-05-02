package practise210922;

class Enc2{
			private int a = 20;
		public int getA()
		{
			return a;
		}
		public void setA(int a){
			this.a = a;
		}

}
public class Encaps {
	public static void main(String[] args) {
		Enc2  e1 = new Enc2();
		System.out.println(e1.getA());
		e1.setA(234);
		System.out.println(e1.getA());
	}
}
