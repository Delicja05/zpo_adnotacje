package konstruktor_domyslny;

@DefaultStudent(indeks = 321321, imie = "Jan", nazwisko = "Kowalski",  ocena = 3)
public class Student {

    private int indeks;
    private String imie;
    private String nazwisko;
    private double ocena;

    public Student(int indeks, String imie, String nazwisko, double ocena){
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ocena = ocena;
    }

    public Student() {
        Class<? extends Student> klasa = this.getClass();
        DefaultStudent ds = (DefaultStudent)klasa.getAnnotation(DefaultStudent.class);

        this.indeks = ds.indeks();
        this.imie = ds.imie();
        this.nazwisko = ds.nazwisko();
        this.ocena = ds.ocena();

    }

    @Override
    public String toString() {

        return "Indeks: " + this.indeks + "\tImie: " + this.imie + "\tNazwisko: " + this.nazwisko + "\tOcena: " + this.ocena;
    }


    public int getIndeks() {
        return indeks;
    }

    public String getImie() {
        return imie;
    }
    
    public String getNazwisko() {
        return nazwisko;
    }

    public double getOcena() {
        return ocena;
    }

}
