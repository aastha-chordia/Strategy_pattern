// Aastha Chordia
// 23070126003

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        while (true) {
            // Displaying menu options
            System.out.println("\n--- Duck Simulation ---");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Redhead Duck");
            System.out.println("3. Rubber Duck");
            System.out.println("4. Decoy Duck");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt(); // For reading user input
            Duck duck = null; // Declaring a Duck reference
