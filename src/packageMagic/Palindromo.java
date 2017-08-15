package packageMagic;

import java.util.LinkedList;
import java.util.List;

public class Palindromo {
	private final String[] str;

	public Palindromo(String str) {
		this.str = str.split(" ");
	}
	
	public void solve() {
		List<String> solution = new LinkedList<String>();
		for (int i = 0; i < str.length; i++) {
			if(esPalindromo(str[i])) {
				solution.add(str[i]);
			}
		}
		
		for (String string : solution) {
			System.out.println(string);
		}
	}

	private boolean esPalindromo(String string) {
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) != string.charAt(string.length()-i-1)) {
				return false;
			}
			
		}
		return true;
	}
	
	
}
