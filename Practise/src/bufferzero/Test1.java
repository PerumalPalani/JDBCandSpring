package bufferzero;

public class Test1 {
	public static void main(String[] args) {
		char ch[] = {'8','0','8', '8','9','7','5','3','5','9'};
		int count = 0;
		for(int i=0; i<ch.length; i++){
			if(ch[i] == 56){
				count++;
			}
		}
		System.out.println(count);
	}

}
