package no.hvl.dat102.datakontaktfirma;

import java.util.Scanner;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;


public class Tekstgrensesnitt {
	static Datakontakt dk = new Datakontakt();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("Hva ønsker du å gjøre?\n1)Lag nytt medlem\n2)Vis medlem hobbyer\n3)Vis par");
		String valg = input.nextLine();
		switch (valg) {
		case "1":
			lagMedlem(input);
			break;
		case "2":
			skrivHobbyListe(lesMedlem(input));
			break;
		case "3":
			skrivParListe();
			break;
		}}
		
	}
	
	public static Medlem lesMedlem(Scanner scanner){ 
		System.out.println("Skriv inn medlemsnavn: ");
		String medlemsnavn = scanner.nextLine();
		int indeks = dk.finnesMedlemsIndeks(medlemsnavn);
		if (indeks != -1) {
			return dk.getMedlemmer()[indeks];
		} else {
			return null;
		}
	}
	
	public static void lagMedlem(Scanner scanner){ 
		MengdeADT<Hobby> hobbyer = new TabellMengde<Hobby>();
		System.out.println("Skriv inn medlemsnavn: ");
		String medlemsnavn = scanner.nextLine();
		System.out.println("Legg til hobbyer, skriv en og en hobby og trykk enter \nnår du er ferdig, trykk enter på en tom linje: ");
		Boolean ferdig = false;
		while(!ferdig) {
			String next = scanner.nextLine();
			if (!next.equals("")) {
				hobbyer.leggTil(new Hobby(next));
			} else {
				ferdig = true;
				System.out.println("Registrerte hobbyer: \n" + hobbyer.toString());
			}
		}
		Medlem medlem = new Medlem(medlemsnavn, hobbyer, -1);
		dk.LeggTilMedlem(medlem);
	}
	 
	// Skriver ut hobbylisten for et medlem 
	public static void skrivHobbyListe(Medlem medlem) {  
	    System.out.println("Alle hobbyene "); 
	    System.out.println(medlem.getHobbyer().toString()); 
	} 
	
	public static void skrivParListe (){ 
		for (Medlem medlem : dk.getMedlemmer()) {
			System.out.println(medlem.toString());
		}
		/*
		System.out.println("Parnavn:");
		Medlem[] medlemmer = dk.getMedlemmer();
		for (Medlem medlem : medlemmer) {
			if(medlem != null) {
				System.out.println(medlem.toString());
				int index = dk.finnesPartnerFor(medlem.getNavn());
				if (index != -1) {System.out.println(medlem.getNavn() + " og " + medlemmer[index].getNavn());
	} }
		}*/
	
}
}
