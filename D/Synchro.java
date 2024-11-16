import java.lang.Thread;
class Number
{
//   static int num=1;
   private boolean oddOk=true; //if even number can be printed
   public synchronized void even(int num)
   {
      while(oddOk)
      {
         try
         {
            wait();
         }
         catch(Exception e)
         {
            System.out.println("Even class exception");
         }
      }
      System.out.println("Even : "+num);
      oddOk=true;
      notify();
   }
   public synchronized void odd(int num)
   {
      while(!oddOk)
      {
         try
         {
            wait();
         }
         catch(Exception e)
         {
            System.out.println("Odd class exception");
         }
      }
      System.out.println("Odd : "+num);
      oddOk=false;
      notify();
   }
}
class EvenNum extends Thread
{
   private Number n;
   private int max;
   EvenNum(Number n, int max)
   {
      this.n=n;
      this.max=max;
   }
   public void run()
   {
      for(int i=2;i<=max;i=i+2)
      {
         n.even(i);
      }
   }
}
class OddNum extends Thread
{
   private Number n;
   private int max;
   OddNum(Number n,int max)
   {
      this.n=n;
      this.max=max;
   }
   public void run()
   {
      for(int i=1;i<=max;i=i+2)
      {
         n.odd(i);
      }
   }
}
public class Synchro
{
   public static void main(String[] args)
   {
      Number numb=new Number();
      OddNum o=new OddNum(numb,20);
      EvenNum e=new EvenNum(numb,20);
      o.start();
      e.start();
   }
}
