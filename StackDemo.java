

/**
 * Write a description of class StackDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackDemo
{
    public static void main(String[] args)
    {LinkedListStack fun= new LinkedListStack();
    
    fun.push("hi");
    fun.push("dog");
    fun.push("ho");
    fun.push("bye");
    
    while(!fun.isEmpty())
    {
        System.out.println(fun.pop());
    }

}
}