package testcasesorowntry;


public class Addint {
	static void sum(int n)
	{
		int s = 0;
		s = s+n;
		System.out.println(s);
	}
	public static void main(String[] args) {
		int sum = 0;
		Object[] c;
		Object b;
		Object[] a ={"abc", new Integer(1),new Integer(8),new Integer(5),new Character('c'),new Integer(10),new Integer(10)};
		for(int i=0; i<a.length;i++){
			if(a[i] instanceof Integer){
			     b =  a[i];
//				for(int j=0; j<b.length;j++){
//					if(b[j] == b[j+1]){
//						continue;
//					}
//					System.out.println(b[j]);						
//				}
//				
			}
		}
		System.out.println();
	
		
		

	}
}
