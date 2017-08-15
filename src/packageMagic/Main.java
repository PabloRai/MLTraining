package packageMagic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Primos pr;
		Scanner sc = new Scanner(System.in);
//		Letra l = new Letra(sc.nextLine());
//		l.solve();
//		pr = new Primos(sc.nextInt(),sc.nextInt());
		Palindromo p = new Palindromo(sc.nextLine());
		p.solve();
		sc.close();
//		LinkedList<Integer> l = pr.solve();
//		for (int i = 0; i < l.size(); i++) {
//			if(i+1 != l.size()) {
//				System.out.print(l.get(i) + " ");
//			} else {
//				System.out.println(l.get(i));
//			}
//		}


	}

}
