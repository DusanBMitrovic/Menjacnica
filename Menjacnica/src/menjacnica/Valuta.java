package menjacnica;

import java.util.*;

public class Valuta {

	private String naziv, skracenica;
	private double kursSrednji, kursKupovni, kursProdajni;
	private GregorianCalendar datum;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	public double getKursSrednji() {
		return kursSrednji;
	}
	public void setKursSrednji(double kursSrednji) {
		this.kursSrednji = kursSrednji;
	}
	public double getKursKupovni() {
		return kursKupovni;
	}
	public void setKursKupovni(double kursKupovni) {
		this.kursKupovni = kursKupovni;
	}
	public double getKursProdajni() {
		return kursProdajni;
	}
	public void setKursProdajni(double kursProdajni) {
		this.kursProdajni = kursProdajni;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
	
	
	
}
