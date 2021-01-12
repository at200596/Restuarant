package restaurant;

import java.util.Scanner;
import java.util.ArrayList;

public class Restaurant {

    static Scanner input = new Scanner(System.in);
    private static ArrayList<order> orders = new ArrayList<>();
    static boolean finished = false;
    static int orderNo = 0;

    public static void main(String[] args) {

        while (finished == false) {
            System.out.println("Hello, welcome to Ailise's restuarant");
            System.out.println("What would you like to do?");
            System.out.println("1 - Order food");
            System.out.println("2 - View my order");
            System.out.println("3 - Exit restaurant");
            int usersChoice = input.nextInt();

            switch (usersChoice) {
                case 1:
                    orderFood();
                    break;
                case 2:
                    viewOrder();
                    break;
                case 3:
                    System.out.println("Thank you for using Ailise's restaurant");
                    finished = true;
                    break;
            }
        }
    }

    public static void orderFood() {
        System.out.println("We serve 3 different foods here, which menu would you like?");
        System.out.println("1 - English Menu");
        System.out.println("2 - Spanish Menu");
        System.out.println("3 - Chinese Menu");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                englishMenu();
                break;
            case 2:
                spanishMenu();
                break;
            case 3:
                chineseMenu();
                break;
        }

    }

    public static void englishMenu() {
        String starter = null;
        String main = null;
        String dessert = null;
        String side = null;
        Double total = 0.0;

        System.out.println("You have chosen the English Menu");
        System.out.println("Would you like a starter?(y/n)");
        String starterWanted = input.next();

        if (starterWanted.equals("y")) {
            System.out.println("Which starter would you like?");
            System.out.println("1 - Dough balls (£5)");
            System.out.println("2 - Soup (£3)");
            System.out.println("3 - Salad (£4)");
            System.out.println("4 - No longer want starter");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    starter = "Dough Balls";
                    total = total + 5;
                    break;
                case 2:
                    starter = "Soup";
                    total = total + 3;
                    break;
                case 3:
                    starter = "Salad";
                    total = total + 4;
                    break;
                case 4:
                    starter = "No starter";
                    break;
            }
        } else {
            starter = "No starter";
        }

        System.out.println("Lets move onto your main order");
        System.out.println("Which main meal would you like?");
        System.out.println("1 - Burger (£12)");
        System.out.println("2 - Fish and Chips (£10)");
        System.out.println("3 - Spaghetti Bolognese (£8)");
        int userChoiceTwo = input.nextInt();

        switch (userChoiceTwo) {
            case 1:
                main = "Burger";
                total = total + 12;
                break;
            case 2:
                main = "Fish and Chips";
                total = total + 10;
                break;
            case 3:
                main = "Spaghetti Bolognese";
                total = total + 10;
                break;
        }

        System.out.println("Would you like a side?(y/n)");
        String sideWanted = input.next();

        if (sideWanted.equalsIgnoreCase("y")) {
            System.out.println("What side would you like?");
            System.out.println("1 - Extra Chips (£2)");
            System.out.println("2 - Cauliflower Cheese (£2)");
            System.out.println("3 - Yorkshire puddings (£2)");
            System.out.println("4 - No longer want side");
            int userChoiceThree = input.nextInt();

            switch (userChoiceThree) {
                case 1:
                    side = "Extra Chips";
                    total = total + 2;
                    break;
                case 2:
                    side = "Cauliflower Cheese";
                    total = total + 2;
                    break;
                case 3:
                    side = "Yorkshire puddings";
                    total = total + 2;
                    break;
                case 4:
                    side = "No side";
                    break;
            }
        } else {
            side = "No side";
        }

        System.out.println("Finally, dessert");
        System.out.println("Would you like a dessert?(y/n)");
        String dessertWanted = input.next();

        if (dessertWanted.equalsIgnoreCase("y")) {
            System.out.println("What dessert would you like?");
            System.out.println("1 - Banoffee pie (£3)");
            System.out.println("2 - Ice cream (£2)");
            System.out.println("3 - Apple pie (£3)");
            System.out.println("4 - No longer want dessert");
            int userChoiceFour = input.nextInt();

            switch (userChoiceFour) {
                case 1:
                    dessert = "banofee Pie";
                    total = total + 3;
                    break;
                case 2:
                    dessert = "Ice Cream";
                    total = total + 2;
                    break;
                case 3:
                    dessert = "Apple pie";
                    total = total + 3;
                    break;
                case 4:
                    dessert = "No dessert";
                    break;
            }
        } else {
            dessert = "No dessert";
        }

        System.out.println("");
        System.out.println("Your order is:");
        order userOrder = new order(orderNo, starter, main, side, dessert, total);
        System.out.println(userOrder.toString());
        orders.add(userOrder);
        orderNo++;

    }

    public static void spanishMenu() {
        String starter = null;
        String main = null;
        String dessert = null;
        String side = null;
        Double total = 0.0;

        System.out.println("You have chosen the Spanish Menu");
        System.out.println("Would you like a starter?(y/n)");
        String starterWanted = input.next();

        if (starterWanted.equals("y")) {
            System.out.println("Which starter would you like?");
            System.out.println("1 - Prawns (£3)");
            System.out.println("2 - Patatas Bravas (potatoes) (£4)");
            System.out.println("3 - Tapas (£7)");
            System.out.println("4 - No longer want starter");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    starter = "Prawns";
                    total = total + 3;
                    break;
                case 2:
                    starter = "Patatas Bravas";
                    total = total + 4;
                    break;
                case 3:
                    starter = "Tapas";
                    total = total + 7;
                    break;
                case 4:
                    starter = "No starter";
                    break;
            }
        } else {
            starter = "No starter";
        }

        System.out.println("Lets move onto your main order");
        System.out.println("Which main meal would you like?");
        System.out.println("1 - Paella (£12)");
        System.out.println("2 - Roast Chicken (£10)");
        System.out.println("3 - Gazpacho (£7)");
        int userChoiceTwo = input.nextInt();

        switch (userChoiceTwo) {
            case 1:
                main = "Paella";
                total = total + 12;
                break;
            case 2:
                main = "Roast Chicken";
                total = total + 10;
                break;
            case 3:
                main = "Gazpacho";
                total = total + 7;
                break;
        }

        System.out.println("Would you like a side?(y/n)");
        String sideWanted = input.next();

        if (sideWanted.equalsIgnoreCase("y")) {
            System.out.println("What side would you like?");
            System.out.println("1 - Extra Chips (£2)");
            System.out.println("2 - Croquetas (£3)");
            System.out.println("3 - Bread and Allioli (£3)");
            System.out.println("4 - No longer want side");
            int userChoiceThree = input.nextInt();

            switch (userChoiceThree) {
                case 1:
                    side = "Extra Chips";
                    total = total + 2;
                    break;
                case 2:
                    side = "Croquetas";
                    total = total + 3;
                    break;
                case 3:
                    side = "Bread and Allioli";
                    total = total + 3;
                    break;
                case 4:
                    side = "No side";
                    break;
            }
        } else {
            side = "No side";
        }

        System.out.println("Finally, dessert");
        System.out.println("Would you like a dessert?(y/n)");
        String dessertWanted = input.next();

        if (dessertWanted.equalsIgnoreCase("y")) {
            System.out.println("What dessert would you like?");
            System.out.println("1 - ice Cream (£2)");
            System.out.println("2 - Tarta de queso (cheesecake) (£3)");
            System.out.println("3 - Churros with Chocolate sauce (£3)");
            System.out.println("4 - No longer want dessert");
            int userChoiceFour = input.nextInt();

            switch (userChoiceFour) {
                case 1:
                    dessert = "Ice cream";
                    total = total + 2;
                    break;
                case 2:
                    dessert = "Tarta de queso";
                    total = total + 3;
                    break;
                case 3:
                    dessert = "Churros";
                    total = total + 3;
                    break;
                case 4:
                    dessert = "No dessert";
                    break;
            }
        } else {
            dessert = "No dessert";
        }

        System.out.println("");
        System.out.println("Your order is:");
        order userOrder = new order(orderNo, starter, main, side, dessert, total);
        System.out.println(userOrder.toString());
        orders.add(userOrder);
        orderNo++;

    }

    public static void chineseMenu() {
        String starter = null;
        String main = null;
        String dessert = null;
        String side = null;
        Double total = 0.0;

        System.out.println("You have chosen the Chinese Menu");
        System.out.println("Would you like a starter?(y/n)");
        String starterWanted = input.next();

        if (starterWanted.equals("y")) {
            System.out.println("Which starter would you like?");
            System.out.println("1 - Prawn Crackers (£3)");
            System.out.println("2 - Spring Rolls (£3)");
            System.out.println("3 - Sweet chili potatoes (£3)");
            System.out.println("4 - No longer want starter");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    starter = "Prawn Crackers";
                    total = total + 3;
                    break;
                case 2:
                    starter = "Spring rolls";
                    total = total + 3;
                    break;
                case 3:
                    starter = "Sweet chili potatoes";
                    total = total + 3;
                    break;
                case 4:
                    starter = "No starter";
                    break;
            }
        } else {
            starter = "No starter";
        }

        System.out.println("Lets move onto your main order");
        System.out.println("Which main meal would you like?");
        System.out.println("1 - Sweet and sour chicken (with rice) (£8)");
        System.out.println("2 - Duck pancakes (£10)");
        System.out.println("3 - Chicken and Blackbean sauce (with rice) (£8)");
        int userChoiceTwo = input.nextInt();

        switch (userChoiceTwo) {
            case 1:
                main = "Sweet and Sour Chicken";
                total = total + 12;
                break;
            case 2:
                main = "Duck pancakes";
                total = total + 10;
                break;
            case 3:
                main = "Chicken and Blackbean";
                total = total + 7;
                break;
        }

        System.out.println("Would you like a side?(y/n)");
        String sideWanted = input.next();

        if (sideWanted.equalsIgnoreCase("y")) {
            System.out.println("What side would you like?");
            System.out.println("1 - Extra Rice (£2)");
            System.out.println("2 - Chicken Egg Drop Soup (£3)");
            System.out.println("3 - Small Stir Fry (£4)");
            System.out.println("4 - No longer want side");
            int userChoiceThree = input.nextInt();

            switch (userChoiceThree) {
                case 1:
                    side = "Extra Rice";
                    total = total + 2;
                    break;
                case 2:
                    side = "Chicken Egg Drop Soup";
                    total = total + 3;
                    break;
                case 3:
                    side = "Small Stir Fry";
                    total = total + 4;
                    break;
                case 4:
                    side = "No side";
                    break;
            }
        } else {
            side = "No side";
        }

        System.out.println("Finally, dessert");
        System.out.println("Would you like a dessert?(y/n)");
        String dessertWanted = input.next();

        if (dessertWanted.equalsIgnoreCase("y")) {
            System.out.println("What dessert would you like?");
            System.out.println("1 - Pumpkin Pancakes (£4)");
            System.out.println("2 - Almond Jelly (£3)");
            System.out.println("3 - Dragon's Beard Candy (£3)");
            System.out.println("4 - No longer want dessert");
            int userChoiceFour = input.nextInt();

            switch (userChoiceFour) {
                case 1:
                    dessert = "Pumpkin Pancakes";
                    total = total + 4;
                    break;
                case 2:
                    dessert = "Almond Jelly";
                    total = total + 3;
                    break;
                case 3:
                    dessert = "Dragon's Beard Candy";
                    total = total + 3;
                    break;
                case 4:
                    dessert = "No dessert";
                    break;
            }
        } else {
            dessert = "No dessert";
        }

        System.out.println("");
        System.out.println("Your order is:");
        order userOrder = new order(orderNo, starter, main, side, dessert, total);
        System.out.println(userOrder.toString());
        orders.add(userOrder);
        orderNo++;

    }

    public static void viewOrder() {
 
        if (orders.isEmpty()) {
            System.out.println("There are no orders to view");

        } else {
            System.out.println("Hi, please enter your order number");
            int orderNumber = input.nextInt();
            
            for(int i = 0; i<orders.size(); i++){
                if(orderNumber == (orders.get(i).getOrderNo())){
                    System.out.println(orders.get(i));
                }
                    
                }
            
            }
        
            


    }

}
