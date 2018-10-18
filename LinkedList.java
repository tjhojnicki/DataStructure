import java.util.NoSuchElementException;
import java.util.*;

/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    private Node first;
    private int size;
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
        size=0;
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
       size++;
    
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
   /*
    * adds a new node and where the node at n links used to be and then push it to after the new node
    * @param- n- amount of links to be traversed, newElement- that data for the new node
    */
   public void set(int n, Object newElement)
   {
       Node temp= getNode(n);
       Node prev= getNode(n-1);
       Node add= new Node();
       prev.next= add;
       add.data=newElement;
       add.next=temp;
    }
    
    /*
     * returns the data of the node for the amount of links traversed
     * @param - the amount of links to be traversed
     * @return- the data of the node of n amount of links
     */
    public Object get(int n)
    {
        return getNode(n).data;
    }
    /*
     * gets the Node object of n amount of links
     * @param- the amount of linkes to be traversed
     * @return- the Node object at n traversed links
     */
    private Node getNode(int n)
    {
        int count=0;
        Node temp= first;
        while (count!=n)
        {
            count++;
            temp= temp.next;
        }
        return temp;
    }
   /*
    * checks to see if the linked list has the obj 
    * @param object that you will see if it is in the list
    * @return- boolean on if it is in there or not
    */
    public boolean contains(Object obj)
    {if(first==null){throw new NoSuchElementException();}
    else
    { Node temp=first;
      while(temp.next!=null)
      {
         if(temp.data.equals(obj))
         {
             return true;
            }
        }
      return false;
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
         size--;
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
            size++;
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
        {previous.next=position.next;
         
        }
        isAfterNext=false;
        //moves the previous one to where the removed element was previously
         position=previous;
         size--;
        }
        
    public int sizeBAD(){
        if(first == null){throw new NoSuchElementException();}
        Node temp = first;
        int count =1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        return count; 
       }
    public void reverse(){
        Stack <Node> hold = new Stack<>();
        Node temp = first;
        while(temp.next != null){
            hold.push(temp);
            temp = temp.next;
        
        }
        first  = hold.pop();
        temp = first;
        while(hold.size() !=0){
            temp.next = hold.pop();
        }    
     }
     /*
    public void reverseTheRealWay(){
        LinkedList<Object> holder = new LinkedList<>();
        Node temp = first; 
        while(first.next != null){
            holder.addFirst(removeFirst());
        }
        holder.addFirst(getFirst());
        first.data = holder.getFirst();
        temp = first;
        while(holder.getFirst() != null){
            temp.next.data = holder.removeFirst();
        
        }
    }
    */
    /**
     * Adds object to front
     * @param data the element to add
     */
    public void addFirstBADDD(Object data){
        Node newNode = new Node();
         first = newNode;
        newNode.data = data;
        newNode.next = first;
      }
      }
    
        
        
        
        
        
    }
    

