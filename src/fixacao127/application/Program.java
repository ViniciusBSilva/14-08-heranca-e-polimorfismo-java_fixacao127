package fixacao127.application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fixacao127.entities.ImportedProduct;
import fixacao127.entities.Product;
import fixacao127.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();
		System.out.print("\n");
		
		List<Product> products = new ArrayList<Product>();

		for (int i = 0; i < quantity; i++) {

			System.out.printf("Product #%d data: \n", i+1);

			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			sc.nextLine();

			if (productType == 'c' || productType == 'u' || productType == 'i') {

				System.out.print("Name: ");
				String name = sc.next();
				sc.nextLine();

				System.out.print("Price: $ ");
				Double price = sc.nextDouble();

				switch (productType) {

				case 'c':

					products.add(new Product(name, price));
					
					break;

				case 'u':

					System.out.print("Manufacture date (DD/MM/YYYY): ");
					String manufactureDate = sc.next();
					sc.nextLine();
					
					products.add(new UsedProduct(name, price, manufactureDate));
					
					break;

				case 'i':

					System.out.print("Customs fee: $ ");
					Double customFee = sc.nextDouble();
					
					products.add(new ImportedProduct(name, price, customFee));
					
					break;

				default:
					break;

				}

			} else {
				System.out.println("Wrong type entered!");
			}
			
			System.out.print("\n");

		}

		for (Product product : products) {
			System.out.println(product);
		}
	
		
		sc.close();

	}

}
