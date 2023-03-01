package no.hvl.dat102.datakontaktfirma;

import java.util.Objects;

public class Hobby {
	private String hobbyNavn;

	public Hobby(String hobby) {
		hobbyNavn = hobby;
	}

	public String toString() {
		return "<" + hobbyNavn + ">";
	}


@Override
public boolean equals(Object hobby2) {
	if (this == hobby2)
		return true;
	if (hobby2 == null)
		return false;
	if (getClass() != hobby2.getClass())
		return false;
	Hobby other = (Hobby) hobby2;
	return Objects.equals(hobbyNavn, other.hobbyNavn);
}

}