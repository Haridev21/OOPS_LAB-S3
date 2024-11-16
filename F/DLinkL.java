import java.io.DataInputStream;
import java.io.IOException;
class Node
{
   int data;
   Node next;
   Node prev;
/*   Node()
   {
      this.next=null;
      this.prev=null;
   }
*/
   Node(int d)
   {
      this.data=d;
      this.next=null;
      this.prev=null;
   }
}
class DoubleLL
{
//   Node head=new Node();
   Node head=null;
   DataInputStream dis=new DataInputStream(System.in);
   void InsertBegin() throws IOException
   {
      System.out.printf("Enter new element:");
      String e1=dis.readLine();
      int ele=Integer.parseInt(e1);
      Node newn=new Node(ele);  
      if(head==null)
      {
         head=newn;
      }
      else
      {
      newn.next=head;
      head.prev=newn;
      head=newn;
      }
      display();
   }
   void display()
   {
      Node curr=head;
      while(curr!=null)
      {
         System.out.printf("%d->",curr.data);
         curr=curr.next;
      }
   }
}
public class DLinkL
{
   public static void main(String[] args)
   {
      try
      {
         DataInputStream din=new DataInputStream(System.in);
      while(true)
      {
      System.out.println("Insert at beginning:");
      DoubleLL d=new DoubleLL();
      d.InsertBegin();
      System.out.printf("Continue?(yes:1,no:0)");
      String c1=din.readLine();
      int ch=Integer.parseInt(c1);
      if(ch==1)
      {
         continue;
      }
      else if (ch==0)
      {
         break;
      }
      }
      }
      catch(IOException e)
      {
         System.out.println("Exception");
      }
   }
}
