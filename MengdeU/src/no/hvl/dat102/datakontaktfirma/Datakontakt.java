package no.hvl.dat102.datakontaktfirma;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Datakontakt {
	private Medlem[] medlemmer = new Medlem[100];
	private int antallMedlemmer;
	
	public void LeggTilMedlem(Medlem person){
		if(medlemmer.length < antallMedlemmer) {
			medlemmer[antallMedlemmer] = person;
			antallMedlemmer++;
		} else {
			medlemmer = new Medlem[10+medlemmer.length];
			medlemmer[antallMedlemmer] = person;
			antallMedlemmer++;
		}
	
	}
	public Medlem[] getMedlemmer() {
		return this.medlemmer;
	}
	public int finnesMedlemsIndeks(String medlemsnavn){
		int i = 0;
		for (Medlem medlem : medlemmer) {
			if (medlem.getNavn().equals(medlemsnavn)){
				return i;
			}
			i++;
		}
		return -1;
	}
	public int finnesPartnerFor(String medlemsnavn) {
		Medlem medlem1 = null;
		int medlem1indeks = 0;
		for (Medlem medlem : medlemmer) {
			if (medlem != null && medlem.getNavn().equals(medlemsnavn)) {
				medlem1 = medlem;
			}
			medlem1indeks++;
		}
		int medlemindeks = 0;
		for (Medlem medlem : medlemmer) {
			if(medlem != null && !medlem.getNavn().equals(medlemsnavn)) {
				if(medlem.getStatusIndeks() == -1) {
					if(medlem.passerTil(medlem1)) {
						medlem1.setStatusIndeks(medlemindeks);
						medlem.setStatusIndeks(medlem1indeks);
						return medlemindeks;
					}
				}
			}
			medlemindeks++;
		}
		return -1;
	}
	
	void tilbakestillStausIndeks(String medlemsnavn) {
		for (Medlem medlem : medlemmer) {
			if (medlem.getNavn().equals(medlemsnavn)) {
				if(medlem.getStatusIndeks() != -1) {
					medlemmer[medlem.getStatusIndeks()].setStatusIndeks(-1);
					medlem.setStatusIndeks(-1);
				}
			}
		}
		
	}
	
}

