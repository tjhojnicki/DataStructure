import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class LinkedListWork
{
   public static void main(String[] args)
   {
      LinkedList words = new LinkedList(); 
       words.addLast("Aggressive");
       words.addLast("Brown");
       words.addLast("Cool");
        System.out.println(words.contains("Aggressi"));
        System.out.println(words.get(1));
      // Print all elements

      System.out.println(words);
      System.out.println("Expected: [?,?,?,?]");
   }
}
