import java.util.ArrayList;

/**
 * Created by daniel on 8/20/2015.
 */
public class ArrayListCopy {
    private static ArrayList<String> l1 = new ArrayList<String>();
    private static ArrayList<String> l2 = new ArrayList<String>();
    private static ArrayList<String> l3;
    private static ArrayList<String> l4 = new ArrayList<String>();

    public static void main(String[] args)
    {
        l1.add("one");
        l1.add("two");
        l1.add("three");
        printList(l1);

        l2.addAll(l1);
        printList(l2);

        l3 = new ArrayList<String>(l1);
        printList(l3);
    }

    public static void printList(ArrayList l)
    {
        System.out.println();
        for (int i = 0; i < l.size(); i++)
            System.out.print(l.get(i) + " ");
    }
}
