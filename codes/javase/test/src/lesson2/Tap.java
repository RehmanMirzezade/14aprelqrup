package lesson2;

import java.util.Scanner;

public class Tap {
public static void main(String[] args) {
	Scanner tap = new Scanner(System.in);
	System.out.println("Zehmet olmasa 2 reqemli eded daxil edin: ");
	int a = tap.nextInt();
	while(a<100) {
		System.out.println(a);
		a+=7;
	}
}
}
