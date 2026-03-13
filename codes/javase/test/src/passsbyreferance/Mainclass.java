package passsbyreferance;

public class Mainclass {
public static void main(String[] args) {
	Person p = new Person("rehman","mirzezade",4,"+99391291");
	p.printInfo();
	SalaryCalcutor sc = new SalaryCalcutor();
	sc.calculatesalary(p);
}
}
