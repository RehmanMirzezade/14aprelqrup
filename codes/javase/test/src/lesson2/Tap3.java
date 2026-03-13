package lesson2;

public class Tap3 {

	    public static void main(String[] args) {

	        Person p1 = new Person();
	        Person p2 = new Person();

	        p1.id = 1;
	        p1.name = "Kamran";
	        p1.surname = "Aliyev";
	        p1.age = 25;
	        p1.phone = "0501234567";

	        p2.id = 2;
	        p2.name = "Aysel";
	        p2.surname = "Mammadova";
	        p2.age = 30;
	        p2.phone = "0709876543";

	        System.out.println("Person 1 məlumatları:");
	        System.out.println("ID: " + p1.id);
	        System.out.println("Name: " + p1.name);
	        System.out.println("Surname: " + p1.surname);
	        System.out.println("Age: " + p1.age);
	        System.out.println("Phone: " + p1.phone);

	        System.out.println("Person 2 məlumatları:");
	        System.out.println("ID: " + p2.id);
	        System.out.println("Name: " + p2.name);
	        System.out.println("Surname: " + p2.surname);
	        System.out.println("Age: " + p2.age);
	        System.out.println("Phone: " + p2.phone);
	    }
	}

	