package fixacao127.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public UsedProduct(String name, double price, String manufactureDate) throws ParseException {
		super(name, price);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.manufactureDate = sdf.parse(manufactureDate);
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		this.manufactureDate = sdf.parse(manufactureDate);
	}
	
	@Override
	public String priceTag() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();

		sb.append(getName());
		sb.append(" (used) $ ");
		sb.append(String.format("%.2f", getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(sdf.format(manufactureDate));
		sb.append(") ");

		return sb.toString();

	}

}
