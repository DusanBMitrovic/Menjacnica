package menjacnicainterfejs;

import java.util.*;
import menjacnica.Valuta;

public interface InterfejsMenjacnica {

	public void dodajKurs(String naziv, double kursS, double kursP, double kursK, GregorianCalendar datum);
	public void obrisiKurs(String naziv, GregorianCalendar datum);
	public Valuta vratiKurs (String naziv, GregorianCalendar datum);
	
}
