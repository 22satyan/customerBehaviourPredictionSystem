
public class demo {
	public static void main(String[] args) {
		String s=demooutput.main(null);
	
		char x='4';
		char a;
		int n=0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ' || s.charAt(i)==x) {
			
		}
		else {
			a=s.charAt(i);
			n=Character.getNumericValue(a);
			System.out.println(n);
		}	
	}
	}
}
