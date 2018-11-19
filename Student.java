
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private String course;
    
   public Student(String name, String course)
   {
       super(name);
       this.course = course;
   }
   
   @Override
   public double tax()
   {
       return 0;
   }
   
   public String getCourse()
   {    
       return this.course;
   }
}
