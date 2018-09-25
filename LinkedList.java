import java.util.NoSuchElementException;

/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    private Node first;
    class Node
    {
        //OLD school
        //any object in and out of LL
        //cast to object as we remove
        public Object data;
        public Node next;
    }
    public LinkedList(){
        first= null;
    }
    /**
     * Adds an element in the front of the linked list
     * @param element- the element to add
     */
    public void addFirst(Object element)
    {
        Node newNode = new Node();
       newNode.data= element;
       newNode.next= first;
       first= newNode;
    
    }
   /**
     * returns the first element of the LL
     * @return the first element of the LL
     */
    public Object getFirst()
    {
        if(first==null){throw new NoSuchElementException();}
        else
        {return first.data;
        }
        
    }
    
    /**
     * remove the first element of the LL
     * @return the first element of the LL
     */
    public Object removeFirst()
    {if(first==null){throw new NoSuchElementException();}
        else
        {Object data=first.data;
         first=first.next;
         return data;
        }
        
    }
    
}
