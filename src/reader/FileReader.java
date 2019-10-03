package reader;

import java.util.ArrayList;
import java.util.List;

import entities.Invoice;
import entities.Person;
import entities.Product;

public class FileReader {

	/**
	 * This is where we will read from a file and store all the information needed
	 * Possibly read from a Excel sheet, looking for a easy user friendly and
	 * Java accessible way to read in input
	 */
	
	public static List<Person> personList = new ArrayList<Person>();
	public static List<Product> productList = new ArrayList<Product>();
	public static List<Invoice> invoiceList = new ArrayList<Invoice>();
	
	//Processing Person file below--------------------------------------------
	public static List<Person> createPersonList() {
		
		return personList;
	}
	
	
	//Processing Product file below--------------------------------------------
	public static List<Product> createProductList() {
		
		return productList;
	}
	
	
	//Processing Invoice file below--------------------------------------------
	public static List<Invoice> createInvoiceList() {
	
		return invoiceList;
	}
}
