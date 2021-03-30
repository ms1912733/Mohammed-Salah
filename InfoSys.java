import java.util.ArrayList;
import java.util.Scanner;

public class InfoSys {
	


	public static void main(String[] args) {
		

		ArrayList<Operation> operations = new ArrayList<Operation>();
		ArrayList<Rentable> rentables = new ArrayList<Rentable>();
		menu();
		
		
		
		
	}
	
	public static void menu() {
		Scanner keyboard = new Scanner (System.in);
		menuList();
		int input = keyboard.nextInt();
		switch(input) 
		{
		case 1:
			addCustomer();
			break;
		case 2:
			addRentable();
			break;
		case 3:
			rentRentable();
			break;
		case 4:
			listRentables();
			break;
		case 5:
			search();
			break;
		case 6:
			report();
			break;
		case 7:
			saveExit();
			break;}
	}
	
	public static void addCustomer() {
		Scanner keyboard = new Scanner (System.in);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		int id =0;
		String name;
		int nationalNo = 0;
		int day=0;
		int month=0;
		int year=0;
		System.out.println("Select Customer's type:\n[1]Citizen\n[2]Resident\n[3]Company: ");
		int input = keyboard.nextInt();;
		switch(input) 
		{
		
		case 1:		 	//Citizen
			
			System.out.println("Please Enter Citizen's ID: ");
			id = keyboard.nextInt();
			
			System.out.println("Please Enter Citizen's Name: ");
			name = keyboard.next();
			
			System.out.println("Please Enter Citizen's National Number: ");
			nationalNo = keyboard.nextInt();
			
			System.out.println("Please Enter Citizen's Birth Date\n Day: ");
			day = keyboard.nextInt();
			
			System.out.println("Month: ");
			month = keyboard.nextInt();
			
			System.out.println("Year: ");
			year = keyboard.nextInt();
			
			Date bdate = new Date(day,month,year);
			Citizen citizen = new Citizen (id,name,nationalNo,bdate);
			customers.add(citizen);
			break;
		
		case 2: 		//Resident
			System.out.println("Please Enter Resident's ID: ");
			id = keyboard.nextInt();
			
			System.out.println("Please Enter Resident's Name: ");
			name = keyboard.nextLine();
			
			System.out.println("Please Enter Resident's Residance: ");
			int residance= keyboard.nextInt();
			
			System.out.println("Please Enter Resident's Passport Number: ");
			String passportNo = keyboard.nextLine();
			
			System.out.println("Please Enter Resident's Nationality: ");
			String nationality = keyboard.nextLine();
			
			System.out.println("Please Enter Resident's Birth Date\n Day: ");
			day = keyboard.nextInt();
			
			System.out.println("Month: ");
			month = keyboard.nextInt();
			
			System.out.println("Year: ");
			year = keyboard.nextInt();
			
			Date bdate1 = new Date(day,month,year);
			Resident resident = new Resident(id,name,residance,passportNo,nationality, bdate1);
			break;

		case 3:			//Company
			System.out.println("Please Enter Company's ID: ");
			id = keyboard.nextInt();
			
			System.out.println("Please Enter Company's Name: ");
			name = keyboard.nextLine();
			
			System.out.println("Please Enter Company's Licence Number: ");
			String licenceNo= keyboard.nextLine();
			
			System.out.println("Please Enter Company's Loocation: ");
			String location = keyboard.nextLine();
			
			System.out.println("Please Enter Company's Expiry Date\n Day: ");
			day = keyboard.nextInt();
			
			System.out.println("Month: ");
			month = keyboard.nextInt();
			
			System.out.println("Year: ");
			year = keyboard.nextInt();
			
			Date expDate = new Date(day,month,year);
			Company company= new Company(id,name,licenceNo,location,expDate);
			break;
		}


	}
	public static void addRentable() {
		

	}
	public static void rentRentable() {

	}
	public static void listRentables() {

	}
	public static void search() {

	}
	public static void report() {

	}
	public static void saveExit() {}
	
	
	public static void menuList() {
		System.out.println("CHOOSE ONE OF THE FOLLOWING\n"+
	"=====================================\n"+ "[1] Add Customer\n" + "[2] Add Car/Real estate unit\n"+
				"[3] Rent Car/Real estate\n" + "[4] Return car/Real estate\n"+ "[5] Search\n"+
	"[6] Report\n" + "[7] Save data to the desk");
	}

}
