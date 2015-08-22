import java.util.Scanner;

/**
 * Created by daniel on 8/22/2015.
 */
public class MobilePhoneDriver
{
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone();
    private static final String myNumber = "1234567";

    public static void main(String[] args)
    {
        boolean quit = false;

        startPhone();
        printActions();
        while (!quit)
        {
            System.out.println("\nEnter action: (12 to show available actions)");
            int action = s.nextInt();
            s.nextLine(); // clears the input stream

            switch (action)
            {
                case 0:
                    System.out.println("\nshutting down ...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    System.out.println("Phone no.: " + myMobilePhone.getMyNumber());
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    printInbox();
                    break;
                case 7:
                    receiveSMS();
                    break;
                case 8:
                    removeInboxItem();
                    break;
                case 9:
                    printSentItems();
                    break;
                case 10:
                    sendSMS();
                    break;
                case 11:
                    removeSentItem();
                    break;
                case 12:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone()
    {
        System.out.println("Mobile phone starting up ...");
        for (int i = 0; i < 10; i++)
            System.out.println(".");
        System.out.println("Mobile phone started ...");
        System.out.println("setting up ...");
        myMobilePhone.setMyNumber(myNumber);
        System.out.println("mobie no. setup successfull: " + myMobilePhone.getMyNumber() + " ...");
        System.out.println("Phone ready!");
    }

    private static void printActions()
    {
        System.out.println("\nAvailable actions:\npress");
        System.out.println(
                "0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to print your number\n" +
                "3  - to add new contact\n" +
                "4  - to update contact information\n" +
                "5  - to remove contact\n" +
                "6  - to print inbox\n" +
                "7  - to receive SMS\n" +
                "8  - to remove inbox item\n" +
                "9  - to print sent items\n" +
                "10 - to send SMS\n" +
                "11 - to remove sent item\n" +
                "12 - to print available actions\n"
        );
        System.out.println("Choose your action:");
    }

    private static void printContacts()
    {
        System.out.println("Contact list:");
        for (int i = 0; i < myMobilePhone.getMyContacts().size(); i++)
            System.out.println(
                    (i + 1) + ". " +
                    myMobilePhone.getMyContacts().get(i).getName() +
                    " -> " + myMobilePhone.getMyContacts().get(i).getContactNumber()
            );
    }

    private static void addNewContact()
    {
        System.out.println("Enter contact's name: ");
        String name = s.nextLine();
        System.out.println("Enter contact's number: ");
        String number = s.nextLine();

        myMobilePhone.addNewContact(name, number);
        System.out.println(
                "New contact added:\n" +
                "\t" + name + " -> " + number
        );
    }

    private static void updateContact()
    {
        System.out.print("Enter contact item no.: ");
        int position = s.nextInt();
        s.nextLine(); // clears the input stream
        System.out.print("Enter new contact name: ");
        String name = s.nextLine();
        System.out.print("Enter new contact no.: ");
        String number = s.nextLine();
        myMobilePhone.updateContact(position - 1, name, number);
        System.out.println("Contact [" + position + "] has been updated to: " + name + " -> " + number);
    }

    private static void removeContact()
    {
        System.out.print("Enter contact item no.: ");
        int position = s.nextInt();
        System.out.println("The following contact has been removed:\n" +
                        "\t" + myMobilePhone.getMyContacts().get(position - 1).getName() + " -> " +
                        myMobilePhone.getMyContacts().get(position - 1).getContactNumber()
        );
        myMobilePhone.removeContact(position - 1);
    }

    private static void printInbox()
    {
        System.out.println("Inbox [" + myMobilePhone.getInbox().size() + "]:\n");
        for (int i = 0; i < myMobilePhone.getInbox().size(); i++)
        {
            System.out.println("Inbox item " + (i + 1));
            printTextMessage(myMobilePhone.getInbox().get(i));
            System.out.println();
        }
    }

    private static void printTextMessage(TextMessage textMessage)
    {
        System.out.println(
                "\tsender: " + textMessage.getSender() + "\n" +
                "\t message:\n" +
                "\t\t" + textMessage.getMessage() + "\n"
        );
    }

    private static void receiveSMS()
    {
        System.out.print("Enter sender: ");
        String sender = s.nextLine();
        System.out.print("Enter message: ");
        String msg = s.nextLine();
        myMobilePhone.receiveSMS(sender, msg);
        System.out.println("Incoming SMS received!");
    }

    private static void removeInboxItem()
    {
        System.out.print("Enter inbox item no.: ");
        int position = s.nextInt();
        s.nextLine(); // clears the input stream
        myMobilePhone.removeInboxItem(position - 1);
        System.out.println("Inbox item [" + position + "] has been removed.");
    }

    private static void printSentItems()
    {
        System.out.println("Sent items [" + myMobilePhone.getOutbox().size() + "]:\n");
        for (int i = 0; i < myMobilePhone.getOutbox().size(); i++)
        {
            System.out.println("Sent item " + (i + 1));
            printTextMessage(myMobilePhone.getOutbox().get(i));
            System.out.println();
        }
    }

    private static void sendSMS()
    {
        System.out.println("Sender: " + myMobilePhone.getMyNumber());
        System.out.println("Enter message:");
        String msg = s.nextLine();
        myMobilePhone.sendSMS(myMobilePhone.getMyNumber(), msg);
        System.out.println("Message sent!");
    }

    private static void removeSentItem()
    {
        System.out.print("Enter sent item no.: ");
        int position = s.nextInt();
        s.nextLine(); // clears the input stream
        myMobilePhone.removeSentItem(position - 1);
        System.out.println("Sent item [" + position + "] has been removed.");
    }
}
