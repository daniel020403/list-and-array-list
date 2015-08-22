/**
 * Created by daniel on 8/22/2015.
 */
public class TextMessage
{
    private String sender;
    private String message;

    public TextMessage(String sender, String message)
    {
        this.sender = sender;
        this.message = message;
    }

    public String getSender()
    {
        return sender;
    }

    public String getMessage()
    {
        return message;
    }
}
