package packageMagic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Letra {
	private String str;
	private HashMap<Character, MutableInt> letras = new HashMap<Character, MutableInt>();
	
	public Letra(final String str) {
		this.str = str;
	}
	
	
	public void solve() {
		char letra = ' ';
		int maxValue = 0;
		Iterator<Map.Entry<Character, MutableInt>> it;
		for (int i = 0; i < str.length(); i++) {
			letra = str.charAt(i);
			if(letras.get(letra) == null) {
				letras.put(letra, new MutableInt());
			} else {
				letras.get(letra).incrementValue();
			}
		}
		it = letras.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Character, MutableInt> entry = it.next();
			if(entry.getValue().getValue() > maxValue) {
				maxValue = entry.getValue().getValue();
				letra = entry.getKey();
			}
		}
		
		System.out.println("Letra: " + letra + " Cantidad: "+ maxValue);
	}
	/*
	 * La complejidad computacional del algoritmos es O(n) ya que se recorre toda la oracion en
	 * búsqueda de las letras, se utiliza una clase MutableInt con el fin de optimizar el incremento
	 * dentro del hashMap
	 * 
	 * La complejidad espacial es también O(N) que es la complejidad espacial del hashmap.
	 */
}
