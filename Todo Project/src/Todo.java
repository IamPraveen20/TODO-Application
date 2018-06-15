import java.util.Scanner;

public class Todo {

	static TodoFunction mytodolist = new TodoFunction();
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int choices = 0;
		boolean exit = false;
		
		printcommand();
		while (!exit) {
			
			System.out.println("Enter your choices");
			
			
			choices = scan.nextInt();
			scan.nextLine();

			switch (choices) {
			case 0:
				printcommand();
				break;
			case 1:
				mytodolist.printlist();
				break;
			case 2:
				Additem();
				break;
			case 3:
				Removeitem();
				break;
			case 4:
				Updateitem();
				break;
			case 5:
				Searchitem();
				break;
			case 6:
				exit = true;
				break;
			
				default :
					System.out.println("Pick from given choices");
			}

			
			
		}
	}

	public static void printcommand() {
		System.out.println("\n Choices  " + "\n press 0: To print all the Instructions "
				+ "\n press 1: To print the list " + "\n press 2: To add item into TODO list "
				+ "\n press 3: To remove item from TODO list " + "\n press 4: To modify the item in TODO list"
				+ "\n press 5: To search for an item in TODO list  " + "\n press 6: To exit the app");
	}

	public static void Additem() {
		System.out.println("Enter the item to be added in TODO list");
		mytodolist.additem(scan.nextLine());
	}

	public static void Removeitem() {
		System.out.println("Enter the item number to be deleted");
		int index = scan.nextInt();
		mytodolist.removeitem(index-1 );
	}

	public static void Updateitem() {
		System.out.println("Enter the item number");
		int index = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the new item to be added in list");
		String newitem = scan.nextLine();
		mytodolist.updatelist(index-1 , newitem);
	}

	public static void Searchitem() {
		System.out.println("Enter the item to be searched");
		String searchitem = scan.nextLine();
		if (mytodolist.finditem(searchitem) == null) {
			System.out.println("Item not found in your TODO list");
		} else {
			System.out.println(searchitem + "was found in your list");
		}
	}
	
}
