
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Person implements CSVWriter
{
   private String name;
   
   protected Person(String name)
   {
       this.name = name;
   }
   
   public String getName()
   {
       return this.name;
   }
   
   public abstract double tax();
   
   @Override
   public String writeRow()
   {
       return this.name + ", " + tax();
    }
}
