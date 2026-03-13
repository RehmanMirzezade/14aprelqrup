package lesson2;
import java.util.Scanner;

public class Sual3 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Riyaziyyat balınızı daxil edin: ");
	        int riyaziyyat = input.nextInt();

	        System.out.print("Fizika balınızı daxil edin: ");
	        int fizika = input.nextInt();

	        if (riyaziyyat >= 60 && fizika >= 70) {
	            System.out.println("Hər iki dərsdən keçdiniz");
	        } else if (riyaziyyat < 60 && fizika < 70) {
	            System.out.println("Hər iki dərsdən kəsildiniz");
	        } else {
	            System.out.println("Bir fənndən uğurla keçdiniz, digər fənndən isə kəsildiniz");
	        }

	        input.close();
	    }
	}


