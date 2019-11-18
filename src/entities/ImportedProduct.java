package entities;

public class ImportedProduct extends Product {

	private double customFee;

	public ImportedProduct(String name, double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}

	public Double totalPrice() {
		return customFee + getPrice();

	}

	@Override
	public String priceTag() {			//TODO code
		// TODO Auto-generated method stub
		return "ImportedProduct [customFee=" + customFee + ", getCustomFee()=" + getCustomFee() + ", totalPrice()="
				+ totalPrice() + ", priceTag()=" + priceTag() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + "]";
	}

}
