/**
 * Created by daniel on 8/22/2015.
 */
public class ContactItem
{
    private String name;
    private String contactNumber;

    public ContactItem(String name, String contactNumber)
    {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }
}
