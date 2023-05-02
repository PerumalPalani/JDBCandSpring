package practise1010;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Hello World";
//		char ch[] = s.toCharArray();
		char ch[] = new char[s.length()];
		for(int i = 0; i<s.length(); i++){
			ch[i] = s.charAt(i);
		}
		String res="";
		for(int i = ch.length-1; i>= 0; i--){
			int k = i;
			while(i >= 0 && ch[i] != ' '){
				i--;
			}
			int j = i+1;
//			System.out.println(j);
			while (j<=k){
				res = res+ch[j];
				j++;
//				System.out.println(res);
			}
			res = res +" ";
		}
		System.out.println(res);
	}

}
