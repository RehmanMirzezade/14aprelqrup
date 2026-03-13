package accesMOdifiers;
	public class InventoryItem {
	    private String name;
	    private int quantity;
	    private double price;
	    public InventoryItem(String name, int quantity, double price) {
	        this.name = name;
	        setQuantity(quantity);
	        setPrice(price);
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getQuantity() {
	        return quantity;
	    }
	    public void setQuantity(int quantity) {
	        if (quantity < 0) {
	            this.quantity = 0;
	        } else {
	            this.quantity = quantity;
	        }
	    }
	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	        if (price >= 0) {
	            this.price = price;
	        }
	    }
	}