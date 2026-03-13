package lesson3;
import java.util.Arrays;

public class Evisi {

	    public static void main(String[] args) {

	        int[] numbers = {14, 7, 21, 9};

	        int sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        System.out.println("Adi for ilə cəm: " + sum);

	        System.out.print("Foreach ilə massiv elementləri: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();


	        double average = (double) sum / numbers.length;
	        System.out.println("Massivin ədədi ortası: " + average);


	        int min = numbers[0];
	        int max = numbers[0];

	        for (int num : numbers) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        System.out.println("Massivin ən kiçik elementi: " + min);
	        System.out.println("Massivin ən böyük elementi: " + max);


	        System.out.print("Tək elementlər: ");
	        for (int num : numbers) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println();

	        System.out.print("Cüt elementlər: ");
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println();


	        System.out.print("Sadə ədədlər: ");
	        for (int num : numbers) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println();


	        Arrays.sort(numbers);  

	        for (int i = 0; i < numbers.length / 2; i++) {
	            int temp = numbers[i];
	            numbers[i] = numbers[numbers.length - 1 - i];
	            numbers[numbers.length - 1 - i] = temp;
	        }

	        System.out.println("Massiv (azalan sıra ilə): " + Arrays.toString(numbers));
	    }

	    static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	}


