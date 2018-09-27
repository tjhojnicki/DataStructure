

/**
 * Write a description of interface ListIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ListIterator
{
    /**
     * moves the iterator past the next element
     * 
     * @return the transveres element
     */
    Object next();
    
    
    /**
     * tests if there is an element after the iterator position
     * @return true if there is an element in the next iterator position
     */
    
    
    boolean hasNext();
    
    /**
     * Adds an element before the iterator position
     * and moves the iterator past the inserted element
     * @param element- the element to add
     */
    
    
    void add(Object element);
     /**
     * removes the last transeversed element. may only be 
     * called after a call to the next element
     * @param element- the element to remove
     */
    
    
    void remove();

}
