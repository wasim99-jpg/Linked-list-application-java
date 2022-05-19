//exercise 2
// LinkedList definition
public class MyLinkedList{
   private Node head;
   private Node tail;
   private Node newNode;
   // use to traverse the list
  
   // Constructor: Construct an empty List 
   public MyLinkedList()
   {
      head = tail = newNode = null;
   }
    //exercise 3a)
   // Return true if the List is empty
     public boolean isEmpty()
    { return head == null; }
    //exercise 3b)
   // Return First element
   public Object getFirst()
   {
       if (isEmpty())
            return null;
       else{
           newNode = head;
           return newNode.data;
        }
    }
    //exercise 3c)
   // Return next element
     public Object getNext()
   {
         if (newNode != tail)
         {
                newNode = newNode.next;
                return newNode.data;
         }
         else
                return null;
     }
     
    // Display the content of linked list 
    public void print()
   {
       if ( isEmpty() ) {
         System.out.println( "The list is Empty ");
        // return;
      } 

      System.out.print( "The contents of the linked list is: " );

      Node current = head;

      while ( current != null ) {
         System.out.print( current.data + " " );
         current = current.next;
      }

      System.out.println( "\n" );
   }
    //exercise 3d)
   public int size()
   {
    int count = 0;
    Node current = head;
    while (current != null)
    {
        count++;
        current = current.next;
    }
    return count;
  }
 
    // Insert an Object at the front of the List
   // If List is empty, head and tail will refer to
   // the same object. Otherwise, head refers to new node.
   
   //  public void insertAtFront( Object insertItem )
   // { Write the method definition here }
   //exercise 3e)
   public void insertAtFront( Object insertItem )
   {
      
      if (isEmpty())
        head = tail = new Node(insertItem);
      else
      {
        head = new Node(insertItem,head);      
      }
   }
   //exercise 4
   //insertAtBack
   public void insertAtBack( Object insertItem )
   {
      if (isEmpty())
          head = tail = new Node(insertItem);
      else{
         tail = tail.next = new Node(insertItem);      
      }
   }
   //exercise 5
   //removefromfront
   public Object removeFromFront() 
    {    
        Object removeItem = null; 
        if (isEmpty()) 
        {    
            return removeItem; 
        } 
        removeItem = head.data; 
        if ( head == tail) 
        {    
            head = null; 
            tail = null; 
        } 
        else 
            head = head.next; 
        return removeItem;
    }
    
}
