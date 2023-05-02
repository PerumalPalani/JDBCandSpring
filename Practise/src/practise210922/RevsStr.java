package practise210922;

public class RevsStr {
	public static void main(String[] args) {
		String s1 = "ALL TO WELCOME";
		String s2[] = s1.split(" ");
		String s3 = "";
		for(int i = s2.length-1 ; i>=0; i--){
			s3 += s2[i]+" ";
		}
		System.out.println(s3);
	}

}
