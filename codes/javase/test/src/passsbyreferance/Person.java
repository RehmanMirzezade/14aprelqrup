package passsbyreferance;

public class Person {
String name;
String surname;
int experinceyear;
double salary;
String phone;
public Person(String name,String surname,int experinceyear,String phone) {
	this.name = name;
	this.surname = surname;
	this.experinceyear = experinceyear;
	this.phone = phone;
			
}
public void printInfo() {
	System.out.println("Name " + name);
	System.out.println("Surname " + surname);
	System.out.println("Experinceyear " + experinceyear);
	System.out.println("Salary " + salary);
	System.out.println("Phone " + phone);
}

}
