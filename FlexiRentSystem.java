import java.util.Scanner;

public class FlexiRentSystem {

	private void printMenu() {
		System.out.print(
				"**** FLEXIRENT SYSTEM MENU ****\r\n" + 
				"\r\n" + 
				"Add Property:			1\r\n" + 
				"Rent Property:			2\r\n" + 
				"Return Property:		3\r\n" + 
				"Property Maintenance:		4\r\n" + 
				"Complete Maintenance:		5\r\n" + 
				"Display All Properties:		6\r\n" + 
				"Exit Program:			7\r\n" + 
				"Enter your choice: 		\r");
	}
	
	private void getOption() {
		
		Scanner input = new Scanner(System.in);
		String option = "";
		option = input.nextLine();
		switch(option) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;
		case "7":
			input.close();
			System.exit(0);
			break;
			default:
				break;	
		}
	}
	
	private void addProperty() {
		
	}
	
	private void rentProperty() {
		
	}
	
	private void returnProperty() {
		
	}
	
	private void propertyMaintenance() {
		
	}
	
	private void completeMaintenance() {
		
	}
	
	private void diplayAllProperty() {
		
	}
	
	public void run() {
		while(true) {
			printMenu();
			getOption();
		}
	}
}
