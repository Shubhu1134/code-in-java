import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Welcome to the Adventure Game ====");

        int choice = getValidChoice(sc.
            "Choose your starting option:\n1. Enter the Forest\n2. Explore the Castle\n3. Visit the Village", 
            1, 3);

        switch (choice) {
            case 1 -> forestPath(sc);
            case 2 -> castlePath(sc);
            case 3 -> villagePath(sc);
            default -> System.out.println("Something went wrong!");
        }

        System.out.println("\n==== Thanks for playing! ====");
        sc.close();
    }

    // ========================= PATHS =========================

    private static void forestPath(Scanner sc) {
        int forestChoice = getValidChoice(sc, 
            "\nYou entered the Forest. It's dark and mysterious.\n" +
            "Choose your next move:\n1. Fight a wild animal\n2. Look for treasure", 
            1, 2);

        if (forestChoice == 1) {
            System.out.println("You fought bravely and survived! 🎉");
        } else {
            System.out.println("You found a hidden treasure chest full of gold! 💰");
        }
    }

    private static void castlePath(Scanner sc) {
        int castleChoice = getValidChoice(sc, 
            "\nYou entered the Castle. It's spooky and haunted.\n" +
            "Choose your next move:\n1. Talk to the ghost king\n2. Search the royal library", 
            1, 2);

        if (castleChoice == 1) {
            System.out.println("The ghost king grants you a magical sword! ⚔️");
        } else {
            System.out.println("You discovered a secret spellbook of power! 📖");
        }
    }

    private static void villagePath(Scanner sc) {
        int villageChoice = getValidChoice(sc, 
            "\nYou entered the Village. It's lively and warm.\n" +
            "Choose your next move:\n1. Join a festival\n2. Help a villager", 
            1, 2);

        if (villageChoice == 1) {
            System.out.println("You enjoyed dancing and food at the festival! 🥳");
        } else {
            System.out.println("You helped a villager and earned respect! 🤝");
        }
    }

    // ========================= VALIDATION =========================
    private static int getValidChoice(Scanner sc, String message, int min, int max) {
        int choice = -1;
        while (true) {
            System.out.println("\n" + message);
            System.out.print("Enter your choice (" + min + "-" + max + "): ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= min && choice <= max) {
                    break; // ✅ valid input
                } else {
                    System.out.println("❌ Invalid number! Please choose between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("❌ Invalid input! Please enter a number.");
                sc.next(); // clear wrong input
            }
        }
        return choice;
    }
}
