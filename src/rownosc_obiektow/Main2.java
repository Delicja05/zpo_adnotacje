package rownosc_obiektow;


public class Main2 {

	public static void main(String[] args) {
		
		Student s1 = new Student(123123, 3.0, "Magda", "Nowak", "drugi");
		Student s2 = new Student(123123, 3.0, "Magda", "Nowak", "pierwszy");
		Student s3 = new Student(258, 3.0, "Magda", "Nowak", "drugi");
		Student s4 = new Student(321321, 4.0, "Ola", "Kowal", "pierwszy");
    	
		System.out.println("s1 = " + s1);
    	System.out.println("s2 = " + s2);
    	System.out.println("s3 = " + s3);
    	System.out.println("s4 = " + s4);
    	
    	System.out.println();
    	
    	if(s1.equals(s4))
    		System.out.println("Rowny: student 1 i student 4");
    	else
    		System.out.println("Nierowny: student 1 i student 4");
    	
    	if(s1.equals(s2))
    		System.out.println("Rowny: student 1 i student 2");
    	else
    		System.out.println("Nierowny: student 1 i student 2");
    	
    	if(s1.equals(s3))
    		System.out.println("Rowny: student 1 i student 3");
    	else
    		System.out.println("Nierowny: student 1 i student 3");
    	   	

	}

}
