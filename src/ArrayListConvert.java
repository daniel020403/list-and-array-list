import java.util.ArrayList;

/**
 * Created by daniel on 8/20/2015.
 */
public class ArrayListConvert
{
    private static ArrayList<String> l1 = new ArrayList<String>();

    public static void main(String[] args)
    {
        l1.add("one");
        l1.add("two");
        l1.add("three");
        printList(l1);

        String[] arr = new String[l1.size()];
        arr = l1.toArray(arr);
        printArray(arr);
    }

    public static void printList(ArrayList l)
    {
        System.out.println();
        for (int i = 0; i < l.size(); i++)
            System.out.print(l.get(i) + " ");
    }

    public static void printArray(String[] a)
    {
        System.out.println();
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
