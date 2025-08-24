import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        PetMachine petMachine = new PetMachine();

        while (true) {
            System.out.println("1. Add Water");
            System.out.println("2. Add Shampoo");
            System.out.println("3. Set Pet");
            System.out.println("4. Take a Shower");
            System.out.println("5. Remove Pet");
            System.out.println("6. Wash Machine");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    petMachine.addWater();
                    break;
                case 2:
                    petMachine.addShampoo();
                    break;
                case 3:
                    System.out.print("Enter pet name: ");
                    String name = scanner.next();
                    Pet pet = new Pet(name, false);
                    petMachine.setPet(pet);
                case 4:
                    petMachine.takeAShower();
                    break;
                case 5:
                    petMachine.removePet();
                    break;
                case 6:
                    petMachine.washMachine();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
