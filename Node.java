/* The implementation of a linked list
 * Reference: Java: How To Program (Deitel & Deitel)
 * author : muhd wasim
 */

//exercise 1
// Node definition
class Node {
   // package access data so class List can access it directly
   Object data;    
   Node next;
   int score;

   // Constructor: Create a Node that refers to Object o.
   Node( Object obj ) 
   { //this( o, null ); 
       data = obj;
       next = null;
   }

   // Constructor: Create a Node that refers to Object o and
   // to the next Node in the List.
   Node( Object o, Node nextNode )
   {
      data = o;         // this node refers to Object o
      next = nextNode;  // set next to refer to next
   }

   // Return a reference to the Object in this node
   Object getObject() { return data; }

   // Return the next node
   Node getNext() { return next; }
   
   
}