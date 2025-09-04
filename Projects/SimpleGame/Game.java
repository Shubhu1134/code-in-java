import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Welcome to the Adventure Game ====");
        System.out.println("Choose your starting option:");
        System.out.println("1. Enter the Forest");
        System.out.println("2. Explore the Castle");
        System.out.println("3. Visit the Village");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nYou entered the Forest. It's dark and mysterious.");
                System.out.println("Choose your next move:");
                System.out.println("1. Fight a wild animal");
                System.out.println("2. Look for treasure");
                int forestChoice = sc.nextInt();
                if (forestChoice == 1) {
                    System.out.println("You fought bravely and survived! 🎉");
                } else {
                    System.out.println("You found a hidden treasure chest full of gold! 💰");
                }
                break;

            case 2:
                System.out.println("\nYou entered the Castle. It's spooky and haunted.");
                System.out.println("Choose your next move:");
                System.out.println("1. Talk to the ghost king");
                System.out.println("2. Search the royal library");
                int castleChoice = sc.nextInt();
                if (castleChoice == 1) {
                    System.out.println("The ghost king grants you a magical sword! ⚔️");
                } else {
                    System.out.println("You discovered a secret spellbook of power! 📖");
                }
                break;

            case 3:
                System.out.println("\nYou entered the Village. It's lively and warm.");
                System.out.println("Choose your next move:");
                System.out.println("1. Join a festival");
                System.out.println("2. Help a villager");
                int villageChoice = sc.nextInt();
                if (villageChoice == 1) {
                    System.out.println("You enjoyed dancing and food at the festival! 🥳");
                } else {
                    System.out.println("You helped a villager and earned respect! 🤝");
                }
                break;

            default:
                System.out.println("Invalid choice! Game Over.");
        }

        System.out.println("\n==== Thanks for playing! ====");
        sc.close();
    }
}
