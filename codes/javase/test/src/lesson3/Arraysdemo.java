package lesson3;

public class Arraysdemo {
	    public static void main(String[] args) {

	        int[] numbers = {12, 7, 20, 3, 15};

	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        System.out.println("Massivin elementlərinin cəmi: " + sum);


	        double average = (double) sum / numbers.length;
	        System.out.println("Massivin elementlərinin ədədi ortası: " + average);


	        int min = numbers[0];
	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	        }
	        System.out.println("Massivin ən kiçik elementi: " + min);


	        System.out.print("Massivin tək elementləri: ");
	        for (int num : numbers) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println();
	    }
	}

}