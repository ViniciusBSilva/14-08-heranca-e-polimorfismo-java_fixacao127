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
	public String priceTag() {

		StringBuilder sb = new StringBuilder();

		sb.append(getName());
		sb.append(" $ ");
		sb.append(String.format("%.2f", getPrice()));
		sb.append(" (Customs fee: $ ");
		sb.append(String.format("%.2f", customFee));
		sb.append(") %n");

		return sb.toString();

	}

}
