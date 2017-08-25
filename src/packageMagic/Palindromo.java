package packageMagic;

import java.util.LinkedList;
import java.util.List;

public class Palindromo {
	private final String[] palabras;

	public Palindromo(String oracion) {
		this.palabras = oracion.replaceAll("[^A-Za-z ]", "").split(" ");
	}
	
	public void solve() {
		List<String> solution = new LinkedList<String>();
		for (int i = 0; i < palabras.length; i++) {
			if(esPalindromo(palabras[i])) {
				solution.add(palabras[i]);
			}
		}
		
		for (String string : solution) {
			System.out.println(string);
		}
	}

	private boolean esPalindromo(String string) {
		for (int i = 0; i < string.length()/2; i++) {
			if(string.charAt(i) != string.charAt(string.length()-i-1)) {
				return false;
			}
			
		}
		return true;
	}
	
	/*
	 * Complejidad computacional: O(N Log(N)) dado que
	 * puedo tener N palabras y estas las recorro 
	 * hasta la longitud de N/2 lo cual resulta en la expresión Log (N)
	 * 
	 * Complejidad espacial O(N+M) siendo N la cantidad de palabras y 
	 * M la cantidad de palabras palíndromas que se encuentran en la solucion
	 */
	
	
}
