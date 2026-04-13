import java.util.Scanner; // Import Scanner for user input

public class Main {

public static void main(String[] args) {

// Create Scanner object to read user input
Scanner input = new Scanner(System.in);

// Create Login object
Login login = new Login();

// ----- REGISTRATION -----
System.out.println("=== Registration ===");

// Ask user for username
System.out.print("Enter username: ");
String username = input.nextLine();

// Ask user for password
System.out.print("Enter password: ");
String password = input.nextLine();

// Ask user for phone number
System.out.print("Enter phone number (+27...): ");
String phone = input.nextLine();

// Call registerUser method and display result
System.out.println(login.registerUser(username, password, phone));

// ----- LOGIN -----
System.out.println("\n=== Login ===");

// Ask user to enter login username
System.out.print("Enter username: ");
String loginUser = input.nextLine();

// Ask user to enter login password
System.out.print("Enter password: ");
String loginPass = input.nextLine();

// Call loginUser method
boolean status = login.loginUser(loginUser, loginPass);

// Display login result
System.out.println(login.returnLoginStatus(status, "John", "Doe"));

// Close Scanner to prevent memory leaks
input.close();
}
}
