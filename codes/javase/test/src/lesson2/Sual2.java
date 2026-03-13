package lesson2;

import java.util.Scanner;

public class Sual2 {
	public static void main(String[] args) {
		Scanner input2 = new Scanner(System.in);
		System.out.println("1ci ededi daxil edin zehmet olmasa: ");
int a = input2.nextInt();
System.out.println("2ci ededi daxil edin zehmet olmasa: ");
int b = input2.nextInt();
if(a>b) {
	System.out.println("a ededi daha boyukdur!");
	
}else if(a==b) {
	System.out.println("her iki eded beraberdir!");
}
else {
	System.out.println("b ededi daha boyukdur!");
}
;	}
}
