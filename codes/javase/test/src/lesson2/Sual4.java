package lesson2;
import java.util.Scanner;

public class Sual4 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Həftənin bir gününü daxil edin (məs: Bazar ertəsi): ");
	        String gun = input.nextLine();

	        switch (gun) {
	            case "Şənbə":
	            case "Bazar":
	                System.out.println("Həftə sonu");
	                break;

	            case "Bazar ertəsi":
	            case "Cümə":
	                System.out.println("Həftənin başlanğıcı və ya sonu");
	                break;

	            default:
	                System.out.println("Həftə içi");
	                break;
	        }

	        input.close();
	    }
	}


