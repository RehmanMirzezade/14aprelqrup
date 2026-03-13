package lesson2;

public class Book {


	    public static void main(String[] args) {

	        Book2 book1 = new Book2();
	        book1.id = 1;
	        book1.name = "Java Programming";
	        book1.author = "John Doe";
	        book1.pageCount = 350;
	        book1.description = "Learn the basics of Java.";

	        Book2 book2 = new Book2();
	        book2.id = 2;
	        book2.name = "OOP Concepts";
	        book2.author = "Alice Smith";
	        book2.pageCount = 220;
	        book2.description = "Understanding Object-Oriented Programming.";

	        System.out.println("Book 1:");
	        System.out.println("ID: " + book1.id);
	        System.out.println("Name: " + book1.name);
	        System.out.println("Author: " + book1.author);
	        System.out.println("Page Count: " + book1.pageCount);
	        System.out.println("Description: " + book1.description);

	        System.out.println("\nBook 2:");
	        System.out.println("ID: " + book2.id);
	        System.out.println("Name: " + book2.name);
	        System.out.println("Author: " + book2.author);
	        System.out.println("Page Count: " + book2.pageCount);
	        System.out.println("Description: " + book2.description);
	    }
	}


