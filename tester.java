

/**
 * Write a description of class tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] args)
    {
        LinkedListQueue q = new LinkedListQueue();
        
        q.add("tom");
        q.add("diana");
        q.add("harry");
        q. firstToLast();
        
        while (!q.empty())
        {
            System.out.println(q.remove() + " ");
        }
        
    }

}
