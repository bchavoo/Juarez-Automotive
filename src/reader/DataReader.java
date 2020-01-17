package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import entities.Address;
import entities.General;
import entities.Invoice;
import entities.InvoiceProducts;
import entities.Member;
import entities.Person;
import entities.Student;
import product.DayMembership;
import product.RentalEquipment;
import product.ParkingPass;
import product.Product;
import product.YearMembership;

public class DataReader {

	//These are the lists we will store the CSV information in
	public static Person personInformation = new Person;
	public static List<Service> serviceList = new ArrayList<Service>();
	public static int numberOfProducts = 0;

	//Process the CSV file
	//First name, last, number, address

	public static Person getPersonInformation() {


		return productList;
	}



	public static List<Invoice> createInvoiceList() {
		List<Invoice> invoiceList = new ArrayList<Invoice>();


		return invoiceList;
	}

}
