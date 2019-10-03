package driver;

import java.io.IOException;
import java.util.List;
//New imports
import java.util.Scanner;

import reader.DataReader;
import entities.Invoice;


public class Driver {

	public static void main(String[] args) throws IOException {
		
		List<Invoice> InvoiceList = DataReader.createInvoiceList();


	}

}
