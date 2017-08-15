package packageMagic;

import java.util.LinkedList;

public class Primos {
	private final int start;
	private final int end;
	
	public Primos(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	
	public LinkedList<Integer> solve() {
		LinkedList<Integer> solution = new LinkedList<Integer>();
		boolean criba[] = new boolean[end];
		int i = 2;
		int multiplicador = 2;
		while (Math.pow(i, 2) < end) {
			//Tachado = True
			if(criba[i] == false) {
				while(i*multiplicador < end) {
					criba[i*multiplicador] = true;
					multiplicador++;
				}
				multiplicador = 2;
			}
			i++;
		}
		
		for (int j = start; j < criba.length; j++) {
			if(criba[j] == false) {
				solution.add(j);
			}
		}
		
		

		
		return solution;
	}
	
}
