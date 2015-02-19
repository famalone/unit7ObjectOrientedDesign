import java.util.Calendar;
import java.util.GregorianCalendar;
public class DriverLicense extends Card
{
    private String expireYear;
    
    public DriverLicense(String n, String expireYear)
    {
        super(n);
        this.expireYear = expireYear;
    }

    public String format()
    {
        String str = "";
        str += super.format();
        str += "\nExpire Year: " + this.expireYear;
        return str;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        if( Integer.parseInt(expireYear) < year)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean equals(Object otherObject)
    {
        if(this.getClass() == otherObject.getClass())
        {
            DriverLicense other = (DriverLicense) otherObject;
            return this.getName().equals(other.getName())
                   && expireYear.equals(other.expireYear);
        }
        return false;
    }
}
