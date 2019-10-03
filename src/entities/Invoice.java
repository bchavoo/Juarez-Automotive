package entities;

import java.util.ArrayList;

public class Invoice {
	
	private String invoiceNumber;
	private String invoiceDate;
	private ArrayList<Products> invoiceProducts;
	private double subTotal;
	private double tax;
	private double total;
	private double payment;

	public Invoice(String invoiceNumber, String invoiceDate, ArrayList<Products> invoiceProducts, double subTotal,
			double tax, double total, double payment) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
		this.invoiceProducts = invoiceProducts;
		this.subTotal = subTotal;
		this.tax = tax;
		this.total = total;
		this.setPayment(payment);
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public ArrayList<Products> getInvoiceProducts() {
		return invoiceProducts;
	}

	public void setInvoiceProducts(ArrayList<Products> invoiceProducts) {
		this.invoiceProducts = invoiceProducts;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
}
