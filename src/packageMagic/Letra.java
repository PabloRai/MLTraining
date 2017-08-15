package packageMagic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Letra {
	private String str;
	private HashMap<Character, MutableInt> map = new HashMap<Character, MutableInt>();
	
	public Letra(final String str) {
		this.str = str;
	}
	
	
	public void solve() {
		char letra = ' ';
		int maxValue = 0;
		Iterator<Map.Entry<Character, MutableInt>> it;
		for (int i = 0; i < str.length(); i++) {
			letra = str.charAt(i);
			if(map.get(letra) == null) {
				map.put(letra, new MutableInt());
			} else {
				map.get(letra).incrementValue();
			}
		}
		it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Character, MutableInt> entry = it.next();
			if(entry.getValue().getValue() > maxValue) {
				maxValue = entry.getValue().getValue();
				letra = entry.getKey();
			}
		}
		
		System.out.println("Letra: " + letra + " Cantidad: "+ maxValue);
	} 
}
