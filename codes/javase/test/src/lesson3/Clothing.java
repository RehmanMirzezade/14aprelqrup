package lesson3;

	public class Clothing extends Product {

	    public Clothing(String name, double price) {
	        super(name, price);
	    }

	    @Override
	    public double calculateDiscount() {
	        double discountedPrice = price - (price * 0.15);
	        System.out.println(name + " üçün 15% endirimli qiymət: " + discountedPrice);
	        return discountedPrice;
	    }
	}


