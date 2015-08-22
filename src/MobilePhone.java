import java.util.ArrayList;

/**
 * Created by daniel on 8/22/2015.
 */
public class MobilePhone
{
    private String myNumber;
    private ArrayList<ContactItem> myContacts;
    private ArrayList<TextMessage> inbox;
    private ArrayList<TextMessage> outbox;

    public MobilePhone()
    {
        myContacts = new ArrayList<ContactItem>();
        inbox = new ArrayList<TextMessage>();
        outbox = new ArrayList<TextMessage>();
    }

    public void setMyNumber(String myNumber)
    {
        this.myNumber = myNumber;
    }

    public String getMyNumber()
    {
        return myNumber;
    }

    public ArrayList<ContactItem> getMyContacts()
    {
        return myContacts;
    }

    public ArrayList<TextMessage> getInbox()
    {
        return inbox;
    }

    public ArrayList<TextMessage> getOutbox()
    {
        return outbox;
    }

    public void addNewContact(String name, String contactNo)
    {
        myContacts.add(new ContactItem(name, contactNo));
    }

    public void updateContact(int position, String newName, String newContactNo)
    {
        myContacts.get(position).setName(newName);
        myContacts.get(position).setContactNumber(newContactNo);
    }

    public void removeContact(int position)
    {
        myContacts.remove(position);
    }

    public void receiveSMS(String sender, String message)
    {
        inbox.add(new TextMessage(sender, message));
    }

    public void removeInboxItem(int position)
    {
        inbox.remove(position);
    }

    public void sendSMS(String sender, String message)
    {
        outbox.add(new TextMessage(sender, message));
    }

    public void removeSentItem(int position)
    {
        outbox.remove(position);
    }
}
