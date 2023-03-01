package no.hvl.dat102.datakontaktfirma;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {
	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;
	
	public Medlem(String navn,MengdeADT<Hobby> hobbyer, int statusIndeks) {
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = statusIndeks;
	}
	public String getNavn() {
		return this.navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public int getStatusIndeks() {
		return this.statusIndeks;
	}
	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}
	
	public MengdeADT<Hobby> getHobbyer(){
		return this.hobbyer;
	}
	public void setHobbyer(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}
	public boolean passerTil(Medlem medlem2) {
		if(this.hobbyer.equals(medlem2.hobbyer)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return this.navn;
	}
}