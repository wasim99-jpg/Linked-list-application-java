
import javax.swing.*;
import java.util.Scanner;
public class Main
{
   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //a)declare MyLinkedList
        MyLinkedList studList = new MyLinkedList();
        Object o; 
        String name;
        int id;
        int sc;
        Student stud = new Student();
        System.out.print("number of student:");
        //how many student do you want to insert?
        int num = in.nextInt();
        System.out.print("\n");
        
        //b)loop for inserting data
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter name : ");
            name=in.next();
            
            System.out.print("student ID : ");
            id=in.nextInt();
            
            System.out.print("student score : ");
            sc=in.nextInt();
            
            //after inputing all the data, it will store in the stud
            stud = new Student(name,id,sc);
            //by adding insertAtBack() it will add our data at the front of the LinkedList
            studList.insertAtBack(stud);
            System.out.print("\n");

        }
        
        //c)print out student details
        System.out.print("\nstudent details : ");
        Student print = (Student)studList.getFirst();
        while(print != null)
        {
            //everytime we need to print out details from arraylist we need to use get()
            System.out.print(print.toString());
            print = (Student)studList.getNext();
        }
        
        //d)calculate total score of student
        double total=0;
        Student cal = (Student)studList.getFirst();
        while(cal != null)
        {
            total = total + cal.getScore();
            cal = (Student)studList.getNext();
        }
        System.out.print("\n");
        System.out.print("\nTotal score : "+total);
        
        //e) find and display highest score
        int highest=0;
        Student high = (Student)studList.getFirst();
        while(high != null)
        {   
            
            if(highest < high.getScore())
            {
                highest = high.getScore();
            }
            high=(Student)studList.getNext();
        }
        System.out.print("\n");
        System.out.print("\nHighest score is = " + highest);
        
        //f) count and display number of students with score > 80
        int count=0;
        String list = " ";
        Student counters = (Student)studList.getFirst();
        while(counters != null)
        {
            if(80 < counters.getScore())
            {
                count++;
                list += counters.toString();
            }
            else{
                System.out.print("\none");}
            counters = (Student)studList.getNext();
        }
        System.out.print("\n");
        System.out.print("\ncount of student score highest than 80 : "+count);
        System.out.print("\n\n");
        System.out.println("Details of student score more than 80 : " + list);
        
        //g) Display the name of student with id = 123456. Display an appropriate message if the id
        //is not found.
        String nama=" ";
        Student display = (Student)studList.getFirst();
        while(display != null)
        {
            if(stud.getID()==123456)
            {
                nama = display.getName();
                System.out.print("\nthe name student with id = 123456 : "+ nama);
            }
            else
                System.out.print("there is no student that ID 123456");
            display = (Student)studList.getNext();
        }
        
    }
}
        
    

