package Day11;

import java.util.Scanner;

public class ShopInventory {
    public static void main(String[] args) {
        buyingInventory();
        theBill();
        discountedInventory();
    }

    private static void discountedInventory() {
        Scanner name = new Scanner(System.in);
        System.out.println("what is your name? :");
        String inputName = name.nextLine();
        if (inputName.equals("nunya")) {
            System.out.println("Please enter the number of the item you want to add to your shopping cart. " +
                    "\nWhen you are done adding items, just press enter.");
            float price = (float) (addItem()) / 2;
            System.out.println("please pay us " + price + " gold");
        } else {
            System.out.println("Please enter the number of the item you want to add to your shopping cart. " +
                    "\nWhen you are done adding items, just press enter.");
            int price = addItem();
            System.out.println("please pay us " + price + " gold");
        }
    }

    private static void theBill() {
        System.out.println("Please enter the number of the item you want to add to your shopping cart. " +
                "\nWhen you are done adding items, just press enter.");
        int price = addItem();
        System.out.println("please pay us " + price + " gold");
    }

    static int addItem() {
        Scanner buyItems = new Scanner(System.in);
        int itemAdd = buyItems.nextInt();
        int cost = 0;
        switch (itemAdd) {
            case 1 -> {
                System.out.println("Added rope to cart!");
                cost += (10);
            }
            case 2 -> {
                System.out.println("Added torches to cart!");
                cost += (15);
            }
            case 3 -> {
                System.out.println("Added climbing equipment to cart!");
                cost += (25);
            }
            case 4 -> {
                System.out.println("Added clean water to cart!");
                cost += (1);
            }
            case 5 -> {
                System.out.println("Added machete to cart!");
                cost += (25);
            }
            case 6 -> {
                System.out.println("Added canoe to cart!");
                cost += (200);
            }
            case 7 -> {
                System.out.println("Added food supplies to cart!");
                cost += (1);
            }
            default ->
                System.out.println("okay bye!");

        }
        return cost;
    }

    private static void buyingInventory() {
        System.out.println("Welcome to the shop! We have the following items:");
        theInventory();
        System.out.println("Please select which option you would like to buy!" +
                "\nType \"x\" to exit this menu.");
        pickYourItem();
    }

    private static void theInventory() {
        System.out.println("""
                \t1. Rope
                \t2. Torches
                \t3. Climbing Equipment
                \t4. Clean Water
                \t5. Machete
                \t6. Canoe
                \t7. Food Supplies
                :""");
    }

    private static void pickYourItem() {
        Scanner shopitems = new Scanner(System.in);
        String itemPick = shopitems.nextLine();
        switch (itemPick) {
            case "1" -> {
                System.out.println("The rope costs 10 gold.");
                pickYourItem();
            }
            case "2" -> {
                System.out.println("The torches cost 15 gold, but you get two!");
                pickYourItem();
            }
            case "3" -> {
                System.out.println("The climbing equipment is 25 gold.");
                pickYourItem();
            }
            case "4" -> {
                System.out.println("Clean water will cost you 1 gold.");
                pickYourItem();
            }
            case "5" -> {
                System.out.println("The machete is 20 gold.");
                pickYourItem();
            }
            case "6" -> {
                System.out.println("The canoe is worth 200 gold. ");
                pickYourItem();
            }
            case "7" -> {
                System.out.println("Food supplies for a week are 1 gold.");
                pickYourItem();
            }
            default -> System.out.println("okay bye!");
        }

    }
}
