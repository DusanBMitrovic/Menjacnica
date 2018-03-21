package menjacnica;
import java.util.*;

import menjacnicainterfejs.InterfejsMenjacnica;


public class Menjacnica implements InterfejsMenjacnica {
	
	LinkedList <Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String naziv, double kursS, double kursP, double kursK, GregorianCalendar datum) {
		Valuta nova = new Valuta();
		nova.setDatum(datum);
		nova.setNaziv(naziv);
		nova.setKursKupovni(kursK);
		nova.setKursProdajni(kursP);
		nova.setKursSrednji(kursS);
		
		valute.add(nova);
	}

	@Override
	public void ozbrisiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String vratiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
