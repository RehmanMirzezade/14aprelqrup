package lesson3;

	public class Electronic extends Product {

	    public Electronic(String name, double price) {
	        super(name, price);
	    }

	    @Override
	    public double calculateDiscount() {
	        double discountedPrice = price - (price * 0.20);
	        System.out.println(name + " üçün 20% endirimli qiymət: " + discountedPrice);
	        return discountedPrice;
	    }
	}


