package driver;

import java.io.IOException;
//New imports
import java.util.Scanner; 


public class InvoiceReport {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome! Benvenido!");
		
		//Ask for language, will run same calcs just promt differently
		System.out.println("What language? Que lengua quieres? 1=English 2=Spanish");
		Scanner scanLang = new Scanner(System.in);
		int language = scanLang.nextInt();

		
		//Still need to scan for language		
		if(language == 1) {
			
			System.out.println("You selected English!");
			//Attain name of customer
			System.out.print("Enter the customer's first and last name: ");
			Scanner scanner = new Scanner(System.in);
			String fullName = scanner.nextLine();
			System.out.println("The name you entered was " + fullName);
			
		} else if (language == 2) {
			
			System.out.println("Tu selecionastes Espanol!");
			//Attain name of customer
			System.out.print("Escribe el primer nombre y apellido cliente: ");
			Scanner scanner = new Scanner(System.in);
			String fullName = scanner.nextLine();
			System.out.println("El nombre es " + fullName);
			
		} else {
			System.out.println("Error no language selected... terminating program");
			System.out.println("Error no selecion de lengua... finalizando programa");
			System.exit(1);
		}
		
		
		System.out.println("Goodbye.");
		System.exit(1);


	}

}
