import java.util.ArrayList;

/**
 * Created by daniel on 8/20/2015.
 */
public class GroceryList
{
    private ArrayList<String> groceryList;

    public GroceryList()
    {
        groceryList = new ArrayList<String>();
    }

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
        System.out.println(item + " has been added to your grocery list.");
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list:");
        for (int i = 0; i < groceryList.size(); i++)
            System.out.println((i + 1) + ". " + groceryList.get(i));
    }

    public void modifyGroceryItem(int position, String newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position)
    {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item: " + theItem + " has been removed from your grocery list.");
    }
}
