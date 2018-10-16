

/**
 * Write a description of class testDataStruc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testDataStruc
{

    public static void main(String [] args)
    {
        LinkedList test = new LinkedList();
        
        String word = "Hi";
        String word2;
        
        test.addFirst(word);
        test.addFirst(new String("I cool"));
        
        check(test);
        //word= test.getFirst();//This returns an object
        //OLD School!!
        word2= (String)test.getFirst();
       ListIterator iter =test.listIterator();
        System.out.print(word2);
        
    
    }
    public static void check(ListIterator iter)
    {
        int count=0;
        while(iter.hasNext())
        {count++;
        }
        if(iter.size()!=count)
        {System.out.println("The hasNext method is screwed up!");
        }
        
    }
    

}

