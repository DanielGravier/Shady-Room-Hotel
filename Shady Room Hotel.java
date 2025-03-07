import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display room choices
        System.out.println("Welcome to the Shady Rest Hotel!");
        System.out.println("Please choose a room type:");
        System.out.println("1 - Queen Bed ($125)");
        System.out.println("2 - King Bed ($139)");
        System.out.println("3 - Suite (King Bed + Pullout Couch) ($165)");
        System.out.print("Enter your choice (1-3): ");

        // Get user input
        int roomChoice = input.nextInt();
        int price = 0;
        String roomType = "Invalid Selection";

        // Determine room price and type
        switch (roomChoice) {
            case 1:
                roomType = "Queen Bed";
                price = 125;
                break;
            case 2:
                roomType = "King Bed";
                price = 139;
                break;
            case 3:
                roomType = "Suite (King Bed + Pullout Couch)";
                price = 165;
                break;
            default:
                System.out.println("Invalid room selection. Setting price to $0.");
        }

        // Ask for view choice if the room selection was valid
        if (price > 0) {
            System.out.println("Please choose a view:");
            System.out.println("1 - Lake View (adds $15)");
            System.out.println("2 - Park View (no extra charge)");
            System.out.print("Enter your choice (1-2): ");

            int viewChoice = input.nextInt();
            String viewType;

            // Determine view type
            if (viewChoice == 1) {
                price += 15;
                viewType = "Lake View";
            } else if (viewChoice == 2) {
                viewType = "Park View";
            } else {
                System.out.println("Invalid view selection. Defaulting to Lake View.");
                price += 15;
                viewType = "Lake View";
            }

            // Display the final room type, view, and total price
            System.out.println("You selected: " + roomType + " with " + viewType);
            System.out.println("Total price: $" + price);
        }

        input.close();
    }
}





import java.util.Scanner;

    public class ShadyRestRoom{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to the Shady Hotel!");
    System.out.println("Please choose one of the room types");
    System.out.println("1 - Queen Bed ($125)");
    System.out.println("2 - King Bed ($139)");
    System.out.println("3 - Suite (King Bed + Pullout Couch) ($165)");
    System.out.println("Enter your choice (1-3): ");

    int roomChoice = input.nextInt();
        int price = 0;
        String roomType;

        switch (roomChoice) {
            case 1:
                roomType = "Queen Bed";
                price = 125;
                break;
            case 2:
                roomType = "King Bed";
                price = 139;
                break;
            case 3:
                roomType = "Suite (King Bed + Pullout Couch)";
                price = 165;
                break;
            default:
                roomType = "Invalid Selection";
                System.out.println("Invalid room selection.");

                
        }
	if (price > 0) {
                    System.out.println("You selected: " + roomType);
                    System.out.println("Total price: $" + price);
                }
      }
    }

