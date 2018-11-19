
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket implements CSVWriter
{
    private String type;
    private double price;
    
    public Ticket(String type, double price)
    {
        this.type = type;
        this.price = price;
    }
    
    public String getType()
    {
        return this.type;
    }
    
      public double getPrice()
    {
        return this.price;
    }
    
    @Override
    public String writeRow()
    {
        return this.type + "," + this.price;
    }
}
