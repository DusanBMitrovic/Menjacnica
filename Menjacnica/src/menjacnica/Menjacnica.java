package menjacnica;

import java.util.*;

import menjacnicainterfejs.InterfejsMenjacnica;

public class Menjacnica implements InterfejsMenjacnica {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

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
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub

		for(int i=0; i<valute.size(); i++)
			if(valute.get(i).getNaziv().equals(naziv)  &&  valute.get(i).getDatum().equals(datum)) {
				valute.remove(i);
				System.out.println("Kurs je izbrisan");
			}
		}	

	@Override
	public Valuta vratiKurs(String naziv, GregorianCalendar datum) {
		
		for(int i=0; i<valute.size();i++) {
			if(valute.get(i).getNaziv().equals(naziv)  &&  valute.get(i).getDatum().equals(datum))
				return valute.get(i);
		}
		return null;
	}
	
		
}
