package konstruktor_domyslny;

public class Main1 {

    public static void main(String[] args) {    	
    	
        Student s1 = new Student();
        Student s2 = new Student(123123, "Magda", "Nowacka", 5);               
    	    	
    	System.out.println("student 1 = " + s1);
        System.out.println("student 2 = " + s2);
        
    }
}

/*
 	niby to chcial, dwa tygpdnie temu:
 	
	1. Doda� do typu adnotacyjnego wszystkie pola klasy student z domyslnymi warto�ciami - ok

	2. Obs�u�y� przypadek �e adnotacji nie ma lub jest z�a lub parametry adnotacji sa nieprawid�owe. w�wczas dajemy inne warto�ci domy�lne. - ?
*/
