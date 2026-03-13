package lesson1;
	import java.util.ArrayList;
	import java.util.List;

	public class Task1 {
	    public static void main(String[] args) {

	        List<Integer> numbers = new ArrayList<>();

	        int start = 10;

	        while (numbers.size() < 40) {
	            if (start % 2 == 0) { 
	                numbers.add(start);
	            }
	            start++;
	        }

	        System.out.println(numbers);
	    }
	}


