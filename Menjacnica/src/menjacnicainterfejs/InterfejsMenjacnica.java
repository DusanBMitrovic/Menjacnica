package menjacnicainterfejs;

import java.util.*;


public interface InterfejsMenjacnica {

	public void dodajKurs(String naziv, double kursS, double kursP, double kursK, GregorianCalendar datum);
	public void ozbrisiKurs(String naziv, GregorianCalendar datum);
	public String vratiKurs (String naziv, GregorianCalendar datum);
	
}
