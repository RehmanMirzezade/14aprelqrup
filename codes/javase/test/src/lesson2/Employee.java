package lesson2;

public class Employee {

	    Integer id;
	    String name;
	    String surname;
	    String phone;
	    String address;
	    int salary;

	    public Employee() {
	        System.out.println("Default constructor çağırıldı.");
	    }
	    public Employee(String name_){
	        this.name = name_;

	        System.out.println("Name qəbul edən constructor çağırıldı.");
	        System.out.println("Name: " + name);
	    }

	    public Employee(String name, String surname) {
	        this.name = name;
	        this.surname = surname;

	        System.out.println("Name və Surname qəbul edən constructor çağırıldı.");
	        System.out.println("Name: " + name);
	        System.out.println("Surname: " + surname);
	    }

	   public Employee(String name, String phone, int salary) {
	        this.name = name;
	        this.phone = phone;
	        this.salary = salary;

	        System.out.println("Name, Phone və Salary qəbul edən constructor çağırıldı.");
	        System.out.println("Name: " + name);
	        System.out.println("Phone: " + phone);
	        System.out.println("Salary: " + salary);
	    }

	   public void printInfo() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Surname: " + surname);
	        System.out.println("Phone: " + phone);
	        System.out.println("Address: " + address);
	        System.out.println("Salary: " + salary);
	    }
	}

