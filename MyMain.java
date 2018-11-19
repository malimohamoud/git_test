
/**
 * Write a description of class MyMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMain
{
    public static void main(String[] args)
    {
        Person p = new Student("Mo", "SP2");
        
        System.out.println(p.getName());
        System.out.println(p.tax());
        
        Person e = new Employee("Nicky");
        
        System.out.println(e.getName());
        System.out.println(e.tax());
        
        // You cannot create an instance of abstract class (constractor)
        // Person s = new Person("Mohamed");
        
        // System.out.println(s.getName());
        // System.out.println(s.tax());
        
        
        CSVWriter c = new Student("Mo", "SP2");
        
        System.out.println(c.writeRow());
       
        CSVWriter t = new Ticket("First Class Ticket", 20.00);
        
        System.out.println(t.writeRow());
        
    }
    
}
