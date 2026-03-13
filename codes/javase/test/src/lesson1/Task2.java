package lesson1;

	import java.util.ArrayList;

	public class Task2 {
	    public static void main(String[] args) {

	        ArrayList<String> list = new ArrayList<>();

	        list.add("Java");
	        list.add("Python");
	        list.add("C++");
	        list.add("JavaScript");

	        System.out.println("Original list: " + list);

	        ArrayList<String> reversedList = new ArrayList<>();

	        for (int i = list.size() - 1; i >= 0; i--) {
	            reversedList.add(list.get(i));
	        }

	        System.out.println("Reversed list: " + reversedList);
	    }
	}

