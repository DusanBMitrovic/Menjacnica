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
		
		if(naziv != null  &&  !naziv.isEmpty())
		this.naziv = naziv;
		
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		if(skracenica != null  &&  !skracenica.isEmpty())
		this.skracenica = skracenica;
	}
	public double getKursSrednji() {
		return kursSrednji;
	}
	public void setKursSrednji(double kursSrednji) {
		if(kursSrednji > 0)
		this.kursSrednji = kursSrednji;
	}
	public double getKursKupovni() {
		return kursKupovni;
	}
	public void setKursKupovni(double kursKupovni) {
		if(kursKupovni > 0)
		this.kursKupovni = kursKupovni;
	}
	public double getKursProdajni() {
		return kursProdajni;
	}
	public void setKursProdajni(double kursProdajni) {
		if(kursProdajni > 0)
		this.kursProdajni = kursProdajni;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kursKupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(kursProdajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(kursSrednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kursKupovni) != Double.doubleToLongBits(other.kursKupovni))
			return false;
		if (Double.doubleToLongBits(kursProdajni) != Double.doubleToLongBits(other.kursProdajni))
			return false;
		if (Double.doubleToLongBits(kursSrednji) != Double.doubleToLongBits(other.kursSrednji))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skracenica=" + skracenica + ", kursSrednji=" + kursSrednji
				+ ", kursKupovni=" + kursKupovni + ", kursProdajni=" + kursProdajni + ", datum=" + datum + "]";
	}
	
	
	
	
}
