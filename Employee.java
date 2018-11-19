
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    public Employee(String name)
    {
        super(name);
        
    }
    
    @Override
    public double tax()
    {
        return 40;
    }
    
    
}
