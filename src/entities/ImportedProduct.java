package entities;

public class ImportedProduct extends Product {

	private Double customFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
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
