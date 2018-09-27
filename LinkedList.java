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
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
    }
    
    
    
    
    
    class LinkedListIterator implements ListIterator
    {
        private Node position;
        private Node previous;//remove
        private boolean isAfterNext;
        
        public LinkedListIterator()
        {
            position= null;
            previous=null;
            isAfterNext= false;
            
        }
        
        public Object next()
        {
            if(!hasNext()){throw new NoSuchElementException();}
            
            previous = position; // so I can remove item
            isAfterNext= true;
            
            if(position == null)
            {
                position= first; //addresse/ref to Objects
                
            }
            else
            {
                position= position.next;
                
            }
            return position.data;
        }
        
        /**
        * tests if there is an element after the iterator position
        * @return true if there is an element in the next iterator position
        */
        public boolean hasNext()
        {if(position== null)
            {
                return first !=null;
            }
         else
            {
                return position.next!= null;
            }
            
        }
        /**
        * Adds an element before the iterator position
       * and moves the iterator past the inserted element
       * @param element- the element to add
       */
      public void add(Object element)
      {
          if(position ==null)
          {
              addFirst(element);
              position=first;
            }
            else
            {
                Node newNode= new Node();
                newNode.data= element;
                newNode.next=position.next;
                position.next= newNode;
                position= newNode;
            }
            isAfterNext=false;
        }
         /**
      * removes the last transeversed element. may only be 
      * called after a call to the next element
      * @param element- the element to remove
      */
    
    
      public void remove()
      {
        if(isAfterNext==false){ throw new IllegalStateException();}
        if(position==first)
          {removeFirst();}
        else
        {previous.next=postion.next;
         
        }
        isAfterNext=false;
        //moves the previous one to where the removed element was previously
         postion=previous;
         
        }
      }
    
        
        
        
        
        
    }
    
}
