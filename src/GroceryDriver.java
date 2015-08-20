import java.util.Scanner;

/**
 * Created by daniel on 8/20/2015.
 */
public class GroceryDriver
{
    private static Scanner s = new Scanner(System.in);
    private static GroceryList myList = new GroceryList();

    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.print("\nEnter your choice: ");
            choice = s.nextInt();
            s.nextLine(); // clears the input stream

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print your list.");
        System.out.println("\t 2 - To add an item to your list.");
        System.out.println("\t 3 - To modify an item in your list.");
        System.out.println("\t 4 - To remove an item in your list.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addItem()
    {
        System.out.print("Please enter your grocery item: ");
        myList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Enter item no.: ");
        int itemNo = s.nextInt();
        s.nextLine(); // clears the input stream
        System.out.print("Enter new item: ");
        String newItem = s.nextLine();
        myList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void removeItem()
    {
        System.out.print("Enter item no.: ");
        myList.removeGroceryItem(s.nextInt() - 1);
    }
}
