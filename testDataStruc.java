

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
        
        //word= test.getFirst();//This returns an object
        //OLD School!!
        word2= (String)test.getFirst();
        
        System.out.print(word2);
    
    }

}
