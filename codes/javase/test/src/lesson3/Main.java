package lesson3;

public class Main {
	    public static void main(String[] args) {

	        Product product = new Product("Adi məhsul", 100);
	        product.calculateDiscount();

	        Electronic electronic = new Electronic("Telefon", 2000);
	        electronic.calculateDiscount();

	        Clothing clothing = new Clothing("Köynək", 150);
	        clothing.calculateDiscount();
	    }
	}


