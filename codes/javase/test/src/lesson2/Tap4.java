package lesson2;

public class Tap4 {

	    public static void main(String[] args) {

	        Employee e1 = new Employee(); 
	        Employee e2 = new Employee("Kamran"); 
	        Employee e3 = new Employee("Aysel", "Mammadova");
	        Employee e4 = new Employee("Rashad", "0551234567", 1200);

	        System.out.println("\n--- Employee 1 ---");
	        e1.printInfo();

	        System.out.println("\n--- Employee 2 ---");
	        e2.printInfo();

	        System.out.println("\n--- Employee 3 ---");
	        e3.printInfo();

	        System.out.println("\n--- Employee 4 ---");
	        e4.printInfo();
	    }
	}


	

