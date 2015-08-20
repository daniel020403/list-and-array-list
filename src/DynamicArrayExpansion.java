import java.util.Scanner;

public class DynamicArrayExpansion
{
    private static Scanner s = new Scanner(System.in);
    private static int[] arr = new int[10];

    public static void main(String[] args)
    {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray();
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        printArray();
    }

    private static void getInput()
    {
        for(int i = 0; i < arr.length; i++)
            arr[i] = s.nextInt();
    }

    private static void printArray()
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray()
    {
        int[] original = arr;

        arr = new int[12];
        for (int i = 0; i < 10; i++)
            arr[i] = original[i];
        original = null;
    }
}
