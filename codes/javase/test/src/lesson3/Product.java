package lesson3;

public class Product {
	    String name;
	    double price;

	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public double calculateDiscount() {
	        double discountedPrice = price - (price * 0.10);
	        System.out.println(name + " üçün 10% endirimli qiymət: " + discountedPrice);
	        return discountedPrice;
	    }
	}

