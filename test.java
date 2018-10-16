

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String [] args)
    {
        CircularArrayQueue dog = new CircularArrayQueue();
        
        dog.add(1);
        dog.add(2);
        dog.add(3);
        dog.add(4);
        dog.add(5);
        
        dog.lastToFirst();
        for(int i=0;i<5;i++)
        {System.out.println(dog.remove());
        }
        
        
    }

}
