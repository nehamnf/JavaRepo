package javaconcepts;

import java.io.Console;

public class TakingInputFromConsoleDemo {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }


        // Reading a line of input
        String username = console.readLine("Enter your username: ");
        System.out.println("Username: " + username);

        // Reading a password without echoing
        char[] passwordArray = console.readPassword("Enter your password: ");
        String password = new String(passwordArray);
        System.out.println("Password entered successfully.");

        // Formatted output
        console.printf("Welcome, %s!%n", username);
    }
}
