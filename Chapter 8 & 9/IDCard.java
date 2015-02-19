
public class IDCard extends Card
{
    private String id;

    public IDCard(String n, String idNumber)
    {
        super(n);
        this.id = idNumber;
    }

    public String format()
    {
        String str = "";
        str += super.format();
        str += "\nID Number: " + this.id;
        return str;
    }
    
    public boolean equals(Object otherObject)
    {
        if(this.getClass() == otherObject.getClass())
        {
            IDCard other = (IDCard) otherObject;
            return this.getName().equals(other.getName())
                   && id.equals(other.id);
        }
        return false;
    }
}
