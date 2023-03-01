package no.hvl.dat102.mengde.tabell;

public class TabellMengdeTest {

	public static void main(String[] args) {
		TabellMengde<String> m1 = new TabellMengde<String>(7);
		TabellMengde<String> m2 = new TabellMengde<String>(10);
		TabellMengde<String> union = new TabellMengde<String>(20);
		TabellMengde<String> snitt = new TabellMengde<String>(3);
		TabellMengde<String> differens = new TabellMengde<String>(11);
		TabellMengde<String> undermengde = new TabellMengde<String>(5);
		
		m1.leggTil("Nils");
		m1.leggTil("Kåre");
		m1.leggTil("Ole");
		m1.leggTil("Martin");
		m1.leggTil("Kristian");
		m1.leggTil("Mateusz");
		m1.leggTil("Patrik");
		
		
		m2.leggTil("Nils");
		m2.leggTil("Kåre");
		m2.leggTil("Ole");
		m2.leggTil("Martine");
		m2.leggTil("Kristine");
		m2.leggTil("Mona");
		m2.leggTil("Mina");
		m2.leggTil("Nina");
		m2.leggTil("Karoline");
		m2.leggTil("Sofie");
		
		union.leggTil("Nils");
		union.leggTil("Kåre");
		union.leggTil("Ole");
		union.leggTil("Martin");
		union.leggTil("Kristian");
		union.leggTil("Mateusz");
		union.leggTil("Patrik");
		union.leggTil("Nils");
		union.leggTil("Kåre");
		union.leggTil("Ole");
		union.leggTil("Nils");
		union.leggTil("Kåre");
		union.leggTil("Ole");
		union.leggTil("Martine");
		union.leggTil("Kristine");
		union.leggTil("Mona");
		union.leggTil("Mina");
		union.leggTil("Nina");
		union.leggTil("Karoline");
		union.leggTil("Sofie");
		
		snitt.leggTil("Nils");
		snitt.leggTil("Kåre");
		snitt.leggTil("Ole");
		
		differens.leggTil("Martine");
		differens.leggTil("Kristine");
		differens.leggTil("Mona");
		differens.leggTil("Mina");
		differens.leggTil("Nina");
		differens.leggTil("Karoline");
		differens.leggTil("Sofie");
		differens.leggTil("Martin");
		differens.leggTil("Kristian");
		differens.leggTil("Mateusz");
		differens.leggTil("Patrik");
		
		undermengde.leggTil("Nils");
		undermengde.leggTil("Kåre");
		undermengde.leggTil("Ole");
		
		System.out.println("M1: " + m1.toString());
		System.out.println("M2: " + m2.toString());
		
		// Teste union
		if(m1.union(m2).equals(union)) {
			System.out.println("\nUnion funka:");
			System.out.println(union.toString());
		} else {
			System.out.println("\nUnion funka ikke!");
		}
		// Teste snitt
		if(m1.snitt(m2).equals(snitt)) {
			System.out.println("\nSnitt funka:");
			System.out.println(snitt.toString());
		} else {
			System.out.println("\nSnitt funka ikke!");
		}
		// Teste differens
		if(m1.differens(m2).equals(differens)) {
			System.out.println("\nDifferanse funka:");
			System.out.println(differens.toString());
		} else {
			System.out.println("\nDifferanse funka ikke!");
		}
		// Teste undermengde
		if(m1.undermengde(undermengde)) {
			System.out.println("\nUndermengde funka:");
			System.out.println(undermengde.toString());
		} else {
			System.out.println("\nUndermengde funka ikke!");
		}
	}


}
