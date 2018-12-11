package rownosc_obiektow;

import java.lang.reflect.Field;
import java.util.LinkedList;

public class Student {

	@IgnoreEquals
	Integer indeks;
	@IgnoreEquals
	Double ocena;
	String imie;
	String nazwisko;
	@IgnoreEquals
	String stopien_studiow;

    public Student(Integer indeks, Double ocena, String imie, String nazwisko, String stopien_studiow){
        this.indeks = indeks;
        this.ocena = ocena;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stopien_studiow = stopien_studiow;
    }

    public Student() {
    }

    @Override
    public String toString() {

        return "Indeks: " + this.indeks + "\tImie: " + this.imie + "\tNazwisko: " + this.nazwisko + "\tOcena: " + this.ocena + "\tStopien studiow: " + this.stopien_studiow;
    }
    
    @Override
    public boolean equals(Object obj) {
    	
    	if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
    	
    	Class<? extends Student> klasa = this.getClass();
                
        Field[] pola = klasa.getDeclaredFields();
        LinkedList<String> nazwypol = new LinkedList<>();
		
		for(Field p: pola){
			
			if( !(p.isAnnotationPresent(IgnoreEquals.class)) ){
				
				nazwypol.add(p.getName());				
			}
		}
		
        Student student = (Student) obj;
        boolean wynik = true;
        
        for (int i=0; i<nazwypol.size(); i++) {
        	
        	if(nazwypol.get(i)=="indeks") {
        		if(!this.indeks.equals(student.getIndeks())) {
        			wynik = false;
        			break;
        		}                	
        	}
        	
        	if(nazwypol.get(i)=="ocena") {
        		if(!this.ocena.equals(student.getOcena())) {
        			wynik = false;
        			break;
        		}                	
        	}
        	
        	if(nazwypol.get(i)=="imie") {
        		if(!this.imie.equals(student.getImie())) {
        			wynik = false;
        			break;
        		}                	
        	}
        	
        	if(nazwypol.get(i)=="nazwisko") {
        		if(!this.nazwisko.equals(student.getNazwisko())) {
        			wynik = false;
        			break;
        		}                	
        	}
        	
        	if(nazwypol.get(i)=="stopien_studiow") {
        		if(!this.stopien_studiow.equals(student.getStopienStudiow())) {
        			wynik = false;
        			break;
        		}                	
        	}

        }
        
        return wynik;
        
    }
    
    public Integer getIndeks() {
        return indeks;
    }

    public String getImie() {
        return imie;
    }
    
    public String getNazwisko() {
        return nazwisko;
    }

    public Double getOcena() {
        return ocena;
    }
    
    public String getStopienStudiow() {
        return stopien_studiow;
    }

}
